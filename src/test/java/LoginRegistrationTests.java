import org.testng.Assert;
import org.testng.annotations.Test;
import page.HomePage;
import page.LoginRegistrationPage;

/**
 * Test for login and registration at the linkedin
 */
public class LoginRegistrationTests extends BaseTest{

    /**
     * Error massage at the empty form after user click submit
     */
    @Test
    public void errorMessageOnEmptyFormSubmit () {
        LoginRegistrationPage registrationPage = new LoginRegistrationPage(getDriver());
        registrationPage.registrationFormFillAndSubmit("", "", "", "");
        Assert.assertEquals(registrationPage.getErrorMessageText(), "Укажите имя", "Expected error message was not found on page");

    }

    /**
     * Error massage at the filled fields form and mistake at the email after user click submit
     */
    @Test
    public void errorMessageOnFillFormBadEmailSubmit (){
        LoginRegistrationPage registrationPage = new LoginRegistrationPage(getDriver());
        registrationPage.registrationFormFillAndSubmit("irina", "labunets", "labunetsirina@gmail", "edcvfr789");
        Assert.assertEquals(registrationPage.getErrorMessageText(), "Укажите действительный адрес электронной почты", "Expected error message was not found on page");

    }

    /**
     * Successful authorization of user
     */
    @Test
    public void successfulLoginTest () {
        LoginRegistrationPage loginRegistrationPage = new LoginRegistrationPage(getDriver());
        HomePage homePage = loginRegistrationPage.loginFormFillAndSubmit("irina.la@ukr.net", "edcvfr789");
        Assert.assertTrue(homePage.isPageLoaded());
    }
}

