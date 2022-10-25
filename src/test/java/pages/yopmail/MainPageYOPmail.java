package pages.yopmail;

import controlSelenium.Button;
import controlSelenium.Input;
import org.openqa.selenium.By;

public class MainPageYOPmail {

    public Input newEmail = new Input(By.xpath("//input[@id=\"login\"]"));
    public Button arrowButton = new Button(By.xpath("//i[@class=\"material-icons-outlined f36\"]"));

}
