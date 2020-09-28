package qa.pageobjects;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class EliminarAtributoPage extends PageBase {

    @Autowired
    public EliminarAtributoPage(WebDriver driver){
        super(driver);
    }

    @FindBy(id="atributos-modal-button-confimar")
    private WebElement ButtonBorrar;

    @FindBy(id="atributo-modal-button-cancelar")
    private WebElement ButtonCancelar;

    @FindBy(id="atributos-mensaje")
    private WebElement mensajeBorrar;

    @FindBy(id="atributos-modal-button-close")
    private WebElement mensajeCerrar;



}
