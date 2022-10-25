package pages.yopmail;

import controlSelenium.Button;
import controlSelenium.Input;
import controlSelenium.Label;
import org.openqa.selenium.By;

public class NewMessageSection {

    public Label title = new Label(By.xpath("//div[@style=\"display:flex;position: relative;\"]//div[@class=\"msgtitle ycolor\"]"));
    public Input recipientToInput = new Input(By.id("msgto"));
    public Input subjectInput = new Input(By.xpath("//div[@class=\"inputsend\"]//input[@id=\"msgsubject\"]"));
    public Input emailInput = new Input(By.xpath("//main[@class=\"yscrollbar\"]//div[@id=\"msgbody\"]"));

    public Label sendMessage = new Label (By.xpath("//button[@id=\"msgsend\"]"));

}
