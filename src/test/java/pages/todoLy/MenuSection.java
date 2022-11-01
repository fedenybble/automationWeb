package pages.todoLy;

import controlSelenium.Button;
import org.openqa.selenium.By;

public class MenuSection {
    public Button logoutButton = new Button(By.xpath("//a[text()='Logout']"),"[logout] option min the menu section");
    public Button settingsButton = new Button(By.xpath("//a[@href=\"javascript:OpenSettingsDialog();\"]"), "[settings] option");

}
