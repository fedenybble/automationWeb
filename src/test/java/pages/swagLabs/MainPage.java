package pages.swagLabs;

import controlSelenium.Button;
import org.openqa.selenium.By;

public class MainPage {

    public Button productSort = new Button(By.xpath("//select[@class=\"product_sort_container\"]"));
    public Button lowToHighOption = new Button(By.xpath("//select[@class=\"product_sort_container\"]//option[@value=\"lohi\"]"));

    public Button cartIcon = new Button(By.xpath("//a[@class=\"shopping_cart_link\"]"));

}
