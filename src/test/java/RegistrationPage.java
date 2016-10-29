import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegistrationPage {

    //System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
    WebDriver driver = new FirefoxDriver();

    private WebElement firstNameField = driver.findElement(By.id("reg-firstname"));
    private WebElement lastNameField = driver.findElement(By.id("reg-lastname"));
    private WebElement emailField = driver.findElement(By.id("reg-email"));
    private WebElement passwordField = driver.findElement(By.id("reg-password"));
    private WebElement joinNowButton = driver.findElement(By.id("registration-submit"));

    public void RegistrationFormFillAndSubmit(){
        firstNameField.sendKeys();
        lastNameField.sendKeys();
        emailField.sendKeys();
        passwordField.sendKeys();
        joinNowButton.click();
    }
}
