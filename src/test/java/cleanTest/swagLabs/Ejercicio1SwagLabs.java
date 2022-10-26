package cleanTest.swagLabs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio1SwagLabs extends TestBaseSwagLabs {

    @BeforeEach
    public void login(){
        String username = "standard_user";
        String password = "secret_sauce";

        loginModal.usernameInput.setText(username);
        loginModal.passwordInput.setText(password);
        loginModal.loginButton.click();
        mainPage.productSort.waitIsVisible();
    }

    @Test
    public void AddToCart() throws InterruptedException {

        mainPage.productSort.click();
        mainPage.lowToHighOption.waitIsVisible();
        mainPage.lowToHighOption.click();

        productSection.productButton.waitIsVisible();
        productSection.productButton.click();
        String textContent = productSection.productName.getAttribute("textContent");
        //String textContent = productSection.productNameError.getAttribute("textContent");
        mainPage.cartIcon.click();

        Assertions.assertEquals(cartSection.cartProductName.getAttribute("textContent"), textContent, "ERROR");

        Thread.sleep(5000);
    }

}
