import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NegativeScenario {
    @Test
    public void negativeLinkedin() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.linkedin.com/");
        driver.findElement(By.id("regForm"));
        driver.findElement(By.id("registration-submit")).click();
        WebElement RegAlert = driver.findElement(By.xpath("//div[@class='reg-alert']/span[contains(text(),'Укажите имя')]"));

        System.out.println(RegAlert.getText());
    }
}
