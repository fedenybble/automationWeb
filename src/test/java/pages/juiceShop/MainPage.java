package pages.juiceShop;

import controlSelenium.Button;
import org.openqa.selenium.By;

public class MainPage {

    public Button popUpButton = new Button(By.xpath("//button[@aria-label=\"Close Welcome Banner\"]"));
    public Button accountButton = new Button(By.id("navbarAccount"));
    public Button navBarLoginButton = new Button(By.id("navbarLoginButton"));

    public Button navBarLogoutButton = new Button(By.id("navbarLogoutButton"));
    public Button yourBasketButton = new Button(By.xpath("//button[@class=\"mat-focus-indicator buttons mat-button mat-button-base ng-star-inserted\"]"));

}
