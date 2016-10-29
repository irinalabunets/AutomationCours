package page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    private WebElement emeilField;
    private WebElement passwordField;
    private WebElement singInButton;

    private WebElement logo;
    private WebElement searchBox;
    private WebElement searchButton;

    public void VariableForLogin(){
        emeilField = driver.findElement(By.id("login-email"));
        passwordField = driver.findElement(By.id("login-password"));
        singInButton = driver.findElement(By.id("login-submit"));
    }

    public void Authorization (){
        emeilField.sendKeys("irina.la@ukr.net");
        passwordField.sendKeys("edcvfr789");
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
