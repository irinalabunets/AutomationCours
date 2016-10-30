package page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    private WebDriver driver;

    private WebElement emailField;
    private WebElement passwordField;
    private WebElement singInButton;

    private WebElement logo;
    private WebElement searchBox;
    private WebElement searchButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void VariableForLogin(){
        emailField = driver.findElement(By.id("login-email"));
        passwordField = driver.findElement(By.id("login-password"));
        singInButton = driver.findElement(By.id("login-submit"));
    }

    public void Authorization (String email, String password){
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        singInButton.click();
    }

    public void VariableForHomePage() {

        logo = driver.findElement(By.xpath("//a[@class='logo']"));
        searchBox = driver.findElement(By.id("main-search-box"));
        searchButton = driver.findElement(By.xpath("//*[@id='global-search']//button[@name]"));
    }

    public void CheckHomePage () {

        logo.isDisplayed();
        searchBox.isDisplayed();
        searchButton.isDisplayed();
    }
}
