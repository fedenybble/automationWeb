package pages.yopmail;

import controlSelenium.Button;
import controlSelenium.Label;
import org.openqa.selenium.By;

public class InboxSection {

    public Button writeNewEmail = new Button(By.id("newmail"));

    public Button refreshInbox = new Button(By.id("refresh"));

    public Label email = new Label(By.xpath("//div[@class=\"m\"]//div[@class=\"lmfd\"]//span[@class=\"lmf\"]"));

}
