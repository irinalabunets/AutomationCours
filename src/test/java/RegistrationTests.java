import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.RegistrationPage;

public class RegistrationTests {

    @BeforeClass
    public void beforeClass () {

        System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
    }

    @Test
    public void errorMessageOnEmptyFormSubmit() {
        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.openPage();
        registrationPage.Variable();
        registrationPage.RegistrationFormFillAndSubmit("", "", "", "");
        registrationPage.ErrorMessageOnEmptyFormSubmit();



    }
}
