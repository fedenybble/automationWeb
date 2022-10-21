package basicSelenium;

import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class NewToDo {

    WebDriver driver;

    @BeforeEach
    public void setup(){

        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://todo.ly/");
    }

    @AfterEach
    public void cleanUp(){
        driver.quit();
    }

    @Test
    public void newToDo() throws InterruptedException{

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Actions action = new Actions(driver);

        driver.manage().timeouts().implicitlyWait(Duration.of(10, ChronoUnit.SECONDS));

        String mailName = "ejemplo@ejemplo.com";
        String password = "ejemplo";
        String nameToDo = "Nueva tarea";
        String nameToDoEdit = "Nueva tarea editada";
        // -------------------- LOGIN --------------------

        //Click [Login] button
        driver.findElement(By.xpath("//img[@src=\"/Images/design/pagelogin.png\"]")).click();

        //Set [Email] field
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail")).sendKeys(mailName);

        //Set [Password] field
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword")).sendKeys(password);

        //Click [Login] button
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_ButtonLogin")).click();

        driver.manage().timeouts().implicitlyWait(Duration.of(10, ChronoUnit.SECONDS));

        // -------------------- CLICK IN PROJECT --------------------

        driver.findElement(By.xpath("//td[text()=\"Fede's project\"]")).click();

        wait.until(elementToBeClickable(By.id("NewItemContentInput")));

        // -------------------- CREATE TO DO --------------------

        driver.findElement(By.id("NewItemContentInput")).click();
        driver.findElement(By.id("NewItemContentInput")).sendKeys(nameToDo);
        driver.findElement(By.id("NewItemAddButton")).click();

        driver.manage().timeouts().implicitlyWait(Duration.of(10, ChronoUnit.SECONDS));

        // -------------------- EDIT TO DO --------------------

        driver.findElement(By.xpath("//div[@class=\"ItemContentDiv\" and text()='"+ nameToDo +"']")).click();
        driver.findElement(By.xpath("//div[@class=\"ItemIndicator\"]//img[@style=\"display: inline;\"]")).click();

        driver.manage().timeouts().implicitlyWait(Duration.of(10, ChronoUnit.SECONDS));

        driver.findElement(By.xpath("//ul[@id=\"itemContextMenu\"]//a[@href=\"#edit\"]")).click();

        driver.manage().timeouts().implicitlyWait(Duration.of(10, ChronoUnit.SECONDS));

        driver.findElement(By.xpath("//textarea[@id='ItemEditTextbox']")).clear();
        driver.findElement(By.xpath("//textarea[@id='ItemEditTextbox']")).sendKeys(nameToDoEdit);
        driver.findElement(By.xpath("//textarea[@id='ItemEditTextbox']")).sendKeys(Keys.RETURN);


        // -------------------- DELETE TO DO --------------------

        driver.findElement(By.xpath("//div[@class=\"ItemContentDiv\" and text()='"+nameToDoEdit+"']")).click();
        driver.findElement(By.xpath("//div[@class=\"ItemIndicator\"]//img[@style=\"display: inline;\"]")).click();

        driver.manage().timeouts().implicitlyWait(Duration.of(10, ChronoUnit.SECONDS));

        driver.findElement(By.xpath("//ul[@id=\"itemContextMenu\"]//a[@href=\"#delete\"]")).click();

        wait.until(elementToBeClickable(By.xpath("//span[@id='InfoMessageText']")));
        Assertions.assertEquals("Item has been Deleted",driver.findElement(By.xpath("//span[@id='InfoMessageText']")).getText(),"ERROR no se borro el item");

        Thread.sleep(10000);

    }


}
