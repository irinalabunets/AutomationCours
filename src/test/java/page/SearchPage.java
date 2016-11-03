package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage extends BasePage{

    private WebElement advancedPeopleSearchBlock;
    private WebElement keywordsField;
    private WebElement firstNameField;
    private WebElement lastNameField;
    private WebElement titleField;
    private WebElement companyField;
    private WebElement schoolField;
    private WebElement locationField;
    private WebElement searchButton;
    private WebElement resetButton;
    private List<WebElement> searchResult;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void listOfElementsToSearch () {

        advancedPeopleSearchBlock = driver.findElement(By.id("advas"));
        keywordsField = driver.findElement(By.id("advs-keywords"));
        firstNameField = driver.findElement(By.id("advs-firstName"));
        lastNameField = driver.findElement(By.id("advs-lastName"));
        titleField = driver.findElement(By.id("advs-title"));
        companyField = driver.findElement(By.id("advs-company"));
        schoolField = driver.findElement(By.id("advs-school"));
        locationField = driver.findElement(By.id("advs-locationType"));
        searchButton = driver.findElement(By.name("submit"));
        resetButton = driver.findElement(By.xpath("//div[@class='form-controls']/input[@type='reset']"));
        searchResult = driver.findElements(By.cssSelector(".mod.result.people"));
    }

    public boolean isSearchPageLoaded() {
        return advancedPeopleSearchBlock.isDisplayed();
    }

    public void searchByKeywordAndSubmit (String keyword) {

        keywordsField.sendKeys(keyword);
        searchButton.click();
    }

    
}
