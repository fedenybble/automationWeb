package pages.todoist;

import controlSelenium.Button;
import controlSelenium.Input;
import org.openqa.selenium.By;

public class AddProjectModal {

    public Input newProjectName = new Input(By.xpath("//input[@id=\"edit_project_modal_field_name\"]"));
    public Button addNewProject = new Button(By.xpath("//button[@class=\"ist_button ist_button_red\"]"));

}
