package qa.pageobjects;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class EditarAtributoPage extends PageBase {

    @Autowired
    public EditarAtributoPage(WebDriver driver){
        super(driver);
    }

    @FindBy(id="editar-atributo-input-codigo")
    private WebElement inputEditarCodigo;

    @FindBy(id="editar-atributo-input-descripcion")
    private WebElement inputEditarDescripcion;

    @FindBy(id="editar-atributo-select-idTipoAtributo")
    private WebElement selectEditarAtributo;

    @FindBy(id="editar-atributo-select-idTipoAtributo-panel")
    private WebElement dropownEditarAtributo;

    //@FindBy(id="editar-atributo-select-idRamo") No puede editarse
    //private WebElement selectEditarRamo;

    @FindBy(id="editar-atributo-select-estado")
    private WebElement selectEditarEstado;

    @FindBy(id="editar-atributo-select-estado-panel")
    private WebElement dropdownEditarEstado;

    @FindBy(id="editar-atributo-select-idEscala")
    private WebElement selectEditarEscala;

    @FindBy(id="editar-atributo-select-idEscala-panel")
    private WebElement dropdownEditarEscala;

    @FindBy(id="editar-atributo-boton-Cancelar")
    private WebElement buttonCancelar;

    @FindBy(id="editar-atributo-boton-Confirmar")
    private WebElement buttonConfirmar;

    @FindBy(id="editar-atributo-modal-mensaje")
    private WebElement mensajeEditar;

    @FindBy(id="editar-atributo-modal-modal-button-close")
    private WebElement mensajeCerrar;



}
