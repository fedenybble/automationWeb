package pages.todoLy;

import controlSelenium.Button;
import controlSelenium.Input;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

import java.util.Date;

public class TaskModal {

    public Input newContentInput = new Input(By.id("NewItemContentInput"));

    public Button addNewTask = new Button(By.id("NewItemAddButton"));

    public Button newTask = new Button(By.xpath("//div[@class=\"ItemContentDiv\" and text()=\"Nueva tarea\"]"));

    public Button optionList = new Button(By.xpath("//img[@class=\"ItemMenu\" and @style=\"display: inline;\"]"));

    public Button editOption = new Button(By.xpath("//ul[@id=\"itemContextMenu\"]//a[@href=\"#edit\"]"));

    public TextBox taskTextBox = new TextBox(By.xpath("//ul[@id=\"itemContextMenu\"]//a[@href=\"#edit\"]"));




}
