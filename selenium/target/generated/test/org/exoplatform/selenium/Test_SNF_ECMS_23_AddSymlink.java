package org.exoplatform.selenium;

import junit.framework.TestCase;
import com.thoughtworks.selenium.*;
public class Test_SNF_ECMS_23_AddSymlink extends SeleneseTestCase {
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

public void testSNF_ECMS_23_AddSymlink() throws Exception {
  setSpeed();

  //1: open | /portal/public/acme/ | 
selenium.open("/portal/public/acme/");

  //2: windowMaximize |  | 
selenium.windowMaximize();

  //3: echo | -- Login | 
System.out.println("-- Login");

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

  //11: echo | -- Go to Sites Explorer | 
System.out.println("-- Go to Sites Explorer");

  //12: waitForElementPresent | link=Sites Explorer | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=Sites Explorer")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //13: clickAndWait | link=Sites Explorer | 
selenium.click("link=Sites Explorer");
selenium.waitForPageToLoad(timeout);

  //14: echo | -- Click Show Drives | 
System.out.println("-- Click Show Drives");

  //15: waitForElementPresent | //a[@title= 'Show Drives'] | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("//a[@title= 'Show Drives']")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //16: click | //a[@title= 'Show Drives'] | 
selenium.click("//a[@title= 'Show Drives']");

  //17: echo | -- Choose Sites Management | 
System.out.println("-- Choose Sites Management");

  //18: waitForElementPresent | link=Sites Management | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=Sites Management")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //19: click | link=Sites Management | 
selenium.click("link=Sites Management");

  //20: echo | -- Add new folder | 
System.out.println("-- Add new folder");

  //21: waitForElementPresent | link=New Folder | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=New Folder")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //22: click | link=New Folder | 
selenium.click("link=New Folder");

  //23: waitForElementPresent | id=title | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("id=title")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //24: type | id=title | Test_SNF_ECMS_23
selenium.type("id=title", "Test_SNF_ECMS_23");

  //25: waitForElementPresent | id=name | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("id=name")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //26: type | id=name | Test_SNF_ECMS_23
selenium.type("id=name", "Test_SNF_ECMS_23");

  //27: echo | -- Click Save | 
System.out.println("-- Click Save");

  //28: waitForElementPresent | link=Save | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=Save")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //29: click | link=Save | 
selenium.click("link=Save");

  //30: echo | -- Choose new folder | 
System.out.println("-- Choose new folder");

  //31: waitForElementPresent | link=Test_SNF_ECMS_23 | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=Test_SNF_ECMS_23")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //32: click | link=Test_SNF_ECMS_23 | 
selenium.click("link=Test_SNF_ECMS_23");

  //33: echo | -- Click Add Symlink | 
System.out.println("-- Click Add Symlink");

  //34: waitForElementPresent | //a[@title='Add Symlink'] | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("//a[@title='Add Symlink']")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //35: click | //a[@title='Add Symlink'] | 
selenium.click("//a[@title='Add Symlink']");

  //36: echo | -- Choose path node | 
System.out.println("-- Choose path node");

  //37: waitForElementPresent | //img[@title='Add Item'] | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("//img[@title='Add Item']")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //38: click | //img[@title='Add Item'] | 
selenium.click("//img[@title='Add Item']");

  //39: echo | -- Choose sites content | 
System.out.println("-- Choose sites content");

  //40: waitForElementPresent | //div[@title='sites content'] | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("//div[@title='sites content']")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //41: click | //div[@title='sites content'] | 
selenium.click("//div[@title='sites content']");

  //42: echo | -- Choose live | 
System.out.println("-- Choose live");

  //43: waitForElementPresent | //div[@title='live'] | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("//div[@title='live']")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //44: click | //div[@title='live'] | 
selenium.click("//div[@title='live']");

  //45: echo | -- Choose acme | 
System.out.println("-- Choose acme");

  //46: waitForElementPresent | //div[@title='acme'] | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("//div[@title='acme']")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //47: click | //div[@title='acme'] | 
selenium.click("//div[@title='acme']");

  //48: echo | -- Choose documents | 
System.out.println("-- Choose documents");

  //49: waitForElementPresent | //div[@id='UISelectPathPanel']/table/tbody/tr[4]/td[2]/a/div | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("//div[@id='UISelectPathPanel']/table/tbody/tr[4]/td[2]/a/div")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //50: click | //div[@id='UISelectPathPanel']/table/tbody/tr[4]/td[2]/a/div | 
selenium.click("//div[@id='UISelectPathPanel']/table/tbody/tr[4]/td[2]/a/div");

  //51: echo | -- Fill Symlink Name | 
System.out.println("-- Fill Symlink Name");

  //52: waitForElementPresent | id=symLinkName | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("id=symLinkName")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //53: type | id=symLinkName | Documents.lnk
selenium.type("id=symLinkName", "Documents.lnk");

  //54: echo | -- Click Save | 
System.out.println("-- Click Save");

  //55: waitForElementPresent | link=Save | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=Save")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //56: click | link=Save | 
selenium.click("link=Save");

  //57: pause | 3000 | 
Thread.sleep(3000);

  //58: echo | -- Verify link | 
System.out.println("-- Verify link");

  //59: waitForElementPresent | link=Documents.lnk | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=Documents.lnk")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //60: verifyElementPresent | link=Documents.lnk | 
TestCase.assertTrue(selenium.isElementPresent("link=Documents.lnk"));

  //61: pause | 3000 | 
Thread.sleep(3000);

  //62: echo | -- Delete folder | 
System.out.println("-- Delete folder");

  //63: waitForElementPresent | link=Test_SNF_ECMS_23 | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=Test_SNF_ECMS_23")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //64: mouseDownRight | link=Test_SNF_ECMS_23 | 
selenium.mouseDownRight("link=Test_SNF_ECMS_23");

  //65: waitForElementPresent | link=Delete | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=Delete")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //66: click | link=Delete | 
selenium.click("link=Delete");

  //67: waitForElementPresent | link=OK | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=OK")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //68: click | link=OK | 
selenium.click("link=OK");

  //69: pause | 3000 | 
Thread.sleep(3000);

  //70: echo | -- Verify folder is deleted | 
System.out.println("-- Verify folder is deleted");

  //71: waitForTextNotPresent | link=Test_SNF_ECMS_23 | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForTextNotPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (!selenium.isTextPresent("link=Test_SNF_ECMS_23")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //72: verifyTextNotPresent | link=Test_SNF_ECMS_23 | 
TestCase.assertFalse(selenium.isTextPresent("link=Test_SNF_ECMS_23"));

  //73: echo | -- Logout | 
System.out.println("-- Logout");

  //74: waitForElementPresent | link=Logout | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=Logout")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //75: clickAndWait | link=Logout | 
selenium.click("link=Logout");
selenium.waitForPageToLoad(timeout);
}

}
