package cleanTest.phpTravels;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import singletonSession.Session;

import java.util.Date;

public class RegisterAndLogin extends TestBasePhpTravels{

    @Test
    @Tag("phpRegister")
    public void verifyRegisterAndLogin() throws InterruptedException {

        String firstName = "federico";
        String lastName = "perez";
        String emailAddress = new Date().getTime()+"@gmail.com";
        String phoneNumber = "1154347789";
        String streetAddress = "Street Address for Example";
        String streetAddress2 = "Street Address for Automation";
        String city = "Sao Paulo";
        String state = "Sao Paulo";
        String postCode = "12345";
        String mobileWppNumber = "2345234523";
        String newPassword = "ejemploForAutomation123";

        // ----- REGISTER -----

        mainPage.signUpButton.waitClickable();
        mainPage.signUpButton.click();

        String currentTab = Session.getInstance().getBrowser().getWindowHandle();
        for (String tab : Session.getInstance().getBrowser().getWindowHandles()) {
            if (!tab.equals(currentTab)) {
                Session.getInstance().getBrowser().switchTo().window(tab);
            }
        }

        registerPage.firstNameInput.waitIsVisible();
        registerPage.firstNameInput.waitToBePresent();
        registerPage.firstNameInput.setText(firstName);
        registerPage.lastNameInput.setText(lastName);
        registerPage.emailInput.setText(emailAddress);
        registerPage.phoneNumberInput.setText(phoneNumber);
        registerPage.streetAddressInput.setText(streetAddress);
        registerPage.streetAddress2Input.setText(streetAddress2);
        registerPage.cityInput.setText(city);
        registerPage.stateInput.setText(state);
        registerPage.postCodeInput.setText(postCode);
        registerPage.mobileWppNumberInput.setText(mobileWppNumber);
        registerPage.newPasswordInput.setText(newPassword);
        registerPage.confirmNewPasswordInput.setText(newPassword);

        Session.getInstance().getBrowser().switchTo().frame(registerPage.captchaFrame.getAttribute("name"));
        registerPage.captchaButton.click();
        registerPage.captchaButton.click();

        Thread.sleep(10000);

        Session.getInstance().getBrowser().switchTo().defaultContent();

        registerPage.registerButton.waitClickable();
        registerPage.registerButton.click();

        Session.getInstance().getBrowser().close();
        Session.getInstance().getBrowser().switchTo().window(currentTab);

        // ----- LOGIN -----

        mainPage.loginButton.waitClickable();
        mainPage.loginButton.click();

        currentTab = Session.getInstance().getBrowser().getWindowHandle();
        for (String tab : Session.getInstance().getBrowser().getWindowHandles()) {
            if (!tab.equals(currentTab)) {
                Session.getInstance().getBrowser().switchTo().window(tab);
            }
        }

        Thread.sleep(5000);

        Assertions.assertTrue(mainPage.checkYourInfoLabel(firstName, lastName).isControlDisplayed());

        mainPage.dropDownButton.waitClickable();
        mainPage.dropDownButton.click();
        mainPage.logoutButton.waitClickable();
        mainPage.logoutButton.click();

        Assertions.assertTrue(loginPage.loginButton.isControlDisplayed());

        Thread.sleep(5000);




    }
}
