package org.example;

import org.openqa.selenium.By;

public class Electronics extends Utils {
    //to  click OnCameraAndPhoto
    public void clickOnCameraAndPhoto(){
        clickOnElement(By.xpath("//h2/a[@title=\"Show products in category Camera & photo\"]"));
    }
}
