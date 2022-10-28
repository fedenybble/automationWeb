package cleanTest.todoist;

import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import singletonSession.Session;

import java.time.Duration;
import java.util.Date;

public class CRUDItem extends TestBaseTodoist {

    @BeforeEach
    public void verifyLoginTodoist() throws InterruptedException {
        mainPageTodoist.loginButtonNavbar.click();
        loginModal.inputEmail.setText("fedepadin98@gmail.com");
        loginModal.inputPassword.setText("ejemploparaautomation");
        loginModal.buttonLogin.click();

    }

    @Test
    public void CRUDItem() throws InterruptedException {

        String newProjectName = "New project"+new Date().getTime();
        String newTaskName = "New name"+new Date().getTime();

        // ---------- CREATE NEW PROJECT ----------
        projectSection.createNewProjectButton.click();
        projectModal.newProjectNameInput.setText(newProjectName);
        projectModal.createNewProjectButton.click();

        // ---------- CREATE NEW TASK ----------
        taskSection.createNewTaskButton.click();
        taskSection.newTaskNameButton.setText(newTaskName);
        String actualTaskName = taskSection.newTaskNameButton.getText();
        taskSection.expirationDateButton.click();
        taskSection.tomorrowOptionDateButton.click();
        taskSection.priorityButton.click();
        taskSection.firstPriorityButton.click();
        taskSection.addNewTaskButton.click();
        Assertions.assertEquals(newTaskName, actualTaskName, "ERROR: new task was not created.");

        // ---------- EDIT TASK ----------
        taskSection.findTaskByName(newTaskName).click();
        editModal.editExpirationDateButton.click();
        editModal.newExpirationDateButton.click();
        editModal.editPriorityButton.click();
        editModal.scndPriorityOptionButton.click();
        editModal.closeWindowButton.click();
        Assertions.assertEquals("lunes", taskSection.expirationDateLabel.getText(), "ERROR: expiration date was not updated.");

        // ---------- DELETE TASK ----------
        taskSection.findTaskByName(newTaskName).click();
        // editModal.closeWindowButton.click();
        editModal.moreOptionsButton.click();
        editModal.deleteOptionButton.click();
        editModal.confirmDeleteButton.click();
        Assertions.assertTrue(taskSection.noTaskLabel.isControlDisplayed(), "ERROR: the task was not deleted.");

        Thread.sleep(3000);

    }

}
