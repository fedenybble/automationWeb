package pages.tickTick;

import controlSelenium.Button;
import controlSelenium.Input;
import controlSelenium.Label;
import org.openqa.selenium.By;

public class TaskSection {

    public Button selectNewTaskToEdit = new Button(By.xpath("//span[text()=\"Welcome to TickTick\"]"));

    public Label repeatIcon = new Label(By.xpath("//*[@class=\"icon-item-repeat color-isolate w-full h-full text-grey-20 mr-[2px] last:mr-0\"]"));
    public Button dueDateButton = new Button(By.xpath("//span[@class=\"inline-flex overflow-hidden group cursor-pointer\"]"));
    public Button repeatTaskButton = new Button(By.xpath("//div[@class=\"multi-select-toggle px-[12px] group relative\"]"));
    public Button weeklyOptionButton = new Button(By.xpath("//span[text()=\"Weekly\"]"));
    public Button okButton = new Button(By.xpath("//button[text()=\"OK\"]"));

}
