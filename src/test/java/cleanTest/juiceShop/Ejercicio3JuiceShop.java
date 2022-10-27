package cleanTest.juiceShop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.event.MouseAdapter;
import java.util.Date;

public class Ejercicio3JuiceShop extends TestBaseJuiceShop{



    @Test
    public void verifyLoginLogout() throws InterruptedException {

        String newEmail = new Date().getTime()+"@email.com";
        String password = "newpassword12345";
        String answer = "answer";

        // ----------- MAIN PAGE -----------
        mainPage.popUpButton.click();
        mainPage.accountButton.click();
        mainPage.navBarLoginButton.click();

        loginPage.registerButton.click();


        // ----------- REGISTRATION -----------
        registrationModal.registerEmailInput.setText(newEmail);
        registrationModal.registerPasswordInput.setText(password);
        registrationModal.repeatPasswordInput.setText(password);
        //registrationModal.comboBoxSecurityQuestion.waitClickable();
        registrationModal.comboBoxSecurityQuestion.click();
        registrationModal.firstOptionSecurityQuestion.click();
        registrationModal.answerInput.setText(answer);
        //registrationModal.registerButton.waitPropertyToChange("willValidate", "true");
//        registrationModal.registerButton.waitClickable();
//        registrationModal.registerButton.waitToBePresent();
        Thread.sleep(3000);
        registrationModal.registerButton.click();

        Assertions.assertTrue(loginPage.loginLabel.isControlDisplayed(), "ERROR");


        // ----------- LOGIN -----------
        loginPage.loginEmailInput.setText(newEmail);
        loginPage.loginPasswordInput.setText(password);
        loginPage.loginButton.click();

        Assertions.assertTrue(mainPage.yourBasketButton.isControlDisplayed(), "ERROR");

        // ----------- LOGOUT -----------
        mainPage.accountButton.click();
        mainPage.navBarLogoutButton.click();

        Assertions.assertTrue(mainPage.yourBasketButton.isControlDisplayed(), "ERROR");

        Thread.sleep(3000);


    }

}
