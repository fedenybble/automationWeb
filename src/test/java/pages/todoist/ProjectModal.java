package pages.todoist;

import controlSelenium.Button;
import controlSelenium.Input;
import controlSelenium.Label;
import org.openqa.selenium.By;

public class ProjectModal {

    public Button newItemButton = new Button(By.xpath("//button[@class=\"plus_add_button\"]"));
    public Input newNameInput = new Input(By.xpath("//div[@class=\"public-DraftStyleDefault-block public-DraftStyleDefault-ltr\"]"));

    public Button setExpirationDateButton = new Button(By.xpath("//button[@class=\"item_due_selector icon_pill\"]"));

    public Button selectExpirationDateButton = new Button(By.xpath("//button[@data-track=\"scheduler|date_shortcut_thisweekend\"]//div[@class=\"scheduler-suggestions-item-weekday\"]"));

    public Button setPriorityButton = new Button(By.xpath("//span[@data-action-hint=\"task-actions-priority-picker\"]"));
    public Button selectPriorityButton = new Button(By.xpath("//span[@class=\"priority_picker_item_name\" and text()=\"Prioridad 2\"]"));

    public Button addNewItemButton = new Button(By.xpath("//button[@data-testid=\"task-editor-submit-button\"]"));

    public Button taskCreated(String taskName) {
        Button task = new Button(By.xpath("//div[text()='" + taskName + "']"));
        return task;
    }

}
