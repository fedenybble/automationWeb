package pages.todoist;

import controlSelenium.Button;
import controlSelenium.Input;
import controlSelenium.Label;
import org.openqa.selenium.By;

public class TaskSection {

    public Button createNewTaskButton = new Button(By.xpath("//button[@class=\"plus_add_button\"]"));
    public Input newTaskNameButton = new Input(By.xpath("//div[@class=\"notranslate public-DraftEditor-content\"]"));
    public Button expirationDateButton = new Button(By.xpath("//button[@class=\"item_due_selector icon_pill\"]"));
    public Button tomorrowOptionDateButton = new Button(By.xpath("//button[@data-track=\"scheduler|date_shortcut_tomorrow\"]"));
    public Button priorityButton = new Button(By.xpath("//button[@aria-label=\"Establecer prioridad\"]"));
    public Button firstPriorityButton = new Button(By.xpath("//span[@class=\"priority_picker_item_name\" and text()=\"Prioridad 1\"]"));

    public Button addNewTaskButton = new Button(By.xpath("//button[@data-testid=\"task-editor-submit-button\"]"));
    public Label expirationDateLabel = new Label(By.xpath("//div[@class=\"task_list_item__info_tags\"]"));
    public Label noTaskLabel = new Label(By.xpath("//div[@class=\"empty-state-header a83bd4e0 _39f4eb1f f9408a0e\"]"));

    public Button findTaskByName(String taskName){

        Button task = new Button(By.xpath("//div[@class=\"markdown_content task_content\" and text()='"+ taskName +"']"));

        return task;

    }


}
