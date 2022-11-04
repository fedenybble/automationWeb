package pages.phpTravels;

import controlSelenium.Button;
import controlSelenium.Label;
import org.openqa.selenium.By;

public class MainPage {

    public Button signUpButton = new Button(By.xpath("//a[@class=\"jfHeader-menuListLink jfHeader-dynamicLink jfHeader-signup-action\"]"));
    public Button loginButton = new Button(By.xpath("//a[@class=\"jfHeader-menuListLink jfHeader-dynamicLink jfHeader-login-action\"]"));
    public Button dropDownButton = new Button(By.xpath("//a[@class=\" dropdown-toggle\"]"));
    public Button logoutButton = new Button(By.id("Secondary_Navbar-Account-Logout"));

    public Label checkYourInfoLabel(String firstName, String lastName){

        Label infoLabel = new Label(By.xpath("//strong[text()='"+firstName+" "+lastName+"']"));

        return  infoLabel;
    }

}
