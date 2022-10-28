package pages.tickTick;

import controlSelenium.Button;
import controlSelenium.Input;
import org.openqa.selenium.By;

public class TaskSection {

    public Button selectNewTaskToEdit = new Button(By.xpath("//span[text()=\"Welcome to TickTick\"]"));
    public Button dueDateButton = new Button(By.xpath("//span[@class=\"inline-flex overflow-hidden group cursor-pointer\"]"));
    public Button repeatTaskButton = new Button(By.xpath("//div[@class=\"multi-select-toggle px-[12px] group relative\"]"));
    public Button weeklyOptionButton = new Button(By.xpath("//span[text()=\"Weekly\"]"));
    public Button okButton = new Button(By.xpath("//button[text()=\"OK\"]"));

}
