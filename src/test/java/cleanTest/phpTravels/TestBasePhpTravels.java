package cleanTest.phpTravels;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.phpTravels.LoginPage;
import pages.phpTravels.MainPage;
import pages.phpTravels.RegisterPage;
import singletonSession.Session;

public class TestBasePhpTravels {

    MainPage mainPage = new MainPage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();

    @BeforeEach
    public void setup(){
        Session.getInstance().getBrowser().get("https://phptravels.com/demo/");
    }

    @AfterEach
    public void cleanup(){
        Session.getInstance().closeBrowser();
    }
}
