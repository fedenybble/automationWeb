package pages.yopmail;

import controlSelenium.Button;
import org.openqa.selenium.By;

public class InboxSection {

    public Button writeNewEmail = new Button(By.id("newmail"));

    public Button refreshInbox = new Button(By.id("refresh"));

    public Button popUpMessage = new Button(By.xpath("//div[@id=\"msgpop\"]//div[@class=\"msgpop-dialog\"]"));

}
