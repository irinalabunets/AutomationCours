import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegistrationPage {

    //System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
    WebDriver driver = new FirefoxDriver();

    private WebElement firstName = driver.findElement(By.id("reg-firstname"));
    private WebElement lastName = driver.findElement(By.id("reg-lastname"));
    private WebElement email = driver.findElement(By.id("reg-email"));
    private WebElement password = driver.findElement(By.id("reg-password"));
    private WebElement joinNow = driver.findElement(By.id("registration-submit"));
}
