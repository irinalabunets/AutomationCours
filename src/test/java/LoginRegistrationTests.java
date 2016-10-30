import org.testng.Assert;
import org.testng.annotations.Test;
import page.HomePage;
import page.LoginRegistrationPage;

public class LoginRegistrationTests extends BaseTest{


    @Test
    public void errorMessageOnEmptyFormSubmit () {
        LoginRegistrationPage registrationPage = new LoginRegistrationPage(getDriver());
        registrationPage.openPage();
        registrationPage.variable();
        registrationPage.registrationFormFillAndSubmit("", "", "", "");
        //registrationPage.ErrorMessageOnEmptyFormSubmit();

        Assert.assertEquals(registrationPage.getErrorMessageText(), "Укажите имя", "Expected error massage");

    }

    @Test
    public void successfulLoginTest () {
        LoginRegistrationPage loginRegistrationPage = new LoginRegistrationPage(getDriver());
        loginRegistrationPage.openPage();
        loginRegistrationPage.variable();
        loginRegistrationPage.loginFormFillAndSubmit("irina.la@ukr.net", "edcvfr789");
        HomePage homePage = new HomePage(getDriver());
        homePage.initElement();
        Assert.assertTrue(homePage.isPageLoaded());
    }
}
