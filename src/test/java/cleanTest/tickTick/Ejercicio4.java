package cleanTest.tickTick;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import java.util.Date;

public class Ejercicio4 extends TestBaseTickTick {

    String newEmail = new Date().getTime()+"@gmail.com";
    String password = "passwordforautomation";
    String newPassword = "NewpasswordForAutomation!";
    String newTitle = "This is the new title";

    @BeforeEach
    public void signUp() throws InterruptedException {
        mainPage.signUpForFreeButton.click();
        signUpPage.newEmailInput.setText(newEmail);
        signUpPage.newPasswordInput.setText(password);
        signUpPage.signUpButton.click();

        Thread.sleep(5000);
    }

    @Test
    @Order(1)
    public void changePassword() throws InterruptedException {

        projectSection.skipButton.click();
        sideBar.profileButton.click();
        sideBar.settingsButton.click();
        settingsPage.accountAndSecurityBtn.click();
        settingsPage.changePasswordBtn.click();
        settingsPage.currentPwdInput.setText(password);
        settingsPage.newPasswordInput.setText(newPassword);
        settingsPage.saveButton.click();
        settingsPage.doneButton.click();
        Thread.sleep(3000);

    }

    @Test
    @Order(2)
    public void signInWithNewAccount() throws InterruptedException {

        projectSection.skipButton.click();
        sideBar.profileButton.click();
        sideBar.signOutButton.click();
        mainPage.signInButton.click();
        loginPage.loginInInput.setText(newEmail);
        loginPage.passwordInput.setText(password);
        loginPage.signInButton.click();

        Thread.sleep(3000);

    }

    @Test
    @Order(3)
    public void setDueDateTask() throws InterruptedException {

        projectSection.skipButton.waitToBePresent();
        projectSection.skipButton.click();
        taskSection.selectNewTaskToEdit.click();
        taskSection.dueDateButton.click();
        taskSection.repeatTaskButton.click();
        taskSection.weeklyOptionButton.click();
        taskSection.okButton.click();

        Thread.sleep(3000);

    }


}
