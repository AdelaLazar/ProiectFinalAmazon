package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchingPages extends BasePages {

    public SearchingPages(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="twotabsearchtextbox")
    private WebElement searchSamsungS21Element;
    @FindBy(id="nav-search-submit-button")
    private WebElement searchButton;
    @FindBy(linkText = "T-Mobile")
    private WebElement SamsungTMobileElement;
    @FindBy(linkText = "Samsung Galaxy S21 5G G991B Dual 256GB 8GB RAM Factory Unlocked (GSM Only | No CDMA - not Compatible with Verizon/Sprint) International Version - Phantom Violet")
    private WebElement SamsungS21G991BElement;
    @FindBy(id="add-to-cart-button")
    private WebElement addCartProductElement;

    public void searchFor(String product) {
        elementMethods.fillElement(searchSamsungS21Element, product);
        searchSamsungS21Element.sendKeys(Keys.ENTER);
    }

    public void goToSamsungS21(){
        elementMethods.moveToElement(SamsungTMobileElement);
        elementMethods.clickElement(SamsungS21G991BElement);

    }

    public void addProductToCart () {
        elementMethods.clickElement(addCartProductElement);
    }
}
