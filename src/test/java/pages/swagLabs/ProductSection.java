package pages.swagLabs;

import controlSelenium.Button;
import controlSelenium.Label;
import org.openqa.selenium.By;

public class ProductSection {

    public Button firstProductButton = new Button(By.id("add-to-cart-sauce-labs-onesie"));

    public Label productNameError = new Label(By.xpath("//div[@class=\"inventory_item_name\" and text()=\"Sauce Labs Bike Light\"]"));
    public Label firstProductName = new Label(By.xpath("//div[@class=\"inventory_item_name\" and text()=\"Sauce Labs Onesie\"]"));

}
