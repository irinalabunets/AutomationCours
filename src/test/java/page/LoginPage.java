package page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    private WebElement emeilField;
    private WebElement passwordField;
    private WebElement singInButton;

    public void VariableForLogin(){
        emeilField = driver.findElement(By.id("login-email"));
        passwordField = driver.findElement(By.id("login-password"));
        singInButton = driver.findElement(By.id("login-submit"));
    }

    public void Authorization (){
        emeilField.sendKeys();
        passwordField.sendKeys();
        singInButton.click();
    }
}
