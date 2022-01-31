package com.syntax.class24.task1;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver[] webDrivers={new FireFoxDriver(),new ChromeDriver()};
        for(WebDriver webDriver:webDrivers) {
            webDriver.openBrowser();
            webDriver.maximizeBrowser();
            webDriver.findElement();
            webDriver.closeBrowser();
        }

    }
}
