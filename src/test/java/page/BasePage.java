package page;

import org.openqa.selenium.WebDriver;


public class BasePage {
    private WebDriver driver;

    public BasePage (WebDriver driver) {
        this.driver = driver;
    }

    public void openPage(){
        driver.get("https://www.linkedin.com/");
    }

}
