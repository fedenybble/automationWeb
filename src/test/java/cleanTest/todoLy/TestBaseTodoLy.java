package cleanTest.todoLy;

import io.qameta.allure.Attachment;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.todoLy.*;
import singletonSession.Session;
import utils.GetProperties;

public class TestBaseTodoLy {
    public MainPage mainPage=new MainPage();
    public LoginModal loginModal= new LoginModal();
    public MenuSection menuSection= new MenuSection();
    public SettingsModal settingsModal = new SettingsModal();
    public NewProjectLeftBar createNewProject = new NewProjectLeftBar();

    public TaskModal taskModal = new TaskModal();

    @BeforeEach
    public void setup(){
        // todo create properties file
        Session.getInstance().getBrowser().get(GetProperties.getInstance().getHost());
    }
    @AfterEach
    public void cleanup(){
        attach();
        Session.getInstance().closeBrowser();
    }

    @Attachment(value = "screenshot", type = "image/png")
    private byte[] attach(){
        //Tomar captura de pantalla - Adjuntarlo en el reporte
        return ((TakesScreenshot) Session.getInstance().getBrowser()).getScreenshotAs(OutputType.BYTES);
    }

}
