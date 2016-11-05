import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void setUp () {
        System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.linkedin.com/");
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //@AfterClass
    //public void tearDown() {
       // driver.quit();
   // }

}

