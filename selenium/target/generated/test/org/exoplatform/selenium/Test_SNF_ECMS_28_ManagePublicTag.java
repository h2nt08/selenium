package org.exoplatform.selenium;

import junit.framework.TestCase;
import com.thoughtworks.selenium.*;
public class Test_SNF_ECMS_28_ManagePublicTag extends SeleneseTestCase {
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

public void testSNF_ECMS_28_ManagePublicTag() throws Exception {
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

  //27: echo | -- Choose Article template | 
System.out.println("-- Choose Article template");

  //28: waitForElementPresent | //div[@title='Article'] | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("//div[@title='Article']")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //29: click | //div[@title='Article'] | 
selenium.click("//div[@title='Article']");

  //30: waitForElementPresent | id=title | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("id=title")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //31: click | id=title | 
selenium.click("id=title");

  //32: waitForElementPresent | id=title | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("id=title")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //33: type | id=title | Test_SNF_ECMS_28
selenium.type("id=title", "Test_SNF_ECMS_28");

  //34: waitForElementPresent | id=name | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("id=name")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //35: type | id=name | Test_SNF_ECMS_28
selenium.type("id=name", "Test_SNF_ECMS_28");

  //36: waitForElementPresent | //td[@id='cke_contents_summary']/iframe | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("//td[@id='cke_contents_summary']/iframe")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //37: selectFrame | //td[@id='cke_contents_summary']/iframe | 
selenium.selectFrame("//td[@id='cke_contents_summary']/iframe");

  //38: type | //html/body | Summary in Test_SNF_ECMS_28
selenium.type("//html/body", "Summary in Test_SNF_ECMS_28");

  //39: selectFrame | relative=top | 
selenium.selectFrame("relative=top");

  //40: waitForElementPresent | //td[@id='cke_contents_content']/iframe | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("//td[@id='cke_contents_content']/iframe")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //41: selectFrame | //td[@id='cke_contents_content']/iframe | 
selenium.selectFrame("//td[@id='cke_contents_content']/iframe");

  //42: type | //html/body | Main content in Test_SNF_ECMS_28
selenium.type("//html/body", "Main content in Test_SNF_ECMS_28");

  //43: selectFrame | relative=top | 
selenium.selectFrame("relative=top");

  //44: waitForElementPresent | link=Save & Close | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=Save & Close")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //45: click | link=Save & Close | 
selenium.click("link=Save & Close");

  //46: pause | 3000 | 
Thread.sleep(3000);

  //47: echo | -- Go to Collaboration tab | 
System.out.println("-- Go to Collaboration tab");

  //48: waitForElementPresent | link=Collaboration | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=Collaboration")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //49: click | link=Collaboration | 
selenium.click("link=Collaboration");

  //50: echo | -- Click Tag Document on action bar | 
System.out.println("-- Click Tag Document on action bar");

  //51: waitForElementPresent | link=Tag | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=Tag")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //52: click | link=Tag | 
selenium.click("link=Tag");

  //53: echo | -- Fill Tag name | 
System.out.println("-- Fill Tag name");

  //54: waitForElementPresent | id=names | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("id=names")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //55: type | id=names | Public
selenium.type("id=names", "Public");

  //56: echo | -- Choose Tag Scope as Public | 
System.out.println("-- Choose Tag Scope as Public");

  //57: waitForElementPresent | name=tagScopes | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("name=tagScopes")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //58: select | name=tagScopes | label=Public
selenium.select("name=tagScopes", "label=Public");

  //59: echo | -- Click Add Tag | 
System.out.println("-- Click Add Tag");

  //60: waitForElementPresent | link=Add Tags | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=Add Tags")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //61: click | link=Add Tags | 
selenium.click("link=Add Tags");

  //62: echo | -- Click Close | 
System.out.println("-- Click Close");

  //63: waitForElementPresent | link=Close | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=Close")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //64: click | link=Close | 
selenium.click("link=Close");

  //65: echo | -- Go to Tag cloud | 
System.out.println("-- Go to Tag cloud");

  //66: waitForElementPresent | //div[@id='UISideBar']/div/div/div[3]/div[4]/div | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("//div[@id='UISideBar']/div/div/div[3]/div[4]/div")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //67: click | //div[@id='UISideBar']/div/div/div[3]/div[4]/div | 
selenium.click("//div[@id='UISideBar']/div/div/div[3]/div[4]/div");

  //68: echo | -- Open edit tag form | 
System.out.println("-- Open edit tag form");

  //69: waitForElementPresent | //div[@title='Edit Public Tags'] | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("//div[@title='Edit Public Tags']")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //70: click | //div[@title='Edit Public Tags'] | 
selenium.click("//div[@title='Edit Public Tags']");

  //71: echo | -- Edit Tag | 
System.out.println("-- Edit Tag");

  //72: waitForElementPresent | //img[@title='Edit Tag'] | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("//img[@title='Edit Tag']")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //73: click | //img[@title='Edit Tag'] | 
selenium.click("//img[@title='Edit Tag']");

  //74: echo | -- Edit Tag Name | 
System.out.println("-- Edit Tag Name");

  //75: waitForElementPresent | id=tagName | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("id=tagName")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //76: type | id=tagName | Public_Edit
selenium.type("id=tagName", "Public_Edit");

  //77: echo | -- Click Save | 
System.out.println("-- Click Save");

  //78: waitForElementPresent | link=Save | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=Save")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //79: click | link=Save | 
selenium.click("link=Save");

  //80: echo | -- Delete Tag | 
System.out.println("-- Delete Tag");

  //81: waitForElementPresent | //img[@alt='RemoveTag'] | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("//img[@alt='RemoveTag']")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //82: click | //img[@alt='RemoveTag'] | 
selenium.click("//img[@alt='RemoveTag']");

  //83: assertConfirmation | Are you sure to delete this tag? | 
TestCase.assertTrue(selenium.getConfirmation().matches("^Are you sure to delete this tag[\\s\\S]$"));

  //84: echo | -- Close Edit Private Tag form | 
System.out.println("-- Close Edit Private Tag form");

  //85: waitForElementPresent | css=a.CloseButton | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("css=a.CloseButton")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //86: click | css=a.CloseButton | 
selenium.click("css=a.CloseButton");

  //87: echo | -- Go back File Explorer | 
System.out.println("-- Go back File Explorer");

  //88: waitForElementPresent | //div[@id='UISideBar']/div/div/div[3]/div/div | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("//div[@id='UISideBar']/div/div/div[3]/div/div")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //89: click | //div[@id='UISideBar']/div/div/div[3]/div/div | 
selenium.click("//div[@id='UISideBar']/div/div/div[3]/div/div");

  //90: echo | * Delete document | 
System.out.println("* Delete document");

  //91: waitForElementPresent | link=Test_SNF_ECMS_28 | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=Test_SNF_ECMS_28")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //92: mouseDownRight | link=Test_SNF_ECMS_28 | 
selenium.mouseDownRight("link=Test_SNF_ECMS_28");

  //93: waitForElementPresent | link=Delete | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=Delete")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //94: click | link=Delete | 
selenium.click("link=Delete");

  //95: waitForElementPresent | link=OK | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=OK")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //96: click | link=OK | 
selenium.click("link=OK");

  //97: echo | -- Verify Article is deleted | 
System.out.println("-- Verify Article is deleted");

  //98: waitForTextNotPresent | link=Article_Test_SNF_ECMS_28 | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForTextNotPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (!selenium.isTextPresent("link=Article_Test_SNF_ECMS_28")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //99: verifyTextNotPresent | link=Article_Test_SNF_ECMS_28 | 
TestCase.assertFalse(selenium.isTextPresent("link=Article_Test_SNF_ECMS_28"));

  //100: echo | * Log out | 
System.out.println("* Log out");

  //101: waitForElementPresent | link=Logout | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=Logout")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //102: clickAndWait | link=Logout | 
selenium.click("link=Logout");
selenium.waitForPageToLoad(timeout);
}

}
