package cleanTest.demoga.selectable;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.demoga.MainPage;
import singletonSession.Session;

public class TestBaseSelectElement {

    MainPage mainPage = new MainPage();


    @BeforeEach
    public void setup(){
        Session.getInstance().getBrowser().get("https://demoqa.com/selectable");
    }

    @AfterEach
    public void cleanup(){
        Session.getInstance().closeBrowser();
    }
}
