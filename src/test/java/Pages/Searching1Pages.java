package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Searching1Pages extends BasePages {


    public Searching1Pages(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="twotabsearchtextbox")
    private WebElement searchmakeUpElement;
    @FindBy(id="nav-search-submit-button")
    private WebElement searchButton;
    @FindBy(linkText = "Lipstick")
    private WebElement departmentElement;
    @FindBy(id="p_89/NYX Professional Makeup")
    private WebElement brandsElement;
    @FindBy(linkText = "cream")
    private WebElement formatElement;


    public void searchFor(String product) {
        elementMethods.fillElement(searchmakeUpElement, product);
        searchmakeUpElement.sendKeys(Keys.ENTER);
    }

    public void goToLipstick() {
        elementMethods.moveToElement(departmentElement);
        elementMethods.moveToElement(brandsElement);
        elementMethods.clickElement(formatElement);

    }
}
