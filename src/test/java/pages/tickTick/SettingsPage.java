package pages.tickTick;

import controlSelenium.Button;
import controlSelenium.Input;
import org.openqa.selenium.By;

public class SettingsPage {

    public Button accountAndSecurityBtn = new Button(By.xpath("//span[text()=\"Account and Security\"]"));
    public Button changePasswordBtn = new Button(By.xpath("//a[text()=\"Change Password\"]"));
    public Input currentPwdInput = new Input(By.xpath("//div[@style=\"display: block;\"]//input[@placeholder=\"Current Password\"]"));
    public Input newPasswordInput = new Input(By.xpath("//div[@style=\"display: block;\"]//input[@placeholder=\"New password\"]"));
    public Button saveButton = new Button(By.xpath("//button[text()=\"Save\"]"));
    public Button doneButton = new Button(By.xpath("//button[text()=\"Done\"]"));
}
