package basicSelenium;

import org.junit.jupiter.api.AfterEach;
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

        wait.until(ExpectedConditions.elementToBeClickable(By.id("NewItemContentInput")));

        // -------------------- CREATE TO DO --------------------

        driver.findElement(By.id("NewItemContentInput")).click();
        driver.findElement(By.id("NewItemContentInput")).sendKeys("Nueva tarea");
        driver.findElement(By.id("NewItemAddButton")).click();

        driver.manage().timeouts().implicitlyWait(Duration.of(10, ChronoUnit.SECONDS));


        // -------------------- EDIT TO DO --------------------

        driver.findElement(By.xpath("//div[@class=\"ItemContentDiv\" and text()=\"Nueva tarea\"]")).click();
        driver.findElement(By.xpath("//div[@class=\"ItemIndicator\"]//img[@style=\"display: inline;\"]")).click();

        driver.manage().timeouts().implicitlyWait(Duration.of(10, ChronoUnit.SECONDS));

        driver.findElement(By.xpath("//ul[@id=\"itemContextMenu\"]//a[@href=\"#edit\"]")).click();

        driver.manage().timeouts().implicitlyWait(Duration.of(10, ChronoUnit.SECONDS));

        driver.findElement(By.xpath("//textarea[@id='ItemEditTextbox']")).clear();
        driver.findElement(By.xpath("//textarea[@id='ItemEditTextbox']")).sendKeys("Nueva tarea editada");
        driver.findElement(By.xpath("//textarea[@id='ItemEditTextbox']")).sendKeys(Keys.RETURN);


        // -------------------- DELETE TO DO --------------------

        driver.findElement(By.xpath("//div[@class=\"ItemContentDiv\" and text()=\"Nueva tarea editada\"]")).click();
        driver.findElement(By.xpath("//div[@class=\"ItemIndicator\"]//img[@style=\"display: inline;\"]")).click();

        driver.manage().timeouts().implicitlyWait(Duration.of(10, ChronoUnit.SECONDS));

        driver.findElement(By.xpath("//ul[@id=\"itemContextMenu\"]//a[@href=\"#delete\"]")).click();



    }


}
