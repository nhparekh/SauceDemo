package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class DesktopPage extends Utils {

    public void eachProductsShouldHaveATitle() {
        List<WebElement> productTitleElementList = driver.findElements(By.xpath("//div[@class='item-box']//h2"));
        System.out.println(productTitleElementList.size());

        //String[] productName={"Build your own computer","Digital Storm VANQUISH 3 Custom PerformancePC","Lenovo IdeaCentre 600 All-in-One-PC"}
        for (WebElement element : productTitleElementList) {
            Assert.assertNotNull(element.getText(), "One of the product title missing");
        }
    }

}
