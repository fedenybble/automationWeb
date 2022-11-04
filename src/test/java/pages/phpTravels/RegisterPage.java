package pages.phpTravels;

import controlSelenium.Button;
import controlSelenium.Checkbox;
import controlSelenium.Control;
import controlSelenium.Input;
import org.openqa.selenium.By;

public class RegisterPage {

    public Input firstNameInput = new Input(By.id("inputFirstName"));
    public Input lastNameInput = new Input(By.id("inputLastName"));
    public Input emailInput = new Input(By.id("inputEmail"));
    public Input phoneNumberInput = new Input(By.id("inputPhone"));
    public Input streetAddressInput = new Input(By.id("inputAddress1"));
    public Input streetAddress2Input = new Input(By.id("inputAddress2"));
    public Input cityInput = new Input(By.id("inputCity"));
    public Input stateInput = new Input(By.id("stateinput"));
    public Input postCodeInput = new Input(By.id("inputPostcode"));
    public Button selectCountryButton = new Button(By.id("inputCountry"));
    public Button optionSelected = new Button(By.xpath("//option[@value=\"BR\"]"));
    public Input mobileWppNumberInput = new Input(By.id("customfield2"));
    public Input newPasswordInput = new Input(By.id("inputNewPassword1"));
    public Input confirmNewPasswordInput = new Input(By.id("inputNewPassword2"));
    public Button captchaButton = new Button(By.id("recaptcha-anchor-label"));
    public Button registerButton = new Button(By.xpath("//input[@value=\"Register\"]"));
    public Control captchaFrame = new Control(By.xpath("//iframe[@title=\"reCAPTCHA\"]"), "captchaFrame");
    //public Checkbox captchaCheckbox = new Checkbox(By.xpath("//div[@class=\"recaptcha-checkbox-border\"]"), "[Captcha] Button on registration page");

}
