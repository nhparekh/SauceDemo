package org.example;

import org.openqa.selenium.By;

public class ProductEmailAFriend extends Utils{
    public void enterFriendDetails (){
        //click on email a friend option
        //clickOnElement(By.xpath("//button[normalize-space()='Email a friend']"));

        //enter friends emailid
        typeText(By.xpath("//input[@id='FriendEmail']"),loadProp.getProperty("FriendEmailId"));

        //enter my email id
        typeText(By.xpath("//input[@name='YourEmailAddress']"),"np"+randomDate()+"@gmail.com");

        //type text on comment box
        typeText(By.xpath("//textarea[@name='PersonalMessage']"),"I really like this Product, if you want to buy.");

        //click on send email
        clickOnElement(By.name("send-email"));

    }


}
