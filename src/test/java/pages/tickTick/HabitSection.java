package pages.tickTick;

import controlSelenium.Button;
import controlSelenium.Input;
import org.openqa.selenium.By;

public class HabitSection {

    public Button createNewHabit = new Button(By.xpath("//*[@class=\"inline-block w-[18px] h-[18px] mr-[8px] cursor-pointer\"]"));

    public Input setNewHabitName = new Input(By.xpath("//input[@placeholder=\"Daily Check-in\"]"));
    public Button saveNewHabitButton = new Button(By.xpath("//button[text()=\"Save\"]"));




}
