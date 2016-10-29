package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {

    WebDriver driver = new FirefoxDriver();

    public void navigatePage(){

        driver.get("https://www.linkedin.com/");
    }

}
