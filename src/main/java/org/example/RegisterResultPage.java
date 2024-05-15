package org.example;
import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils{

    public void userShouldBeAbleToGetRegistrationMsg(){
    // for compare message as required.
    String expectedRegistrationMessage = loadProp.getProperty("ExpectedRegisterMsg");

    String actualMsg = driver.findElement(By.className("result")).getText();

        Assert.assertEquals(expectedRegistrationMessage,actualMsg,"Your test case is fail.");
    }
}
