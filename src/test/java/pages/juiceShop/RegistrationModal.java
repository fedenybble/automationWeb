package pages.juiceShop;

import controlSelenium.Button;
import controlSelenium.Input;
import org.openqa.selenium.By;

public class RegistrationModal {

    public Input registerEmailInput = new Input(By.id("emailControl"));
    public Input registerPasswordInput = new Input(By.id("passwordControl"));
    public Input repeatPasswordInput = new Input(By.id("repeatPasswordControl"));
    public Button comboBoxSecurityQuestion = new Button(By.id("mat-select-2"));
    public Button firstOptionSecurityQuestion = new Button(By.id("mat-option-6"));
    public Input answerInput = new Input(By.id("securityAnswerControl"));
    public Button registerButton = new Button(By.id("registerButton"));

}
