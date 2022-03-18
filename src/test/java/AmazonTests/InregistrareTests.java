package AmazonTests;

import Base.ShareData;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Help.ElementMethods;
import Pages.InregistrarePages;


public class InregistrareTests extends ShareData {

    public ElementMethods elementMethods;

    public InregistrarePages inregistrarePages;


    @Test


    public void InregistrareTest(){
        elementMethods = new ElementMethods(driver);

        driver.navigate().to("https://www.amazon.com/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3F_encoding%3DUTF8%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");

        WebElement nameElement = driver.findElement(By.id("ap_customer_name"));
        elementMethods.clickElement(nameElement);
        String firstNameValue = "LAZAR ADELA";
        nameElement.sendKeys(firstNameValue);

        WebElement emailElement = driver.findElement(By.id("ap_email"));
        elementMethods.clickElement(emailElement);
        String emailValue = "lazaradela_2007@yahoo.com";
        emailElement.sendKeys(emailValue);

        WebElement passwordElement = driver.findElement(By.id("ap_password"));
        elementMethods.clickElement(passwordElement);
        String passwordValue = "Adelina@1000";
        passwordElement.sendKeys(passwordValue);

        WebElement validatePasswordElement = driver.findElement(By.id("ap_password_check"));
        elementMethods.clickElement(passwordElement);
        String validatepasswordValue = "Adelina@1000";
        validatePasswordElement.sendKeys(passwordValue);

        WebElement CreateaccountElement = driver.findElement(By.id("continue"));
        elementMethods.clickElement(CreateaccountElement);


    }
}


