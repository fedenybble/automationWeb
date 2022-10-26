package pages.todoist;

import controlSelenium.Button;
import org.openqa.selenium.By;

public class EditModal {

    public Button editExpirationDateButton = new Button(By.xpath("//button[@class=\"PkhZiTa _9KUWmzz a8af2163 _98cd5c3f _45ffe137 f9408a0e _8c75067a\"]"));

    public Button selectExpirationDateButton = new Button(By.xpath("//button[@data-track=\"scheduler|date_shortcut_nextweek\"]"));

    public Button editPriorityButton = new Button(By.xpath("//span[@class=\"bbdb467b f9408a0e d745aa1e _473810b4 _8c75067a\" and text()=\"P2\"]"));

    public Button setNewPriorityButton = new Button(By.xpath("//span[@class=\"priority_picker_item_name\" and text()=\"Prioridad 3\"]"));

    public Button closeModal = new Button(By.xpath("//button[@aria-label=\"Cerrar ventana\"]"));

    public Button threeDotsOption = new Button(By.xpath("//button[@aria-label=\"Más acciones\"]"));

    public Button deleteTaskOption = new Button(By.xpath("//button[@aria-label=\"Eliminar tarea…\"]"));

}
