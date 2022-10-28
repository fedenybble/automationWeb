package cleanTest.demoga.selectable;

import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.demoga.MainPage;

public class SelectElement extends TestBaseSelectElement{

    @Test
    public void selectElement() throws InterruptedException {

        String expectedResult = "mt-2 list-group-item active list-group-item-action";

        mainPage.elementButton.click();
        String actualResult = mainPage.elementButton.getAttribute("class");
        Assertions.assertEquals(expectedResult, actualResult, "ERROR: No se ha seleccionado el boton deseado");

        Thread.sleep(3000);

    }

}
