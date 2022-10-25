package cleanTest.yopmail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import singletonSession.Session;

import java.time.Duration;
import java.util.Date;

public class VerifyYOPmail extends TestBaseYOPmail {

    String email = new Date().getTime()+"@yopmail.com";
    String subjectText = "New subject"+new Date().getTime();
    String emailText = "New email"+new Date().getTime();

    @Test
    public void TestYOPmail() throws InterruptedException {

        // ----------------- Type the Email name of your choice -----------------
        mainPageYOPmail.newEmail.click();
        mainPageYOPmail.newEmail.setText(email);
        mainPageYOPmail.arrowButton.click();

        // ----------------- WRITE NEW EMAIL  -----------------
        inboxSection.writeNewEmail.waitClickable();
        inboxSection.writeNewEmail.click();

        Session.getInstance().getBrowser().switchTo().frame("ifmail");
        newMessageSection.recipientToInput.setText(email);
        newMessageSection.subjectInput.setText(subjectText);
        newMessageSection.emailInput.setText(emailText);
        newMessageSection.sendMessage.waitIsVisible();
        newMessageSection.sendMessage.click();


        // ----------------- REFRESH INBOX  -----------------
        Session.getInstance().getBrowser().switchTo().defaultContent();

        inboxSection.refreshInbox.waitClickable();
        inboxSection.refreshInbox.click();
        newMessageSection.sendMessage.waitToDissapear();
        inboxSection.refreshInbox.waitClickable();
        inboxSection.refreshInbox.click();

        Session.getInstance().getBrowser().switchTo().frame("ifinbox");
        inboxSection.email.waitIsVisible();

        Session.getInstance().getBrowser().switchTo().defaultContent();

        //Assertions.assertEquals(email, inboxSection.email.getText(), "ERROR");

        Thread.sleep(4000);













    }





}
