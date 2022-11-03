package cleanTest.todoist;

import io.qameta.allure.Attachment;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.todoist.*;
import singletonSession.Session;

public class TestBaseTodoist {

    public MainPage mainPageTodoist = new MainPage();
    public LoginModal loginModal = new LoginModal();
    public ProjectSection projectSection = new ProjectSection();
    public AddProjectModal addProjectModal = new AddProjectModal();
    public ProjectModal projectModal = new ProjectModal();
    public EditModal editModal = new EditModal();
    public TaskSection taskSection = new TaskSection();


    @BeforeEach
    public void setup(){
        Session.getInstance().getBrowser().get("https://todoist.com/es");
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
