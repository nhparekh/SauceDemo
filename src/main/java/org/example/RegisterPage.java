package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils {
    //this method for registration
    public void enterRegistrationDetails() {

        //type firstname
        typeText(By.id("FirstName"),loadProp.getProperty("FirstName"));

        //type lastname
        typeText(By.id("LastName"),loadProp.getProperty("LastName"));

        //select date of birth
        selectTextByVisibleText(By.name("DateOfBirthDay"),"3");

        //select month of birth
        selectTextByVisibleText(By.name("DateOfBirthMonth"),"April");

        //select date of birth year
        selectTextByVisibleText(By.name("DateOfBirthYear"),"1986");

        //type email
        typeText(By.id("Email"), email);

        //type password
        typeText(By.id("Password"), password);

        //type confirm password
        typeText(By.id("ConfirmPassword"), password);

        //click on submit regist button
        clickOnElement(By.name("register-button"));

    }

    }
