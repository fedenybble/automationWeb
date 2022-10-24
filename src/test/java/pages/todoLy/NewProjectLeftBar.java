package pages.todoLy;

import controlSelenium.Button;
import controlSelenium.Input;
import org.openqa.selenium.By;

public class NewProjectLeftBar {

    public Button createProjectButton = new Button(By.xpath("//td[@class=\"ProjItemContent\" and text()=\"Add New Project\"]"));

    public Input createProjectInput = new Input(By.id("NewProjNameInput"));

    public Button createProjectAdd = new Button(By.id("NewProjNameButton"));

    public Button selectProject = new Button(By.xpath("//div[@id=\"ProjectListPlaceHolder\"]//td[@class=\"ProjItemContent\" and text()=\"New project automation\"]"));
}
