package org.exoplatform.selenium;

import junit.framework.TestCase;
import com.thoughtworks.selenium.*;
public class Test_SNF_ECMS_30_Vote extends SeleneseTestCase {
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

public void testSNF_ECMS_30_Vote() throws Exception {
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

  //33: type | id=title | Test_SNF_ECMS_30
selenium.type("id=title", "Test_SNF_ECMS_30");

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

  //35: type | id=name | Test_SNF_ECMS_30
selenium.type("id=name", "Test_SNF_ECMS_30");

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

  //38: type | //html/body | Summary Test_SNF_ECMS_30
selenium.type("//html/body", "Summary Test_SNF_ECMS_30");

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

  //42: type | //html/body | Content Test_SNF_ECMS_30
selenium.type("//html/body", "Content Test_SNF_ECMS_30");

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

  //47: echo | * Vote | 
System.out.println("* Vote");

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

  //51: echo | -- Click on Vote For Document | 
System.out.println("-- Click on Vote For Document");

  //52: waitForElementPresent | link=Vote | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=Vote")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //53: click | link=Vote | 
selenium.click("link=Vote");

  //54: echo | -- Choose 5 stars | 
System.out.println("-- Choose 5 stars");

  //55: waitForElementPresent | //div[@id='UIVoteForm']/div/div/div/div[5] | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("//div[@id='UIVoteForm']/div/div/div/div[5]")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //56: click | //div[@id='UIVoteForm']/div/div/div/div[5] | 
selenium.click("//div[@id='UIVoteForm']/div/div/div/div[5]");

  //57: echo | --  Verify  Avg. Rating | 
System.out.println("--  Verify  Avg. Rating");

  //58: waitForElementPresent | //div[text()='Avg. Rating: ']/following-sibling::div[text()='5.0'] | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("//div[text()='Avg. Rating: ']/following-sibling::div[text()='5.0']")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //59: verifyElementPresent | //div[text()='Avg. Rating: ']/following-sibling::div[text()='5.0'] | 
TestCase.assertTrue(selenium.isElementPresent("//div[text()='Avg. Rating: ']/following-sibling::div[text()='5.0']"));

  //60: echo | --  Verify  Vote times | 
System.out.println("--  Verify  Vote times");

  //61: waitForElementPresent | //div[text()='Votes: ']/following-sibling::div[text()='1'] | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("//div[text()='Votes: ']/following-sibling::div[text()='1']")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //62: verifyElementPresent | //div[text()='Votes: ']/following-sibling::div[text()='1'] | 
TestCase.assertTrue(selenium.isElementPresent("//div[text()='Votes: ']/following-sibling::div[text()='1']"));

  //63: echo | * Delete document | 
System.out.println("* Delete document");

  //64: waitForElementPresent | link=Test_SNF_ECMS_30 | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=Test_SNF_ECMS_30")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //65: mouseDownRight | link=Test_SNF_ECMS_30 | 
selenium.mouseDownRight("link=Test_SNF_ECMS_30");

  //66: waitForElementPresent | link=Delete | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=Delete")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //67: click | link=Delete | 
selenium.click("link=Delete");

  //68: waitForElementPresent | link=OK | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=OK")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //69: click | link=OK | 
selenium.click("link=OK");

  //70: echo | * Log out | 
System.out.println("* Log out");

  //71: waitForElementPresent | link=Logout | 
for (int second = 0;; second++) {
if (second >= timeoutSecInt)
 fail("waitForElementPresent reached a timeout (" + timeoutSecInt + "s)");
try {
 if (selenium.isElementPresent("link=Logout")) 
break; }
 catch (Exception e) {}
Thread.sleep(1000);
}

  //72: clickAndWait | link=Logout | 
selenium.click("link=Logout");
selenium.waitForPageToLoad(timeout);
}

}
