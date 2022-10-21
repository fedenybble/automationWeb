package controlSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import singletonSession.Session;

public class Control {

    protected By locator;
    protected WebElement control;

    public Control (By locator){
        this.locator=locator;
    }

    protected void findControl(){
        control= Session.getInstance().getBrowser().findElement(this.locator);
    }

    /**
     *
     */
    public void click(){
        this.findControl();
        control.click();
    }

    public void clear(){
        this.findControl();
        control.clear();
    }

    public boolean isControlDisplayed(){
        try {
            this.findControl();
            return control.isDisplayed();
        }catch (Exception e){
            return false;
        }
    }

    public String getText(){
        this.findControl();
        return control.getText();
    }

    public String getAttribute(String name){
        this.findControl();
        return control.getAttribute(name);
    }




}
