package pages.juiceShop;

import controlSelenium.Button;
import controlSelenium.Input;
import controlSelenium.Label;
import org.openqa.selenium.By;

public class LoginPage {

    public Button registerButton = new Button(By.id("newCustomerLink"));
    public Input loginEmailInput = new Input(By.id("email"));
    public Input loginPasswordInput = new Input(By.id("password"));
    public Button loginButton = new Button(By.id("loginButton"));

    public Label loginLabel = new Label(By.xpath("//h1[text()=\"Login\"]"));

}
