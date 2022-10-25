package cleanTest.todoist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.interactions.Actions;

import java.util.Date;
import java.util.function.BooleanSupplier;

public class CRUDProject extends TestBaseTodoist{

    @BeforeEach
    public void verifyLoginTodoist(){
        mainPageTodoist.loginButtonNavbar.click();
        loginModal.inputEmail.click();
        loginModal.inputEmail.setText("fedepadin98@gmail.com");
        loginModal.inputPassword.click();
        loginModal.inputPassword.setText("ejemploparaautomation");
        loginModal.buttonLogin.click();
        projectSection.newProjectButton.waitClickable();
    }

    @Test
    public void CRUDProject(){

        String newProjectName = "New project"+new Date().getTime();
        String newProjectNameEdit = "New project edit"+new Date().getTime();

        // ------------- CREATE PROJECT -------------

        projectSection.newProjectButton.click();
        addProjectModal.newProjectName.click();
        addProjectModal.newProjectName.setText(newProjectName);
        addProjectModal.addNewProject.waitClickable();
        addProjectModal.addNewProject.click();

        Assertions.assertTrue(projectSection.newProject.isControlDisplayed(), "ERROR: NO se ha creado el proyecto correctamente");

       //  ------------- EDIT PROJECT -------------

        projectSection.newProject.click();
        projectSection.editProjectOption.click();
        addProjectModal.newProjectName.clear();
        addProjectModal.newProjectName.setText(newProjectNameEdit);
        String valorDefaultValue = addProjectModal.newProjectName.getAttribute("defaultValue");
        addProjectModal.addNewProject.waitClickable();
        addProjectModal.addNewProject.click();
        projectSection.newProjectButton.waitClickable();

        Assertions.assertEquals(newProjectNameEdit, valorDefaultValue, "ERROR: NO se ha editado el nombre correctamente");

        //  ------------- DELETE PROJECT -------------

        projectSection.newProject.click();
        projectSection.deleteProjectOption.click();
        projectSection.deleteButton.waitClickable();
        projectSection.deleteButton.click();

        Assertions.assertFalse(projectSection.newProject.isControlDisplayed(), "ERROR: NO se ha eliminado el proyecto correctamente");


    }
}
