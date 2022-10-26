package pages.todoist;

import controlSelenium.Button;
import controlSelenium.Label;
import org.openqa.selenium.By;

public class EditModal {

    public Button editExpirationDateButton = new Button(By.xpath("//button[@class=\"PkhZiTa _9KUWmzz a8af2163 _98cd5c3f _45ffe137 f9408a0e _8c75067a\"]"));

    public Button selectExpirationDateButton = new Button(By.xpath("//button[@data-track=\"scheduler|date_shortcut_nextweek\"]"));

    public Button editPriorityButton = new Button(By.xpath("//span[@class=\"bbdb467b f9408a0e d745aa1e _473810b4 _8c75067a\" and text()=\"P2\"]"));

    public Button setNewPriorityButton = new Button(By.xpath("//span[@class=\"priority_picker_item_name\" and text()=\"Prioridad 3\"]"));

    public Label expirationDateLabel = new Label(By.xpath("//div[@class=\"oHQRp5h a83bd4e0 _6a3e5ade f9408a0e\" and text() = \"Fecha de vencimiento\""));

    public Button closeModal = new Button(By.xpath("//button[@aria-label=\"Cerrar ventana\"]"));

    public Button threeDotsOption = new Button(By.xpath("//button[@aria-label=\"Más acciones\"]"));

    public Button deleteTaskOption = new Button(By.xpath("//button[@aria-label=\"Eliminar tarea…\"]"));

}
