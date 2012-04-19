package org.exoplatform.selenium;

import junit.framework.TestCase;
import com.thoughtworks.selenium.*;
public class Test_SNF_ECMS_29_AddLanguage extends SeleneseTestCase {
public String speed = "100";
public String timeout = "30000";
public int timeoutSecInt = 30;
public String browser = "firefox";
public String host = "localhost";
public String hostPort = "8080";
public void setSpeed() {
  selenium.setSpeed(speed);
}

public void setUp() throws Exception {
  browser = System.getProperty("selenium.browser", browser);
  timeout = System.getProperty("selenium.timeout", timeout);
  timeoutSecInt = Integer.parseInt(timeout)/1000;
  speed = System.getProperty("selenium.speed", speed);
  host = System.getProperty("selenium.host", host);
  hostPort = System.getProperty("selenium.host.port", hostPort);
  super.setUp("http://" + host + ":" + hostPort + "/portal/", "*" + browser);
}

public void testSNF_ECMS_29_AddLanguage() throws Exception {
  setSpeed();

  //1: open | /portal/public/acme/ | 
selenium.open("/portal/public/acme/");

  //2: windowMaximize |  | 
selenium.windowMaximize();

  //3: echo | * Log in | 
System.out.println("* Log in");

  //4: waitForElementPresent | link=Login | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=Login")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //5: click | link=Login | 
selenium.click("link=Login");

  //6: waitForElementPresent | username | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("username")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //7: type | username | root
selenium.type("username", "root");

  //8: type | password | gtn
selenium.type("password", "gtn");

  //9: waitForElementPresent | link=Sign in | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=Sign in")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //10: clickAndWait | link=Sign in | 
selenium.click("link=Sign in");
selenium.waitForPageToLoad(timeout);

  //11: echo | * Create Article in  Sites management/ acme | 
System.out.println("* Create Article in  Sites management/ acme");

  //12: echo | -- Go to Site Explorer | 
System.out.println("-- Go to Site Explorer");

  //13: waitForElementPresent | link=Sites Explorer | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=Sites Explorer")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //14: clickAndWait | link=Sites Explorer | 
selenium.click("link=Sites Explorer");
selenium.waitForPageToLoad(timeout);

  //15: echo | -- Click Show Drives | 
System.out.println("-- Click Show Drives");

  //16: waitForElementPresent | //a[@title= 'Show Drives'] | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("//a[@title= 'Show Drives']")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //17: click | //a[@title= 'Show Drives'] | 
selenium.click("//a[@title= 'Show Drives']");

  //18: echo | -- Choose link=Sites Management | 
System.out.println("-- Choose link=Sites Management");

  //19: waitForElementPresent | link=Sites Management | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=Sites Management")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //20: click | link=Sites Management | 
selenium.click("link=Sites Management");

  //21: echo | -- Choose acme | 
System.out.println("-- Choose acme");

  //22: waitForElementPresent | css=a[title=\"acme \"] | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("css=a[title=\"acme \"]")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //23: click | css=a[title=\"acme \"] | 
selenium.click("css=a[title=\"acme \"]");

  //24: echo | -- Click Add Content | 
System.out.println("-- Click Add Content");

  //25: waitForElementPresent | link=New Content | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=New Content")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //26: click | link=New Content | 
selenium.click("link=New Content");

  //27: pause | 2000 | 
Thread.sleep(2000);

  //28: echo | -- Choose Article template | 
System.out.println("-- Choose Article template");

  //29: waitForElementPresent | //div[@title='Article'] | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("//div[@title='Article']")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //30: click | //div[@title='Article'] | 
selenium.click("//div[@title='Article']");

  //31: waitForElementPresent | id=title | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("id=title")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //32: click | id=title | 
selenium.click("id=title");

  //33: waitForElementPresent | id=title | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("id=title")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //34: type | id=title | Test_SNF_ECMS_29_En
selenium.type("id=title", "Test_SNF_ECMS_29_En");

  //35: waitForElementPresent | id=name | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("id=name")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //36: type | id=name | Test_SNF_ECMS_29_En
selenium.type("id=name", "Test_SNF_ECMS_29_En");

  //37: waitForElementPresent | //td[@id='cke_contents_summary']/iframe | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("//td[@id='cke_contents_summary']/iframe")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //38: selectFrame | //td[@id='cke_contents_summary']/iframe | 
selenium.selectFrame("//td[@id='cke_contents_summary']/iframe");

  //39: type | //html/body | Summary in English
selenium.type("//html/body", "Summary in English");

  //40: selectFrame | relative=top | 
selenium.selectFrame("relative=top");

  //41: waitForElementPresent | //td[@id='cke_contents_content']/iframe | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("//td[@id='cke_contents_content']/iframe")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //42: selectFrame | //td[@id='cke_contents_content']/iframe | 
selenium.selectFrame("//td[@id='cke_contents_content']/iframe");

  //43: type | //html/body | Content in English
selenium.type("//html/body", "Content in English");

  //44: selectFrame | relative=top | 
selenium.selectFrame("relative=top");

  //45: waitForElementPresent | link=Save & Close | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=Save & Close")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //46: click | link=Save & Close | 
selenium.click("link=Save & Close");

  //47: pause | 3000 | 
Thread.sleep(3000);

  //48: echo | -- Go to Collaboration tab | 
System.out.println("-- Go to Collaboration tab");

  //49: waitForElementPresent | link=Collaboration | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=Collaboration")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //50: click | link=Collaboration | 
selenium.click("link=Collaboration");

  //51: echo | -- Click Add/ Edit Localised Contents on action bar | 
System.out.println("-- Click Add/ Edit Localised Contents on action bar");

  //52: waitForElementPresent | link=Add/Edit Localised Content | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=Add/Edit Localised Content")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //53: click | link=Add/Edit Localised Content | 
selenium.click("link=Add/Edit Localised Content");

  //54: echo | -- Select Add Language tab | 
System.out.println("-- Select Add Language tab");

  //55: waitForElementPresent | //div[@class='NormalTab']/div/div/div/ | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("//div[@class='NormalTab']/div/div/div/")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //56: click | //div[@class='NormalTab']/div/div/div/ | 
selenium.click("//div[@class='NormalTab']/div/div/div/");

  //57: echo | -- Choose Language: French | 
System.out.println("-- Choose Language: French");

  //58: waitForElementPresent | name=typeLang | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("name=typeLang")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //59: select | name=typeLang | label=French
selenium.select("name=typeLang", "label=French");

  //60: echo | -- Fill title for new language | 
System.out.println("-- Fill title for new language");

  //61: waitForElementPresent | id=title | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("id=title")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //62: type | id=title | Test_SNF_ECMS_29_FR
selenium.type("id=title", "Test_SNF_ECMS_29_FR");

  //63: echo | -- Edit content | 
System.out.println("-- Edit content");

  //64: waitForElementPresent | //td[@id='cke_contents_summary']/iframe | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("//td[@id='cke_contents_summary']/iframe")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //65: selectFrame | //td[@id='cke_contents_summary']/iframe | 
selenium.selectFrame("//td[@id='cke_contents_summary']/iframe");

  //66: type | //html/body | Summary in French
selenium.type("//html/body", "Summary in French");

  //67: selectFrame | relative=top | 
selenium.selectFrame("relative=top");

  //68: waitForElementPresent | //td[@id='cke_contents_content']/iframe | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("//td[@id='cke_contents_content']/iframe")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //69: selectFrame | //td[@id='cke_contents_content']/iframe | 
selenium.selectFrame("//td[@id='cke_contents_content']/iframe");

  //70: type | //html/body | Content in French
selenium.type("//html/body", "Content in French");

  //71: selectFrame | relative=top | 
selenium.selectFrame("relative=top");

  //72: echo | -- Save | 
System.out.println("-- Save");

  //73: waitForElementPresent | link=Save | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=Save")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //74: click | link=Save | 
selenium.click("link=Save");

  //75: echo | -- Go to View language Tab | 
System.out.println("-- Go to View language Tab");

  //76: echo | -- Choose Language | 
System.out.println("-- Choose Language");

  //77: pause | 3000 | 
Thread.sleep(3000);

  //78: waitForElementPresent | name=languages | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("name=languages")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //79: select | name=languages | label=French
selenium.select("name=languages", "label=French");

  //80: echo | -- Click View | 
System.out.println("-- Click View");

  //81: waitForElementPresent | link=View | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=View")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //82: click | link=View | 
selenium.click("link=View");

  //83: echo | -- Verify Article is in French | 
System.out.println("-- Verify Article is in French");

  //84: waitForTextPresent | Summary in French | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForTextPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isTextPresent("Summary in French")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //85: verifyTextPresent | Summary in French | 
TestCase.assertTrue(selenium.isTextPresent("Summary in French"));

  //86: waitForTextPresent | Content in French | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForTextPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isTextPresent("Content in French")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //87: verifyTextPresent | Content in French | 
TestCase.assertTrue(selenium.isTextPresent("Content in French"));

  //88: echo | -- Click Add/ Edit Localised Contents, choose English default | 
System.out.println("-- Click Add/ Edit Localised Contents, choose English default");

  //89: waitForElementPresent | link=Add/Edit Localised Contents | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=Add/Edit Localised Contents")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //90: click | link=Add/Edit Localised Contents | 
selenium.click("link=Add/Edit Localised Contents");

  //91: waitForElementPresent | link=View | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=View")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //92: click | link=View | 
selenium.click("link=View");

  //93: echo | -- Verify Article is in English | 
System.out.println("-- Verify Article is in English");

  //94: waitForTextPresent | Summary in English | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForTextPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isTextPresent("Summary in English")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //95: verifyTextPresent | Summary in English | 
TestCase.assertTrue(selenium.isTextPresent("Summary in English"));

  //96: waitForTextPresent | Content in English | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForTextPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isTextPresent("Content in English")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //97: verifyTextPresent | Content in English | 
TestCase.assertTrue(selenium.isTextPresent("Content in English"));

  //98: echo | -- Delete document | 
System.out.println("-- Delete document");

  //99: waitForElementPresent | link=Test_SNF_ECMS_29_En | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=Test_SNF_ECMS_29_En")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //100: mouseDownRight | link=Test_SNF_ECMS_29_En | 
selenium.mouseDownRight("link=Test_SNF_ECMS_29_En");

  //101: waitForElementPresent | link=Delete | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=Delete")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //102: click | link=Delete | 
selenium.click("link=Delete");

  //103: waitForElementPresent | link=OK | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=OK")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //104: click | link=OK | 
selenium.click("link=OK");

  //105: echo | -- Log out | 
System.out.println("-- Log out");

  //106: waitForElementPresent | link=Logout | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=Logout")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //107: clickAndWait | link=Logout | 
selenium.click("link=Logout");
selenium.waitForPageToLoad(timeout);
}

}
