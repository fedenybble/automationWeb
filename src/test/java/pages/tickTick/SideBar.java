package pages.tickTick;

import controlSelenium.Button;
import org.openqa.selenium.By;

public class SideBar {

    public Button profileButton = new Button(By.xpath("//img[@class=\"w-[32px] h-[32px] rounded-[6px]\"]"));
    public Button settingsButton = new Button(By.xpath("//span[text()=\"Settings\"]"));
    public Button signOutButton = new Button(By.xpath("//span[text()=\"Sign Out\"]"));
    public Button habitButton = new Button(By.xpath("//a[@href=\"#q/all/habit\"]"));

}
