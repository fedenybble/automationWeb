package basicSelenium;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Account {

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
    public void todoLySettings() throws InterruptedException{

        Thread.sleep(2000);

        String mailName="mail"+new Date().getTime()+"@mail.com";

        // -------------------- SIGN UP --------------------

        //Click [Sign Up Free] button
        driver.findElement(By.xpath("//img[@src=\"/Images/design/pagesignup.png\"]")).click();

        //Set [Full Name] field
        driver.findElement(By.id("ctl00_MainContent_SignupControl1_TextBoxFullName")).sendKeys(mailName);

        //Set [Email] field
        driver.findElement(By.id("ctl00_MainContent_SignupControl1_TextBoxEmail")).sendKeys(mailName);

        //Set [Password] field
        driver.findElement(By.id("ctl00_MainContent_SignupControl1_TextBoxPassword")).sendKeys("12345");

        //Click checkbox terms
        driver.findElement(By.id("ctl00_MainContent_SignupControl1_CheckBoxTerms")).click();

        //Click [Signup] button
        driver.findElement(By.id("ctl00_MainContent_SignupControl1_ButtonSignup")).click();

        Thread.sleep(2000);

        //Click [Logout] button
        driver.findElement(By.id("ctl00_HeaderTopControl1_LinkButtonLogout")).click();

        Thread.sleep(2000);

        // -------------------- LOGIN WITH NEW ACCOUNT --------------------

        //Click [Login] button
        driver.findElement(By.xpath("//img[@src=\"/Images/design/pagelogin.png\"]")).click();

        //Set [Email] field
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail")).sendKeys(mailName);

        //Set [Password] field
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword")).sendKeys("12345");

        //Click [Login] button
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_ButtonLogin")).click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // -------------------- CHANGE PASSWORD --------------------

        //Click [Settings] button
        driver.findElement(By.xpath("//a[@href=\"javascript:OpenSettingsDialog();\"]")).click();

        //Set [Old Password] field
        driver.findElement(By.id("TextPwOld")).sendKeys("12345");

        //Set [New Password] field
        driver.findElement(By.id("TextPwNew")).sendKeys("123");

        //Click [Ok] button
        driver.findElement(By.xpath("//span[@class=\"ui-button-text\" and text()=\"Ok\"]")).click();

        Thread.sleep(2000);

        //Click [Logout] button
        driver.findElement(By.id("ctl00_HeaderTopControl1_LinkButtonLogout")).click();

        Thread.sleep(2000);

        // -------------------- LOGIN WITH NEW PASSWORD --------------------

        //Click [Login] button
        driver.findElement(By.xpath("//img[@src=\"/Images/design/pagelogin.png\"]")).click();

        //Set [Email] field
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail")).sendKeys(mailName);

        //Set [Password] field
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword")).sendKeys("1234");

        //Click [Login] button
        driver.findElement(By.id("ctl00_MainContent_LoginControl1_ButtonLogin")).click();

        Thread.sleep(2000);

        // -------------------- VERIFICATION --------------------
        Assertions.assertTrue(! driver.findElements(By.xpath("//a[text()='Logout']")).isEmpty(),"ERROR: NO SE PUEDE INICIAR SESION");

    }

}
