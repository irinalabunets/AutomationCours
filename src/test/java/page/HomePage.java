package page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    @FindBy (xpath = "//div[@id='main-site-nav']//a[@class='nav-link' and @href='/home?trk=nav_responsive_tab_home']")
    private WebElement homeMenuLink;
    @FindBy (id = "advanced-search")
    private WebElement advansedButton;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    public boolean isPageLoaded() {
        return waitForElementDisplayed(homeMenuLink, 5).isDisplayed();
    }

    public SearchPage clickForAdvansedButton () {
        advansedButton.click();
        return new SearchPage (driver);
    }
}

