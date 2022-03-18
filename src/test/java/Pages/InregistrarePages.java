package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InregistrarePages extends BasePages{

    @FindBy(id = "ap_customer_name")
    public WebElement NameElement;
    @FindBy(id = "ap_email")
    private WebElement inregistrareEmailElement;
    @FindBy(id = "ap_password")
    public WebElement passwordElement;
    @FindBy(id = "ap_password_check")
    public WebElement  validatePasswordElement;
    @FindBy(id = "continue")
    public WebElement createAccountElement;


    public InregistrarePages(WebDriver driver) {
        super(driver);
    }

    public void fillName(String value) {
        elementMethods.fillElement(NameElement, value);
    }

    public void fillEmail(String value) {
        elementMethods.fillElement(inregistrareEmailElement, value);
    }

    public void fillPassword(String value) {
        elementMethods.fillElement(passwordElement, value);
    }

    public void fillValidatePassword(String value) {
        elementMethods.fillElement( validatePasswordElement, value);
    }

    public void accountCreate() {
        elementMethods.clickElement(createAccountElement);
    }


}


