package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    private WebElement logo;
    private WebElement searchBox;
    private WebElement searchButton;

    public void VariableForHomePage () {

        logo = driver.findElement(By.id("in-logo"));
        searchBox = driver.findElement(By.id("main-search-box"));
        searchButton = driver.findElement(By.xpath("//*[@id='global-search']//button[@name]"));
    }

    public void CheckHomePage () {

        logo.isDisplayed();
        searchBox.isDisplayed();
        searchButton.isDisplayed();
    }
}
