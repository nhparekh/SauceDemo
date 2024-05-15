package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BrowserManager extends Utils {

    LoadProp loadProp = new LoadProp();

    String sauceUrl = "https://oauth-namrata02.parekh-87c79:b0d0f1b6-130d-474b-875a-abe33c5a58b9@ondemand.eu-central-1.saucelabs.com:443/wd/hub";
    String browser = System.getProperty("browser");
//String browser = loadProp.getProperty("Browser");
   // boolean cloud = true;
    boolean cloud =Boolean.parseBoolean(System.getProperty("cloud"));

    // method to start
    public void openBrowser() {
        if (cloud) {
            System.out.println("running in cloud...");
            if (browser.equalsIgnoreCase("Chrome")) {
                System.out.println("Browser is chrome");
                ChromeOptions browserOptions = new ChromeOptions();
                browserOptions.setPlatformName("Windows 10");
                browserOptions.setBrowserVersion("latest");
                try {
                   // URL url = new URL(sauceUrl);
                     driver = new RemoteWebDriver(new URL(sauceUrl), browserOptions);
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                }
            } else if (browser.equalsIgnoreCase("FireFox")) {
                System.out.println("your browser is FireFox");
                FirefoxOptions browserOptions = new FirefoxOptions();
                browserOptions.setPlatformName("Windows 10");
                browserOptions.setBrowserVersion("latest");
                try {
                    driver = new RemoteWebDriver(new URL(sauceUrl), browserOptions);
                } catch (MalformedURLException e) {
                    throw new RuntimeException("Firefox");
                }

            } else if (browser.equalsIgnoreCase("Safari")) {
                System.out.println("your browser is Safari");
                SafariOptions browserOptions = new SafariOptions();
                browserOptions.setPlatformName("macOS 13");
                browserOptions.setBrowserVersion("latest");
                try {
                    driver = new RemoteWebDriver(new URL(sauceUrl), browserOptions);
                } catch (MalformedURLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        else {
            System.out.println("Running in Local......................");
            //open browser
            if
            (browser.equalsIgnoreCase("Chrome")) {
            //System.out.println("Your browser is Chrome");
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("Firefox")) {
                System.out.println("Your browser is Firefox");
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("Edge")) {
                System.out.println("Your browser is Edge");
                driver = new EdgeDriver();
            } else {
                System.out.println("Your browser Name is Wrond" + browser);
            }
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        //open URL
        driver.get(loadProp.getProperty("Url"));
    }
    //method to close the windows

         public void closeBrowser(){driver.quit(); }

    }




