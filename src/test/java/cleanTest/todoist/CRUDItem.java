package cleanTest.todoist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import singletonSession.Session;

import java.time.Duration;
import java.util.Date;

public class CRUDItem extends TestBaseTodoist {

    @BeforeEach
    public void verifyLoginTodoist() throws InterruptedException {
        mainPageTodoist.loginButtonNavbar.click();
        loginModal.inputEmail.click();
        loginModal.inputEmail.setText("fedepadin98@gmail.com");
        loginModal.inputPassword.click();
        loginModal.inputPassword.setText("ejemploparaautomation");
        loginModal.buttonLogin.click();
        //projectSection.newProjectButton.waitIsVisible();
        Thread.sleep(3000);
    }

    @Test
    public void CRUDItem() throws InterruptedException {

        String newProjectName = "New project"+new Date().getTime();
        String newItemName = "New item"+new Date().getTime();

        // ------------- CREATE PROJECT -------------

        projectSection.newProjectButton.click();
        addProjectModal.newProjectName.click();
        addProjectModal.newProjectName.setText(newProjectName);
        addProjectModal.addNewProject.waitClickable();
        addProjectModal.addNewProject.click();

        // ------------- CREATE NEW ITEM -------------

        projectModal.newItemButton.click();
        projectModal.newNameInput.waitIsVisible();
        projectModal.newNameInput.setText(newItemName);
        projectModal.setExpirationDateButton.click();
        projectModal.selectExpirationDateButton.click();
        projectModal.setPriorityButton.click();
        projectModal.selectPriorityButton.click();
        projectModal.addNewItemButton.click();
        System.out.println("Item creado");
        projectModal.taskCreated(newItemName).waitIsVisible();


        // ------------- EDIT ITEM -------------

        projectModal.taskCreated(newItemName).click();
        System.out.println("Modal de Editar se abre");
        editModal.editExpirationDateButton.waitIsDisplayed();
        editModal.editExpirationDateButton.click();
        editModal.selectExpirationDateButton.click();
        System.out.println("Fecha nueva seteada");
        editModal.editPriorityButton.click();
        editModal.setNewPriorityButton.click();
        System.out.println("Prioridad nueva seteada");
        editModal.closeModal.click();

        // ------------- DELETE ITEM -------------

        projectModal.taskCreated(newItemName).click();
        System.out.println("Modal de Editar PARA BORRAR se abre");
        editModal.threeDotsOption.waitIsVisible();
        editModal.threeDotsOption.click();
        System.out.println("Clickea el icono de Mas Opciones");
        editModal.deleteTaskOption.click();
        System.out.println("Clickea el icono de Delete");
        deleteSection.acceptDeleteButton.click();
        System.out.println("Clickea el boton Eliminar");

        Thread.sleep(5000);

    }

}
