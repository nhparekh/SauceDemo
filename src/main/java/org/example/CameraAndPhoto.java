package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class CameraAndPhoto extends Utils{
 //to click on mirrorLess Digital Camera
 public void clickOnLeicaTMirrorLessDigitalCamera(){

  clickOnElement(By.xpath("//*[text()='Leica T Mirrorless Digital Camera']"));

 }
 private By _addToCartButton = By.xpath("//button[@class='button-2 product-box-add-to-cart-button']");
 public void EachProductHaveAddToCartButton() {
  // Locator as variable store in

  // Add To Cart Button as List
  List<WebElement> productcontainAddToCartButtonList = driver.findElements(_addToCartButton);

  System.out.println(productcontainAddToCartButtonList.size());

  // Assert that each product contains an "Add to cart" button
  for (WebElement element : productcontainAddToCartButtonList) {
   Assert.assertNotNull(element.getText(), "Add to cart button not found for product: " + element.getText());
  }
  System.out.println("One Of The Product is missing Add To Cart Button");
 }
}
