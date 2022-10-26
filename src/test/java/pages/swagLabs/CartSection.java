package pages.swagLabs;

import controlSelenium.Label;
import org.openqa.selenium.By;

public class CartSection {

    public Label cartProductName = new Label(By.xpath("//div[@class=\"inventory_item_name\" and text()=\"Sauce Labs Onesie\"]"));


}
