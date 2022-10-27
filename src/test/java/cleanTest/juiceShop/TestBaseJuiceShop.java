package cleanTest.juiceShop;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.juiceShop.LoginPage;
import pages.juiceShop.MainPage;
import pages.juiceShop.RegistrationModal;
import singletonSession.Session;

public class TestBaseJuiceShop {

    public MainPage mainPage = new MainPage();
    public LoginPage loginPage = new LoginPage();
    public RegistrationModal registrationModal = new RegistrationModal();




//    @BeforeEach
//    public void setup(){
//        Session.getInstance().getBrowser().get("https://juice-shop.herokuapp.com/#/");
//    }
    @BeforeEach
    public void setup(){
        Session.getInstance().getBrowser().get("http://localhost:3000/#/");
    }

    @AfterEach
    public void cleanup(){
        Session.getInstance().closeBrowser();
    }

}
