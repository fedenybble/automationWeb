package controlSelenium;

import org.openqa.selenium.By;

public class Input extends Control{

    public Input(By locator) {
        super(locator);
    }

    public void setText(String value){
        this.findControl();
        this.control.sendKeys(value);
    }
}
