package Base;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

import java.time.Duration;

public class ShareData {

    public WebDriver driver;

    @Before

    public void Setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void TearDown(){

        // driver.quit();

    }
}
