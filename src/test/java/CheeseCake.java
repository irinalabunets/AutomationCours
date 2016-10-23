import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.List;

public class CheeseCake {
    @Test
    public void listCheesecakes() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","C:/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.thecheesecakefactory.com/");

        driver.findElement(By.id("closeBtn")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[@href='/menu/']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[@href='/menu/desserts/']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[@href='/menu/desserts/cheesecakes/']")).click();
        Thread.sleep(1000);

        List<WebElement> cheesecakes = driver.findElements(By.xpath("//a[contains(@href,'/menu/desserts/cheesecakes/')]/span[@class='item-title']"));

        System.out.println(cheesecakes.size() + " cheesecakes:");

        for (int i=0; i<cheesecakes.size(); i++) {

            System.out.println(i+1 + ". " + cheesecakes.get(i).getText());

        }

    }

}
