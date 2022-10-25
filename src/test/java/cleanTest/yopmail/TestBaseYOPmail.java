package cleanTest.yopmail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.yopmail.InboxSection;
import pages.yopmail.MainPageYOPmail;
import pages.yopmail.NewMessageSection;
import singletonSession.Session;

public class TestBaseYOPmail {

    public MainPageYOPmail mainPageYOPmail = new MainPageYOPmail();

    public InboxSection inboxSection = new InboxSection();

    public NewMessageSection newMessageSection = new NewMessageSection();

    @BeforeEach
    public void setup(){
        Session.getInstance().getBrowser().get("https://yopmail.com/en/");
    }

    @AfterEach
    public void cleanup(){
        Session.getInstance().closeBrowser();
    }

}
