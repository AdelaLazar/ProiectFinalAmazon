package AmazonTests;
import Base.ShareData;
import Help.ElementMethods;
import Pages.Searching1Pages;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Searching1Tests extends ShareData {

    public ElementMethods elementMethods;
    public Searching1Pages searching1Pages;


    @Test

    public void SearchingTest1() {

        elementMethods = new ElementMethods(driver);


        driver.navigate().to("https://www.amazon.com/");


        WebElement searchElement = driver.findElement(By.id("twotabsearchtextbox"));
        elementMethods.clickElement(searchElement);
        String searchValue = "make-up";
        searchElement.sendKeys(searchValue);

        WebElement searchButtonElement = driver.findElement(By.id("nav-search-submit-button"));
        elementMethods.clickElement(searchButtonElement);

        WebElement departmentElement = driver.findElement(By.linkText("Lipstick"));
        elementMethods.clickElement(departmentElement);

        WebElement brandsElement = driver.findElement(By.id("p_89/NYX Professional Makeup"));
        elementMethods.clickElement(brandsElement);

        WebElement formatElement = driver.findElement(By.linkText("Cream"));
        elementMethods.clickElement(formatElement);


    }

}
