import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.HomePage;
import page.LoginPage;

public class AuthorizationSuccessful {

    @BeforeClass
    public void beforeClass () {
        System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
    }

    @Test
    public void Authorization () throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.openPage();
        loginPage.VariableForLogin();
        loginPage.Authorization();
        Thread.sleep(3000);
        //loginPage.VariableForHomePage();
        //loginPage.CheckHomePage();

        HomePage homePage = new HomePage();
        //Thread.sleep(1000);
        homePage.VariableForHomePage();
        homePage.CheckHomePage();
    }
}
