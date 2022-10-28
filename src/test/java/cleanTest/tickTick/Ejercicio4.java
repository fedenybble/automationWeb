package cleanTest.tickTick;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import java.util.Date;

public class Ejercicio4 extends TestBaseTickTick {

    String newEmail = getAlphaNumericString(5)+"@gmail.com";
    String password = "passwordforautomation";
    String newPassword = "NewpasswordForAutomation!";
    String newHabitName = "newHabit"+new Date().getTime();

    static String getAlphaNumericString(int n) {

        // chose a Character random from this String
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {

            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int)(AlphaNumericString.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                    .charAt(index));
        }

        return sb.toString();
    }

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


        // ----- CHANGE PASSWORD -----
        projectSection.skipButton.click();
        sideBar.profileButton.click();
        sideBar.settingsButton.click();
        settingsPage.accountAndSecurityBtn.click();
        settingsPage.changePasswordBtn.click();
        settingsPage.currentPwdInput.setText(password);
        settingsPage.newPasswordInput.setText(newPassword);
        settingsPage.saveButton.click();
        settingsPage.doneButton.click();

        // ----- LOGIN WITH NEW PASSWORD -----
        sideBar.profileButton.click();
        sideBar.signOutButton.click();
        mainPage.signInButton.click();
        loginPage.loginInInput.setText(newEmail);
        loginPage.passwordInput.setText(newPassword);
        loginPage.signInButton.click();

        Assertions.assertFalse(loginPage.incorrectCredentialsMsg.isControlDisplayed(), "ERROR: incorrect username or password");

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

        Assertions.assertFalse(loginPage.incorrectCredentialsMsg.isControlDisplayed(), "ERROR: incorrect username or password.");

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

        Assertions.assertTrue(taskSection.repeatIcon.isControlDisplayed(), "ERROR: due date was not setted.");

        Thread.sleep(3000);
    }

    @Test
    @Order(4)
    public void createNewHabit() throws InterruptedException {

        projectSection.skipButton.click();
        sideBar.habitButton.click();
        habitSection.createNewHabit.click();
        habitSection.setNewHabitName.setText(newHabitName);
        habitSection.saveNewHabitButton.click();

        Assertions.assertTrue(habitSection.totalLabel.isControlDisplayed(), "ERROR: No Habit was created");

        Thread.sleep(3000);
    }

    @Test
    @Order(5)
    public void editTimeFormat() throws InterruptedException{

        projectSection.skipButton.click();
        sideBar.profileButton.click();
        sideBar.settingsButton.click();
        preferenceSection.editTimeFormatButton.click();
        preferenceSection.optionTimeButton.click();
        settingsPage.doneButton.click();

        Assertions.assertTrue(sideBar.profileButton.isControlDisplayed(), "ERROR: Time format was not edited.");

        Thread.sleep(3000);

    }

    @Test
    @Order(6)
    public void editTheme() throws InterruptedException{

        projectSection.skipButton.click();
        sideBar.profileButton.click();
        sideBar.settingsButton.click();
        settingsPage.themeButton.click();
        settingsPage.newThemeOption.click();
        settingsPage.doneButton.click();

        Assertions.assertTrue(sideBar.profileButton.isControlDisplayed(), "ERROR: The theme was not edited. ");

        Thread.sleep(3000);

    }


}
