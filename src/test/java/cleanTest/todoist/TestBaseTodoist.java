package cleanTest.todoist;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.todoist.*;
import singletonSession.Session;

public class TestBaseTodoist {

    public MainPage mainPageTodoist = new MainPage();
    public LoginModal loginModal = new LoginModal();

    public ProjectSection projectSection = new ProjectSection();

    public AddProjectModal addProjectModal = new AddProjectModal();

    public ProjectModal projectModal = new ProjectModal();

    public EditModal editModal = new EditModal();

    public DeleteSection deleteSection = new DeleteSection();


    @BeforeEach
    public void setup(){
        Session.getInstance().getBrowser().get("https://todoist.com/es");
    }

    @AfterEach
    public void cleanup(){
        Session.getInstance().closeBrowser();
    }
}
