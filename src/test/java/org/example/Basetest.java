package org.example;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetest extends Utils{
    BrowserManager browserManager = new BrowserManager();

    @BeforeMethod
    //Method to open the browser
    public void setup() {
        browserManager.openBrowser();
    }

    @AfterMethod
    //method to close browser
    public void tearDown(ITestResult result) {
        if (!result.isSuccess()) {
            takeScreenShot(result.getName());
        }
        browserManager.closeBrowser();
    }
}
