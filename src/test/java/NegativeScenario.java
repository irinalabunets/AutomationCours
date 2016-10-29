import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
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
        String ErrorMasege = RegAlert.getText();
        Assert.assertEquals("Укажите имя", ErrorMasege);
        

        driver.findElement(By.xpath("//div[@class='reg-alert']//button")).click();
        //driver.findElement(By.xpath("//div[@class='reg-alert']")).clear();
        driver.findElement(By.id("reg-firstname")).sendKeys("Irina");
        driver.findElement(By.id("reg-lastname")).sendKeys("Labunets");
        driver.findElement(By.id("reg-email")).sendKeys("labunetsiryna@gmail");
        driver.findElement(By.id("reg-password")).sendKeys("edcvfr789");
        driver.findElement(By.id("registration-submit")).click();
        WebElement RegAlertEmail = driver.findElement(By.xpath("//div[@class='reg-alert']/span"));
        String ErrorMasege2 = RegAlertEmail.getText();
        Assert.assertEquals("Укажите действительный адрес электронной почты", ErrorMasege2);


    }
}
