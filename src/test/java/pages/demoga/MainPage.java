package pages.demoga;

import controlSelenium.Button;
import org.openqa.selenium.By;

public class MainPage {

    public Button elementButton = new Button(By.xpath("//li[@class=\"mt-2 list-group-item list-group-item-action\" and text()=\"Cras justo odio\"]"));
    public Button elementButtonError = new Button(By.xpath("//li[@class=\"mt-2 list-group-item list-group-item-action\" and text()=\"Dapibus ac facilisis in\"]"));

}
