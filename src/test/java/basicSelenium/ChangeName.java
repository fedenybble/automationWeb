package basicSelenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Date;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.javaScriptThrowsNoExceptions;

public class ChangeName {

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
    public void changeName() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Actions action = new Actions(driver);

        driver.manage().timeouts().implicitlyWait(Duration.of(10, ChronoUnit.SECONDS));

        String mailName = "ejemplo@ejemplo.com";
        String password = "ejemplo";
        String newName = "nombre "+ new Date().getTime();

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

        // -------------------- CHANGE NAME --------------------

        //Click [Settings] button
        driver.findElement(By.xpath("//a[@href=\"javascript:OpenSettingsDialog();\"]")).click();

        wait.until(elementToBeClickable(By.id("FullNameInput")));

        //Click [Full name] field and Edit Name
        driver.findElement(By.id("FullNameInput")).click();

        driver.findElement(By.id("FullNameInput")).clear();

        driver.findElement(By.id("FullNameInput")).sendKeys(newName);

        driver.findElement(By.xpath("//span[@class=\"ui-button-text\" and text()=\"Ok\"]")).click();

        // -------------------- VERIFICACION --------------------

        driver.manage().timeouts().implicitlyWait(Duration.of(10, ChronoUnit.SECONDS));

        driver.findElement(By.xpath("//a[@href=\"javascript:OpenSettingsDialog();\"]")).click();

        wait.until(elementToBeClickable(By.id("FullNameInput")));

        Assertions.assertEquals(newName, driver.findElement(By.id("FullNameInput")).getAttribute("value"), "ERROR: No se ha editado el nombre");

        driver.findElement(By.xpath("//span[@class=\"ui-button-text\" and text()=\"Ok\"]")).click();

    }


}
