package AmazonTests;

import Base.ShareData;
import org.junit.Test;
import org.openqa.selenium.By;
import Help.ElementMethods;
import Pages.SearchingPages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class SearchingTests extends ShareData {

    public ElementMethods elementMethods;
    public SearchingPages searchingPages;


    @Test

    public void SearchingTest() {

        elementMethods = new ElementMethods(driver);

        driver.navigate().to("https://www.amazon.com/");


        WebElement searchElement = driver.findElement(By.id("twotabsearchtextbox"));
        elementMethods.clickElement(searchElement);
        String searchValue = "Samsung S21";
        searchElement.sendKeys(searchValue);

        WebElement searchButtonElement = driver.findElement(By.id("nav-search-submit-button"));
        elementMethods.clickElement(searchButtonElement);

        WebElement mobileElement = driver.findElement(By.linkText("T-Mobile"));
        elementMethods.clickElement(mobileElement);

        WebElement samsungElement = driver.findElement(By.linkText("Samsung Galaxy S21 5G G991B Dual 256GB 8GB RAM Factory Unlocked (GSM Only | No CDMA - not Compatible with Verizon/Sprint) International Version - Phantom Violet"));
        elementMethods.clickElement(samsungElement);

        WebElement addToCartElement = driver.findElement(By.id("add-to-cart-button"));
        elementMethods.clickElement(addToCartElement);


    }
}