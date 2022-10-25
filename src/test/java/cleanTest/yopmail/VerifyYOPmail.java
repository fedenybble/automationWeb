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
        inboxSection.writeNewEmail.waitClickable();
        inboxSection.writeNewEmail.click();

        Session.getInstance().getBrowser().switchTo().frame("ifmail");

        Thread.sleep(1000);

        newMessageSection.recipientToInput.setText(email);
        newMessageSection.subjectInput.click();
        newMessageSection.subjectInput.setText(subjectText);
        newMessageSection.emailInput.click();
        newMessageSection.emailInput.setText(emailText);
        newMessageSection.sendTheMessage.waitClickable();
        newMessageSection.sendTheMessage.click();

        Session.getInstance().getBrowser().switchTo().defaultContent();

        Thread.sleep(1000);

        inboxSection.refreshInbox.waitClickable();
        inboxSection.refreshInbox.click();

        Thread.sleep(4000);













    }





}
