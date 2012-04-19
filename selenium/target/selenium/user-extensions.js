//
// Default user extensions from: jar:file:/home/hainh/java/exo-dependencies/repository/org/codehaus/mojo/selenium-maven-plugin/1.0.1/selenium-maven-plugin-1.0.1.jar!/org/codehaus/mojo/selenium/default-user-extensions.js
//
/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

//
// $Id: default-user-extensions.js 4489 2007-07-01 23:49:34Z user57 $
//

//
// Incorporated from: http://wiki.openqa.org/display/SEL/removeCookie
//

function createCookie(doc, name, value, path, days) {
    if (!path) {
        path = "/";
    }

    if (days) {
        var date = new Date();
        date.setTime(date.getTime()+(days*24*60*60*1000));
        var expires = "; expires=" + date.toGMTString();
    }
    else {
        var expires = "";
    }
    
    doc.cookie = name + "=" + value + expires + "; path=" + path;
}

/**
 * Removes the cookie with the given name.
 *  text - the cookie name
 *  path - the cookie path
 */
Selenium.prototype.removeCookie = function(text, path) {
    createCookie(this.page().currentDocument, text, "", path, -1);
};

//
// Incorporated from user-extensions.js.sample from Selenium RC 0.8.1
//

// The following examples try to give an indication of how Selenium can be extended with javascript.

/**
 * All do* methods on the Selenium prototype are added as actions.
 * Eg add a typeRepeated action to Selenium, which types the text twice into a text box.
 * The typeTwiceAndWait command will be available automatically
 */
Selenium.prototype.doTypeRepeated = function(locator, text) {
    // All locator-strategies are automatically handled by "findElement"
    var element = this.page().findElement(locator);

    // Create the text to type
    var valueToType = text + text;

    // Replace the element text with the new text
    this.page().replaceText(element, valueToType);
};

/**
 * All assert* methods on the Selenium prototype are added as checks.
 * Eg add a assertValueRepeated check, that makes sure that the element value
 * consists of the supplied text repeated.
 * The verify version will be available automatically.
 */
Selenium.prototype.assertValueRepeated = function(locator, text) {
    // All locator-strategies are automatically handled by "findElement"
    var element = this.page().findElement(locator);

    // Create the text to verify
    var expectedValue = text + text;

    // Get the actual element value
    var actualValue = element.value;

    // Make sure the actual value matches the expected
    Assert.matches(expectedValue, actualValue);
};

/**
 * All get* methods on the Selenium prototype result in
 * store, assert, assertNot, verify, verifyNot, waitFor, and waitForNot commands.
 * E.g. add a getTextLength method that returns the length of the text
 * of a specified element.
 * Will result in support for storeTextLength, assertTextLength, etc.
 */
Selenium.prototype.getTextLength = function(locator) {
	return this.getText(locator).length;
};

/**
 * All locateElementBy* methods are added as locator-strategies.
 * Eg add a "valuerepeated=" locator, that finds the first element with the supplied value, repeated.
 * The "inDocument" is a the document you are searching.
 */
PageBot.prototype.locateElementByValueRepeated = function(text, inDocument) {
    // Create the text to search for
    var expectedValue = text + text;

    // Loop through all elements, looking for ones that have a value === our expected value
    var allElements = inDocument.getElementsByTagName("*");
    for (var i = 0; i < allElements.length; i++) {
        var testElement = allElements[i];
        if (testElement.value && testElement.value === expectedValue) {
            return testElement;
        }
    }
    return null;
};

//
// User extensions from: file:/home/hainh/workspace/selenium/selenium/target/selenium/user-extension.js
//
/***************************************************************************************************************/
/** Exo User Extensions ***/
/***************************************************************************************************************/

Selenium.prototype.doGetExoExtensionVersion = function(){
	return "1.0";
};

/**
  * This function allows to enter text in a FCK field
  * Usage:
  *  - locator  the locator that points to the parent iframe (the one that contains both the toolbar and the text area)
  *  - text     the text to enter into the field
  * Run selenium rc server from maven with the userExtension parameter. 
  * 
  * For more information see the following URL:
  * - http://mojo.codehaus.org/selenium-maven-plugin/start-server-mojo.html#userExtensions
  *
  * store in exo-int/qa/selenium
  **/ 
Selenium.prototype.doTypeFCKEditor = function(locator, text) {
	    // All locator-strategies are automatically handled by "findElement"
	    var editor = this.page().findElement(locator);
	    
	    // TODO: use contentWindow instead of contentDocument for IE
	    var innerEditor = null;
	    if (editor.contentDocument)
	    	innerEditor = editor.contentDocument.getElementsByTagName("iframe")[0];
	    else if (editor.contentWindow)
	    	innerEditor = editor.contentWindow.document.getElementsByTagName("iframe")[0];
	    
	    if (innerEditor)
	      innerEditor.contentDocument.body.innerHTML = text;
	    // Replace the element text with the new text
	    // this.page().replaceText(element, valueToType);
};

/**
  * This function allows to use a specific Contextual menu
  * Usage:
  * - Locator : Element to rightclick on
  *
  * For more information see the following URL:
  * - Manually Fire event : http://www.howtocreate.co.uk/tutorials/javascript/domevents#domevld1
  * - initMouseEvent properties : http://www.quirksmode.org/js/events_properties.html
  *
  * store in exo-int/qa/selenium
  **/ 
Selenium.prototype.doComponentExoContextMenu = function(locator){
	
	var fireOnThis = this.page().findElement(locator);
    var evObj = document.createEvent('MouseEvents');
    evObj.initMouseEvent( 'mousedown', true, true, window, 1, 12, 345, 7, 220, false, false, false, false, 2, null );
    fireOnThis.dispatchEvent(evObj);

};

/**
  * This function allows to use a specific Contextual menu
  * Usage:
  * - Locator : Element to doubleclick on
	  
  * For more information see the following URL:
  * - Manually Fire event : http://www.howtocreate.co.uk/tutorials/javascript/domevents#domevld1
  * - initMouseEvent properties : http://www.quirksmode.org/js/events_properties.html
  * 
  * store in exo-int/qa/selenium
  **/ 
Selenium.prototype.doComponentExoDoubleClick = function(locator){
	
	var fireOnThis = this.page().findElement(locator);
    var evObj = document.createEvent('MouseEvents');
    evObj.initMouseEvent('dblclick', true, true, window, 1, 12, 345, 7, 220, false, false, false, false,0, null );
    fireOnThis.dispatchEvent(evObj);

};

//-----------------write by linh_vu
Selenium.prototype.doTypeRepeated = function(locator, text) {
    // All locator-strategies are automatically handled by "findElement"
    var element = this.page().findElement(locator);

    // Create the text to type
    var valueToType = text + "__" +text;

    // Replace the element text with the new text
    this.page().replaceText(element, valueToType);
};
//--------------------------------
Selenium.prototype.doTypeRandom = function(locator,string_length) {

	var element = this.page().findElement(locator);

        var chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXTZabcdefghiklmnopqrstuvwxyz";
        var randomstring = '';
        for (var i=0; i<string_length; i++) {
            var rnum = Math.floor(Math.random() * chars.length);
            randomstring += chars.substring(rnum,rnum+1);
        }
        //return randomstring;
		var valueToType ="test-"+randomstring;

		 this.page().replaceText(element, valueToType);
    }
 //-------------------------------
 Selenium.prototype.doTypeRandomEmail = function randomString(locator,string_length) {

	var element = this.page().findElement(locator);

        var chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXTZabcdefghiklmnopqrstuvwxyz";
        var randomstring = '';
        for (var i=0; i<string_length; i++) {
            var rnum = Math.floor(Math.random() * chars.length);
            randomstring += chars.substring(rnum,rnum+1);
        }
        //return randomstring;
		var valueToType =randomstring+"@exoplatform.com";

		 this.page().replaceText(element, valueToType);
    }

/**
 * storeValue, storeText, storeAttribute and store actions now 
 * have 'global' equivalents.
 * Use storeValueGlobal, storeTextGlobal, storeAttributeGlobal or storeGlobal
 * will store the variable globally, making it available it subsequent tests.
 *
 * See the Reference.html for storeValue, storeText, storeAttribute and store
 * for the arguments you should send to the new Global functions.
 *
 * example of use
 * in testA.html:
 * +------------------+----------------------+----------------------+
 * |storeGlobal       | http://localhost/    | baseURL              |
 * +------------------+----------------------+----------------------+
 * 
 * in textB.html (executed after testA.html):
 * +------------------+-----------------------+--+
 * |open              | ${baseURL}Main.jsp    |  |
 * +------------------+-----------------------+--+
 *
 * Note: Selenium.prototype.replaceVariables from selenium-api.js has been replaced
 *       here to make it use global variables if no local variable is found.
 *       This might cause issues if you upgraded Selenium in the future and this function 
 *       has been changed.
 *
 * @author Guillaume Boudreau
 */
 
globalStoredVars = new Object();

/*
 * Globally store the value of a form input in a variable
 */
Selenium.prototype.doStoreValueGlobal = function(target, varName) {
    if (!varName) {
        // Backward compatibility mode: read the ENTIRE text of the page
        // and stores it in a variable with the name of the target
        value = this.page().bodyText();
        globalStoredVars[target] = value;
        return;
    }
    var element = this.page().findElement(target);
    globalStoredVars[varName] = getInputValue(element);
};

/*
 * Globally store the text of an element in a variable
 */
Selenium.prototype.doStoreTextGlobal = function(target, varName) {
    var element = this.page().findElement(target);
    globalStoredVars[varName] = getText(element);
};

/*
 * Globally store the value of an element attribute in a variable
 */
Selenium.prototype.doStoreAttributeGlobal = function(target, varName) {
    globalStoredVars[varName] = this.page().findAttribute(target);
};

/*
 * Globally store the result of a literal value
 */
Selenium.prototype.doStoreGlobal = function(value, varName) {
    globalStoredVars[varName] = value;
};

/*
 * Search through str and replace all variable references ${varName} with their
 * value in storedVars (or globalStoredVars).
 */
Selenium.prototype.replaceVariables = function(str) {
    var stringResult = str;

    // Find all of the matching variable references
    var match = stringResult.match(/\$\{\w+\}/g);
    if (!match) {
        return stringResult;
    }

    // For each match, lookup the variable value, and replace if found
    for (var i = 0; match && i < match.length; i++) {
        var variable = match[i]; // The replacement variable, with ${}
        var name = variable.substring(2, variable.length - 1); // The replacement variable without ${}
        var replacement = storedVars[name];
        if (replacement != undefined) {
            stringResult = stringResult.replace(variable, replacement);
        }
        var replacement = globalStoredVars[name];
        if (replacement != undefined) {
            stringResult = stringResult.replace(variable, replacement);
        }
    }
    return stringResult;
};
