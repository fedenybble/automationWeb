package cleanTest.todoLy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class CRUDTask extends TestBaseTodoLy {

    @BeforeEach
    public void login(){
        mainPage.loginButton.click();
        loginModal.emailTextBox.setText("ejemplo@ejemplo.com");
        loginModal.passwordTextBox.setText("ejemplo");
        loginModal.loginButton.click();
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),
                "ERROR login was not successfully");
    }

    @Test
    public void CRUDTask() throws InterruptedException {

        // ---------------- CREATE PROJECT ----------------

        String newProjectName = "New project "+new Date().getTime();

        createNewProject.createProjectButton.click();
        createNewProject.createProjectInput.click();
        createNewProject.createProjectInput.setText(newProjectName);
        createNewProject.createProjectAdd.click();
        createNewProject.selectProject.click();


        // ---------------- CREATE TASK ----------------

        taskModal.newContentInput.setText("Nueva tarea");
        taskModal.addNewTask.click();
        taskModal.newTask.waitClickable();
        taskModal.newTask.click();

        // ---------------- EDIT TASK ----------------

        taskModal.optionList.waitClickable();
        taskModal.optionList.click();
        taskModal.editOption.waitClickable();
        taskModal.editOption.click();
        taskModal.taskTextBox.setText("Nueva tarea editada");

        Thread.sleep(2000);
    }



}
