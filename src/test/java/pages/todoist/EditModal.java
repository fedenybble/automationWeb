package pages.todoist;

import controlSelenium.Button;
import controlSelenium.Label;
import org.openqa.selenium.By;

public class EditModal {

    public Button editExpirationDateButton = new Button(By.xpath("//button[@class=\"PkhZiTa _9KUWmzz a8af2163 _98cd5c3f _45ffe137 f9408a0e _8c75067a\"]"));
    public Button newExpirationDateButton = new Button(By.xpath("//button[@data-track=\"scheduler|date_shortcut_nextweek\"]"));
    public Button editPriorityButton = new Button(By.xpath("//span[text()=\"P1\"]"));
    public Button scndPriorityOptionButton = new Button(By.xpath("//span[@class=\"priority_picker_item_name\" and text()=\"Prioridad 2\"]"));
    public Button closeWindowButton = new Button(By.xpath("//button[@aria-label=\"Cerrar ventana\"]"));
    public Button moreOptionsButton = new Button(By.xpath("//button[@aria-label=\"Más acciones\"]"));
    public Button deleteOptionButton = new Button(By.xpath("//button[@aria-label=\"Eliminar tarea…\"]"));
    public Button confirmDeleteButton = new Button(By.xpath("//button[@class=\"a8af2163 _3d1243b2 _352995bd f9408a0e _56a651f6\"]"));








}
