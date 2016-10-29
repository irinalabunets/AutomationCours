package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegistrationPage extends BasePage {

    private WebElement firstNameField;
    private WebElement lastNameField;
    private WebElement emailField;
    private WebElement passwordField;
    private WebElement joinNowButton;

    public void Variable() {

         firstNameField = driver.findElement(By.id("reg-firstname"));
         lastNameField = driver.findElement(By.id("reg-lastname"));
         emailField = driver.findElement(By.id("reg-email"));
         passwordField = driver.findElement(By.id("reg-password"));
         joinNowButton = driver.findElement(By.id("registration-submit"));

    }


    //private WebElement firstNameField = driver.findElement(By.id("reg-firstname"));
    //private WebElement lastNameField = driver.findElement(By.id("reg-lastname"));
    //private WebElement emailField = driver.findElement(By.id("reg-email"));
    //private WebElement passwordField = driver.findElement(By.id("reg-password"));
    //private WebElement joinNowButton = driver.findElement(By.id("registration-submit"));

    public void RegistrationFormFillAndSubmit(String firstName, String lastName, String email, String password) {

        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        joinNowButton.click();
    }
}
