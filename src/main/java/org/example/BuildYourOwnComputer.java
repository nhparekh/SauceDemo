package org.example;

import org.openqa.selenium.By;

public class BuildYourOwnComputer extends Utils{



        public void selectYourProductOpp(){


            //select second drop down from processor
            selectTextByVisibleText(By.id("product_attribute_1"),"2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]");
            //select second drop down from RAM
            selectTextByVisibleText(By.name("product_attribute_2"),"8GB [+$60.00]");
            // select second opp hdd
            clickOnElement(By.id( "product_attribute_3_7"));
            // select second opp os
            clickOnElement(By.id("product_attribute_4_9"));
            // select second opp software
            clickOnElement(By.id("product_attribute_5_11"));
            //Click on add to cart button
            clickOnElement(By.id("add-to-cart-button-1"));




        }
}

