package qa.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import qa.util.SelectDropdownList;

import java.util.List;

@Component
public class EditarAtributoServices {

    @Autowired
    private WebDriver driver;

    @Autowired
    private WebDriverWait wait;

    @Autowired
    private EditarAtributoPage editarAtributoPage;

    @Autowired
    private SelectDropdownList selectDropdownList;

    public void writeInputEditarCodigo(String codigo){
        this.wait.until(ExpectedConditions.visibilityOf(this.editarAtributoPage.getInputEditarCodigo()));
        this.editarAtributoPage.getInputEditarCodigo().sendKeys(codigo);
    }

    public void writeInputEditarDescripcion(String descripcion){
        this.wait.until(ExpectedConditions.visibilityOf(this.editarAtributoPage.getInputEditarDescripcion()));
        this.editarAtributoPage.getInputEditarDescripcion().clear();
        this.editarAtributoPage.getInputEditarDescripcion().sendKeys(descripcion);
    }

    public void selectEditarAtributo(String atributo){
        this.wait.until(ExpectedConditions.visibilityOf(this.editarAtributoPage.getSelectEditarAtributo()));
        this.editarAtributoPage.getSelectEditarAtributo().click();
        WebElement select = this.editarAtributoPage.getDropownEditarAtributo();
        List<WebElement> atributos = select.findElements(By.className("options"));
        selectDropdownList.selectDropdown(atributos, atributo);
    }

    //public void selectEditarRamo(String ramo){ No se puede editar ramo
   //}

    public void selectEditarEstado(String estado){
        this.wait.until(ExpectedConditions.visibilityOf(this.editarAtributoPage.getSelectEditarEstado()));
        this.editarAtributoPage.getSelectEditarEstado().click();
        WebElement select = this.editarAtributoPage.getDropdownEditarEstado();
        List<WebElement> estados = select.findElements(By.className("options"));
        selectDropdownList.selectDropdown(estados, estado);
    }

    public void selectEditarEscala(String escala){
        this.wait.until(ExpectedConditions.visibilityOf(this.editarAtributoPage.getSelectEditarEscala()));
        this.editarAtributoPage.getSelectEditarEscala().click();
        WebElement select = this.editarAtributoPage.getDropdownEditarEscala();
        List<WebElement> escalas = select.findElements(By.className("options"));
        selectDropdownList.selectDropdown(escalas, escala);

    }

    public void clickOnButtonCancelar() {
        this.editarAtributoPage.getButtonCancelar().click();
    }

    public void clickOnButtonConfirmar() {
        this.editarAtributoPage.getButtonConfirmar().click();
    }

    public String getMensajeEditar(){
        this.wait.until(ExpectedConditions.visibilityOf(this.editarAtributoPage.getMensajeEditar()));
        return this.editarAtributoPage.getMensajeEditar().getText();
    }

    public void clickOnCerrarMensaje() {
        this.editarAtributoPage.getMensajeCerrar().click();
    }



}
