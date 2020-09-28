package qa.pageobjects;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class HomeAtributoPage extends PageBase {

    @Autowired
    public HomeAtributoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="nabvar-burguer-menu-boton-desplegar")
    private WebElement menuPrincipal;

    @FindBy(id="nabvar-burguer-menu-boton-atributos")
    private WebElement menuAtributo;

    @FindBy(id="atributos-tabla-boton-mostrar-acciones-0")
    private WebElement tablaMostrarAccion;

    @FindBy(id="atributos-boton-crear")
    private WebElement buttonCrear;

    @FindBy(id="atributos-boton-volver")
    private WebElement buttonVolver;

    @FindBy(id="atributos-tabla-boton-editar-0")
    private WebElement tablaButtonEditar;

    @FindBy(id="atributos-tabla-boton-eliminar-0")
    private WebElement tablaButtonEliminar;

    //TABLA

    @FindBy(id="atributos-tabla")
    private WebElement mostrarTableHome;

    @FindBy(id="atributos-tabla-icono-orden-codigo")
    private WebElement iconSortAsc;

    @FindBy(id="atributos-tabla-icono-orden-codigo")
    private WebElement iconSortDesc;


}
