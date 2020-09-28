package qa.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import qa.util.SelectDropdownList;

import java.util.List;

@Component
public class CrearAtributoServices {

    @Autowired
    private WebDriver driver;

    @Autowired
    private WebDriverWait wait;

    @Autowired
    private CrearAtributoPage crearAtributoPage;

    @Autowired
    private SelectDropdownList selectDropdownList;

    public void writeInputCrearCodigo(String codigo){
        this.wait.until(ExpectedConditions.visibilityOf(this.crearAtributoPage.getInputCrearCodigo()));
        this.crearAtributoPage.getInputCrearCodigo().sendKeys(codigo);
    }

    public void writeInputCrearDescripcion(String descripcion){
        this.crearAtributoPage.getInputCrearDescripcion().sendKeys(descripcion);
    }

    public void selectCrearAtributo(String atributo){
        this.wait.until(ExpectedConditions.visibilityOf(this.crearAtributoPage.getSelectCrearAtributo()));
        this.crearAtributoPage.getSelectCrearAtributo().click();
        WebElement select = this.crearAtributoPage.getDropdownCrearAtributo();
        List<WebElement> atributos = select.findElements(By.className("options"));
        selectDropdownList.selectDropdown(atributos, atributo);

    }

    public void selectCrearRamo(String ramo){
        this.wait.until(ExpectedConditions.visibilityOf(this.crearAtributoPage.getSelectCrearRamo()));
        this.crearAtributoPage.getSelectCrearRamo().click();
        WebElement select = this.crearAtributoPage.getDropdownCrearRamo();
        List<WebElement> ramos = select.findElements(By.className("options"));
        selectDropdownList.selectDropdown(ramos, ramo);
    }

    public void selectCrearEstado(String estado){
        this.wait.until(ExpectedConditions.visibilityOf(this.crearAtributoPage.getSelectCrearEstado()));
        this.crearAtributoPage.getSelectCrearEstado().click();
        WebElement select = this.crearAtributoPage.getDropdownCrearEstado();
        List<WebElement> estados = select.findElements(By.className("options"));
        selectDropdownList.selectDropdown(estados, estado);
    }

    public void selectCrearEscala(String escala){
        this.wait.until(ExpectedConditions.visibilityOf(this.crearAtributoPage.getSelectCrearEscala()));
        this.crearAtributoPage.getSelectCrearEscala().click();
        WebElement select = this.crearAtributoPage.getDropdownCrearEscala();
        List<WebElement> escalas = select.findElements(By.className("options"));
        selectDropdownList.selectDropdown(escalas, escala);

    }


    public void clickOnButtonCancelar() {
        this.crearAtributoPage.getButtonCancelar().click();
    }

    public void clickOnButtonConfirmar() {
        this.crearAtributoPage.getButtonConfirmar().click();
    }

    public String getMensajeCrear(){
        this.wait.until(ExpectedConditions.visibilityOf(this.crearAtributoPage.getMensajeCrear()));
        return this.crearAtributoPage.getMensajeCrear().getText();
    }

    public void clickOnCerrarMensaje() {
        this.crearAtributoPage.getMensajeCerrar().click();
    }


}
