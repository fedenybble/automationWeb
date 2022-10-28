package pages.tickTick;

import controlSelenium.Button;
import controlSelenium.Input;
import org.openqa.selenium.By;

public class SignUpPage {

    public Input newEmailInput = new Input(By.xpath("//input[@placeholder=\"Email\"]"));
    public Input newPasswordInput = new Input(By.id("password"));
    public Button signUpButton = new Button(By.xpath("//button[@class=\"button__3eXSs \"]"));

}
