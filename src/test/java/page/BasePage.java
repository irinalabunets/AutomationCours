package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class BasePage {
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriver initDriver() {
        return new FirefoxDriver();
    }

    @BeforeClass
    public void setUp () {
        System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
        initDriver();
    }
}
