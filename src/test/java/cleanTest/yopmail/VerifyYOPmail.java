package cleanTest.yopmail;

import dev.failsafe.internal.util.Assert;
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
        inboxSection.writeNewEmail.waitIsVisible();
        inboxSection.writeNewEmail.click();

        Session.getInstance().getBrowser().switchTo().frame("ifmail");
        newMessageSection.recipientToInput.waitClickable();
        newMessageSection.recipientToInput.setText(email);
        newMessageSection.subjectInput.setText(subjectText);
        newMessageSection.emailInput.setText(emailText);
        newMessageSection.sendMessage.waitIsVisible();
        newMessageSection.sendMessage.click();


        // ----------------- REFRESH INBOX  -----------------
        Session.getInstance().getBrowser().switchTo().defaultContent();

        inboxSection.refreshInbox.waitIsVisible();
        inboxSection.refreshInbox.click();
        newMessageSection.sendMessage.waitToDissapear();
        inboxSection.refreshInbox.waitClickable();
        inboxSection.refreshInbox.click();

        Session.getInstance().getBrowser().switchTo().frame("ifinbox");
        inboxSection.email.waitIsVisible();

        Assertions.assertTrue(inboxSection.searchSubject(subjectText), "ERROR");

        Session.getInstance().getBrowser().switchTo().defaultContent();

        Thread.sleep(4000);



    }


}
