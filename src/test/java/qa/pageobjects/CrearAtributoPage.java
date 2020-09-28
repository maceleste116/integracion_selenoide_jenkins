package qa.pageobjects;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class CrearAtributoPage extends PageBase {

    @Autowired
    public CrearAtributoPage(WebDriver driver){
        super(driver);
    }

    @FindBy(id="crear-atributo-input-codigo")
    private WebElement inputCrearCodigo;

    @FindBy(id="crear-atributo-input-descripcion")
    private WebElement inputCrearDescripcion;

    @FindBy(id="crear-atributo-select-idTipoAtributo")
    private WebElement selectCrearAtributo;

    @FindBy(id="crear-atributo-select-idTipoAtributo-panel")
    private WebElement dropdownCrearAtributo;

    @FindBy(id="crear-atributo-select-idRamo")
    private WebElement selectCrearRamo;

    @FindBy(id="crear-atributo-select-idRamo-panel")
    private WebElement dropdownCrearRamo;

    @FindBy(id="crear-atributo-select-estado")
    private WebElement selectCrearEstado;

    @FindBy(id="crear-atributo-select-estado-panel")
    private WebElement dropdownCrearEstado;

    @FindBy(id="crear-atributo-select-idEscala")
    private WebElement selectCrearEscala;

    @FindBy(id="crear-atributo-select-idEscala-panel")
    private WebElement dropdownCrearEscala;

    @FindBy(id="crear-atributo-boton-Cancelar")
    private WebElement buttonCancelar;

    @FindBy(id="crear-atributo-boton-Confirmar")
    private WebElement buttonConfirmar;

    @FindBy(id="crear-atributo-modal-mensaje")
    private WebElement mensajeCrear;

    @FindBy(id="crear-atributo-modal-modal-button-close")
    private WebElement mensajeCerrar;



}
