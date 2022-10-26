package cleanTest.swagLabs;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.swagLabs.CartSection;
import pages.swagLabs.LoginModal;
import pages.swagLabs.MainPage;
import pages.swagLabs.ProductSection;
import singletonSession.Session;

public class TestBaseSwagLabs {

    public LoginModal loginModal = new LoginModal();
    public MainPage mainPage = new MainPage();

    public ProductSection productSection = new ProductSection();

    public CartSection cartSection = new CartSection();

    @BeforeEach
    public void setup(){
        Session.getInstance().getBrowser().get("https://www.saucedemo.com/");
    }

    @AfterEach
    public void cleanup(){
        Session.getInstance().closeBrowser();
    }


}
