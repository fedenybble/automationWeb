package pages.phpTravels;

import controlSelenium.Button;
import controlSelenium.Label;
import org.openqa.selenium.By;

public class MainPage {

    public Button signUpButton = new Button(By.xpath("//a[@class=\"jfHeader-menuListLink jfHeader-dynamicLink jfHeader-signup-action\"]"));
    public Button loginButton = new Button(By.xpath("//a[@class=\"jfHeader-menuListLink jfHeader-dynamicLink jfHeader-login-action\"]"));

    public Label checkYourInfoLabel(String firstName, String lastName){

        Label infoLabel = new Label(By.xpath("//strong[text()='"+firstName+" "+lastName+"']"));

        return  infoLabel;
    }

}
