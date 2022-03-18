package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SingingPages extends BasePages{

    @FindBy(id="ap_email")
    private WebElement emailElement;
    @FindBy(id="ap_password")
    private WebElement passwordElement;
    @FindBy(id="signInSubmit")
    private WebElement signInElement;

    public SingingPages(WebDriver driver) {
        super(driver);
    }

    public void fillEmail(String value){
        elementMethods.fillElement(emailElement, value);
    }

    public void fillPassword(String value){
        elementMethods.fillElement(passwordElement, value);
    }

    public void clickSignIn(){
        elementMethods.clickElement(signInElement);
    }

}
