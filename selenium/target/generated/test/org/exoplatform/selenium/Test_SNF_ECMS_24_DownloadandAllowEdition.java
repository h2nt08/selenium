package org.exoplatform.selenium;

import junit.framework.TestCase;
import com.thoughtworks.selenium.*;
public class Test_SNF_ECMS_24_DownloadandAllowEdition extends SeleneseTestCase {
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

public void testSNF_ECMS_24_DownloadandAllowEdition() throws Exception {
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

  //20: echo | -- Mouse down right acme | 
System.out.println("-- Mouse down right acme");

  //21: waitForElementPresent | //a[@title='acme '] | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("//a[@title='acme ']")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //22: mouseDownRight | //a[@title='acme '] | 
selenium.mouseDownRight("//a[@title='acme ']");

  //23: echo | -- Click Download and Allow Edition | 
System.out.println("-- Click Download and Allow Edition");

  //24: waitForElementPresent | //div[@class='ItemIcon WebDAV16x16Icon'] | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("//div[@class='ItemIcon WebDAV16x16Icon']")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //25: click | //div[@class='ItemIcon WebDAV16x16Icon'] | 
selenium.click("//div[@class='ItemIcon WebDAV16x16Icon']");

  //26: pause | 3000 | 
Thread.sleep(3000);

  //27: open | /portal/public/acme/ | 
selenium.open("/portal/public/acme/");

  //28: echo | -- Logout | 
System.out.println("-- Logout");

  //29: waitForElementPresent | link=Logout | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=Logout")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //30: clickAndWait | link=Logout | 
selenium.click("link=Logout");
selenium.waitForPageToLoad(timeout);
}

}
