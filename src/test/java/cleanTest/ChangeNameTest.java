package cleanTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pages.todoLy.SettingsModal;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class ChangeNameTest extends TestBaseTodoLy {

    @Test
    public void changeNameSuccessfully() throws InterruptedException {
        mainPage.loginButton.click();
        loginModal.emailTextBox.setText("selenium@selenium2022.com");
        loginModal.passwordTextBox.setText("12345");
        loginModal.loginButton.click();
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR login was not successfully");

        Thread.sleep(1000);

        menuSection.settingsButton.click();
        settingsModal.nameTextBox.click();
        settingsModal.nameTextBox.clear();
        settingsModal.nameTextBox.setText("Nuevo update fede padin");
        settingsModal.okButton.click();

        //Validacion
        Assertions.assertEquals("Nuevo update fede padin", settingsModal.nameTextBox.getAttribute("value"), "ERROR: No se ha editado el nombre");




    }
}
