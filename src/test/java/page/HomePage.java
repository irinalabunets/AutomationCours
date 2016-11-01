package page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

    private WebDriver driver;
    private WebElement homeMenuLink;

    public HomePage(WebDriver driver) {
        super(driver);
    }
    //private WebElement logo;
    //private WebElement searchBox;
    //private WebElement searchButton;

    public void listOfElementsToHomePage () {


        homeMenuLink = driver.findElement(By.xpath("//div[@id='main-site-nav']//a[@class='nav-link' and @href='/home?trk=nav_responsive_tab_home']"));
        //logo = driver.findElement(By.id("in-logo"));
        //searchBox = driver.findElement(By.id("main-search-box"));
        //searchButton = driver.findElement(By.xpath("//*[@id='global-search']//button[@name]"));
    }

    public void CheckHomePage () {

        //logo.isDisplayed();
        //searchBox.isDisplayed();
        //searchButton.isDisplayed();
    }

    public boolean isPageLoaded() {
        return homeMenuLink.isDisplayed();
    }
}
}
