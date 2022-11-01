package pages.todoLy;

import controlSelenium.Button;
import controlSelenium.TextBox;
import org.openqa.selenium.By;

public class LoginModal {

    public TextBox emailTextBox = new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail"),"[email] textbox in login modal");
    public TextBox passwordTextBox = new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword"),"[password] textbox in login modal");
    public Button loginButton = new Button(By.id("ctl00_MainContent_LoginControl1_ButtonLogin"),"[login] button in login modal");

    // Metodo para hacer login
//    public void login(String user,String pwd){
//        emailTextBox.setText(user);
//        passwordTextBox.setText(pwd);
//        loginButton.click();
//    }
}
