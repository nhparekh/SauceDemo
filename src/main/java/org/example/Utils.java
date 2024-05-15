package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Utils extends BasePage {
    //create object to call loadprop
  static  LoadProp loadProp = new LoadProp();

    //all reusable method will be in this class
    //store email for re use
    static String email = loadProp.getProperty("EmailPart1")+randomDate()+loadProp.getProperty("EmailPart2");
    // store password for re use
    static String password = loadProp.getProperty("Password");

    //method to use click on elment
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    //method for type text as string in text box
    public static void typeText(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    //method for capture text of element
    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public static String randomDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddhhmm");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public static void waitForWebElement() {driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    //explicit wait element to be clickable
    public static void waitElementToBeClickable(){WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));}

    //explicit wait element to be select
    public static void waitElementToBeSelected(){WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));}

    //explicit wait element to be invisibility
    public static void waitInvisibilityOfTheElement(){WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));}

    //explicit wait element to be visibility
    public static void waitVisibilityOfTheElement(){WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));}

    //explicit wait element to be invisibilityOfTheElementLocated
    public static void invisibilityOfTheElementLocated(){WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));}

    //explicit wait element to be invisibilityOfElementwithtext
    public static void invisibilityOfElementWithText(){WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));}

    //explicit wait element to be presenceOfAllElementsLocatedBy
    public static void presenceOfAllElementsLocatedBy(){WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));}

    //explicit wait element to be presenceOfElementLocated
    public static void presenceOfElementLocated(){WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));}

    //explicit wait element to be titles
    public static void titleIs(){WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));}

    //explicit wait element to be visibilityof
    public static void visibilityOf(){WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));}

    // To click on the ‘OK’ button of the alert.
    public static void acceptAlert(){driver.switchTo().alert().accept();}

    public static String getTextFromAlertMsg(){return driver.switchTo().alert().getText();}




    public static void sleep() {

        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void selectTextByVisibleText(By by, String text) {
        //select date of birth
        Select dateofbirth = new Select(driver.findElement(by));
        dateofbirth.selectByVisibleText(text);
        //Select month of birth
        Select dateofbirthMonth = new Select(driver.findElement(by));
        dateofbirthMonth.selectByVisibleText(text);
        //Select Year of birth
        Select dateofbirthYear = new Select(driver.findElement(by));
        dateofbirthYear.selectByVisibleText(text);
    }

    public static void selectTextByValue(By by, String text) {
        //select date of birth
        Select dateofbirth = new Select(driver.findElement(by));
        dateofbirth.selectByValue(text);
        //Select month of birth
        Select dateofbirthMonth = new Select(driver.findElement(by));
        dateofbirthMonth.selectByValue(text);
        //Select Year of birth
        Select dateofbirthYear = new Select(driver.findElement(by));
        dateofbirthYear.selectByValue(text);
    }


    public static void selectTextByIndex(By by, int i) {
        //select date of birth
        Select dateofbirth = new Select(driver.findElement(by));
        dateofbirth.selectByIndex(i);
        //Select month of birth
        Select dateofbirthMonth = new Select(driver.findElement(by));
        dateofbirthMonth.selectByIndex(i);
        //Select Year of birth
        Select dateofbirthYear = new Select(driver.findElement(by));
        dateofbirthYear.selectByIndex(i);
    }

    public static void takeScreenShot(String text) {

        // convert web driver object to TakeScreenshot
        TakesScreenshot screenshot = ((TakesScreenshot) driver);
        //Call getScreenshotAs method to create image file
        File SrcFile = screenshot.getScreenshotAs(OutputType.FILE);
        //Move image file to new destination
        //Copy file at destination
        try {
            FileUtils.copyFile(SrcFile, new File("src/test/java/Screenshots"+text+randomDate()+".png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
