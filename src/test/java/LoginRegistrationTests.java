import org.testng.Assert;
import org.testng.annotations.Test;
import page.HomePage;
import page.LoginRegistrationPage;

public class LoginRegistrationTests extends BaseTest{

    @Test
    public void errorMessageOnEmptyFormSubmit () {
        LoginRegistrationPage registrationPage = new LoginRegistrationPage(getDriver());
        registrationPage.registrationFormFillAndSubmit("", "", "", "");
        Assert.assertEquals(registrationPage.getErrorMessageText(), "Укажите имя", "Expected error message was not found on page");

    }

    @Test
    public void errorMessageOnFillFormBadEmailSubmit (){
        LoginRegistrationPage registrationPage = new LoginRegistrationPage(getDriver());
        registrationPage.registrationFormFillAndSubmit("irina", "labunets", "labunetsirina@gmail", "edcvfr789");
        Assert.assertEquals(registrationPage.getErrorMessageText(), "Укажите действительный адрес электронной почты", "Expected error message was not found on page");

    }

    @Test
    public void successfulLoginTest () {
        LoginRegistrationPage loginRegistrationPage = new LoginRegistrationPage(getDriver());
        HomePage homePage = loginRegistrationPage.loginFormFillAndSubmit("irina.la@ukr.net", "edcvfr789");
        Assert.assertTrue(homePage.isPageLoaded());
    }
}

