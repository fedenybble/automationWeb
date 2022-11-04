package pages.phpTravels;

import controlSelenium.Button;
import controlSelenium.Control;
import controlSelenium.Input;
import org.openqa.selenium.By;

public class LoginPage {

    public Input emailInput = new Input(By.id("inputEmail"));
    public Input passwordInput = new Input(By.id("inputPassword"));
    public Control captchaFrame = new Control(By.xpath("//iframe[@title=\"reCAPTCHA\"]"), "captchaFrame");
    public Button captchaButton = new Button(By.xpath("//div[@class=\"recaptcha-checkbox-checkmark\"]"));
    public Button loginButton = new Button(By.id("login"));


}
