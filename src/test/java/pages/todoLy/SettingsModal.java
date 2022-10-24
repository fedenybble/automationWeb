package pages.todoLy;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class SettingsModal {

    public TextBox nameTextBox = new TextBox(By.id("FullNameInput"));
    public Button okButton = new Button(By.xpath("//span[@class=\"ui-button-text\" and text()=\"Ok\"]"));
}
