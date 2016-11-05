package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class BasePage {
    protected WebDriver driver;

    public BasePage (WebDriver driver) {

        this.driver = driver;
    }

    public void openPageURL (String URL){
        driver.get(URL);
    }

    /**
     * Gets current Browser URL.
     * @return String with current URL value.
     */
    public String getCurrentURL () {
       return driver.getCurrentUrl();
    }

    /**
     * Explicitly waiting for WedElement visibility.
     * @param element WebElement that will be explicitly waited.
     * @param timeout Maximum wait time in seconds.
     * @return WebElement that was explicitly waited.
     */
    public WebElement waitForElementDisplayed (WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public WebElement waitForElementDisplayed (WebElement element) {
        return waitForElementDisplayed (element, 10);
    }

    public WebElement waitForListOfElementsDisplayed (List<WebElement> element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        return wait.until(ExpectedConditions.visibilityOf((WebElement) element));
    }

}
