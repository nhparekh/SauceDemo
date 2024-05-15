package org.example;

import org.openqa.selenium.By;

public class LoginPage extends Utils {
    //Type email
    public void loginDetails() {
        //Type email
        typeText(By.className("email"), email);

        //Type Password
        typeText(By.className("password"), password);

        //Click on login button
        clickOnElement(By.xpath("//div/button[@Class='button-1 login-button']"));


    }
}

