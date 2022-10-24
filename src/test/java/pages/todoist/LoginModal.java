package pages.todoist;

import controlSelenium.Button;
import controlSelenium.Input;
import org.openqa.selenium.By;

public class LoginModal {

    public Input inputEmail = new Input(By.xpath("//input[@autocomplete=\"email\"]"));

    public Input inputPassword = new Input(By.xpath("//input[@autocomplete=\"current-password\"]"));

    public Button buttonLogin = new Button(By.xpath("//button[@data-gtm-id=\"start-email-login\"]"));


}
