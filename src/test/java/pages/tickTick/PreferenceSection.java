package pages.tickTick;

import controlSelenium.Button;
import controlSelenium.Label;
import org.openqa.selenium.By;

public class PreferenceSection {

    public Button editTimeFormatButton = new Button(By.xpath("//div[text()=\"24 Hour\"]"));
    public Button optionTimeButton = new Button(By.xpath("//span[text()=\"12 Hour\"]"));

    public Label timeFormatLabel = new Label(By.xpath("//div[@data-toggle=\"dropdown\" and text()=\"12 Hour\"]"));

}
