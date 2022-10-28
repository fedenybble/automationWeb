package cleanTest.tickTick;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import pages.tickTick.*;
import singletonSession.Session;

public class TestBaseTickTick {

    MainPage mainPage = new MainPage();
    SignUpPage signUpPage = new SignUpPage();
    ProjectSection projectSection = new ProjectSection();
    SideBar sideBar = new SideBar();
    SettingsPage settingsPage = new SettingsPage();
    LoginPage loginPage = new LoginPage();
    TaskSection taskSection = new TaskSection();
    HabitSection habitSection = new HabitSection();
    PreferenceSection preferenceSection = new PreferenceSection();



    @BeforeEach
    public void setup(){
        Session.getInstance().getBrowser().get("https://ticktick.com/");
    }

    @AfterEach
    public void cleanup(){
        Session.getInstance().closeBrowser();
    }

}
