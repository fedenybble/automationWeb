package pages.swagLabs;

import controlSelenium.Button;
import controlSelenium.Input;
import org.openqa.selenium.By;

public class LoginModal {

    public Input usernameInput = new Input(By.id("user-name"));
    public Input passwordInput = new Input(By.xpath("//div[@class=\"form_group\"]//input[@id=\"password\"]"));
    public Button loginButton = new Button(By.id("login-button"));


}
