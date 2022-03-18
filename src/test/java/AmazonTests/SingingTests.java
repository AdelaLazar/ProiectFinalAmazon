package AmazonTests;

import Base.ShareData;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Help.ElementMethods;
import Pages.SingingPages;


public class SingingTests extends ShareData {

    public ElementMethods elementMethods;
    public SingingPages singingPages;


    @Test
    public void SinginTest(){

        elementMethods = new ElementMethods(driver);

        driver.navigate().to("https://www.amazon.com/ap/signin?openid.return_to=https%3A%2F%2Ftrack.amazon.com%2F&prevRID=RQE2BAWD7ZE9DJ7VBXH1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_shippingrecipientcentral_us&openid.mode=checkid_setup&language=en_US&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=amzn_shippingrecipientcentral_us&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&timestamp=1644090384000");

        WebElement emailElement = driver.findElement(By.id("ap_email"));
        elementMethods.clickElement(emailElement);
        String emailValue = "lazaradela_2007@yahoo.com";
        emailElement.sendKeys(emailValue);

        WebElement passwordElement = driver.findElement(By.id("ap_password"));
        elementMethods.clickElement(passwordElement);
        String passwordValue = "Adelina@1000";
        passwordElement.sendKeys(passwordValue);

        WebElement SigninElement = driver.findElement(By.id("signInSubmit"));
        elementMethods.clickElement(SigninElement);

    }
}


