package pages.tickTick;

import controlSelenium.Button;
import controlSelenium.Input;
import org.openqa.selenium.By;

public class LoginPage {

    public Input loginInInput = new Input(By.id("emailOrPhone"));
    public Input passwordInput = new Input(By.id("password"));
    public Button signInButton = new Button(By.xpath("//button[text()=\"Sign In\"]"));

}
