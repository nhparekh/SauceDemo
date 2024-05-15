package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HomePage extends Utils{

    // click on registerButton from header bar
    public void clickOnRegisterButton(){
        clickOnElement(By.className("ico-register"));
    }
    //to click on log in button from header bar
    public void clickOnLoginButton(){
        clickOnElement(By.className("ico-login"));
    }
    //click on build your own computer
    public void featuredProduct(){
        clickOnElement(By.linkText("Build your own computer"));
    }
    // click on ElectronicsButton from header bar
    public void clickOnElectronics() {
        clickOnElement(By.xpath("//h2[@class='title']/a[@title=\"Show products in category Electronics\"]"));
    }

    // click on computer
    public void clickOnComputer() {
        clickOnElement(By.linkText("Computers"));
    }

    //scroll down home page and click on vote
    public void clickOnVote() {
        clickOnElement(By.id("vote-poll-1"));
    }

    // Switching to Alert
    public void handleMsg() {

        // Capturingt message from alert.
        String actualAlertMessage = getTextFromAlertMsg();

        //expected requirement
        String expectedMessage = "Please select an answer";

        Assert.assertEquals(actualAlertMessage, expectedMessage, "your test case is fail");

        // Accepting alert
        acceptAlert();

    }

    //method to homepage click on search button
    public void clickOnSearchButton() {
        clickOnElement(By.xpath("//*[@id='small-search-box-form']/button"));
    }

    // Switching to Alert
    public void getAlertMsg() {

        // Capturing alert message.
        String actualAlertMessage = getTextFromAlertMsg();

        //expected msg
        String expectedMessage = "Please enter some search keyword";

        Assert.assertEquals(actualAlertMessage, expectedMessage, "your test case is fail");

        // Accepting alert
        acceptAlert();
    }

    //method to homepage click on facebook icon
    public void clickOnFacebookIcon() {
        clickOnElement(By.linkText("Facebook"));
    }

    public void searchByBrandName() {
        typeText(By.id("small-searchterms"), loadProp.getProperty("BrandName"));
    }

    public void clickOnDetailsButton() {
        clickOnElement(By.xpath("//div[@class='news-items']/div[2]/div[3]/a"));
    }

    public void chooseEuroCurrency() {
        selectTextByVisibleText(By.id("customerCurrency"), "Euro");
        //show list of product title element
        List<WebElement> productContainEuroCurrency = driver.findElements(By.xpath("//div[@class='product-grid home-page-product-grid']//div[@class='prices']"));
        //product contain Euro
        for (WebElement webelement : productContainEuroCurrency) {
            Assert.assertNotNull(webelement.getText(), "One of the product title missing");
        }
    }
    public void chooseUSDollarCurrency() {
        selectTextByVisibleText(By.id("customerCurrency"), "US Dollar");
        //show list of product title element
        List<WebElement> productContainUSDollar = driver.findElements(By.xpath("//div[@class='product-grid home-page-product-grid']//div[@class='prices']"));
        //product contain usdollar
        for (WebElement webelement : productContainUSDollar) {
            Assert.assertNotNull(webelement.getText(), "One of the product title missing");
        }
    }
}

