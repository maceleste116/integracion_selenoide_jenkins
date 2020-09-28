package qa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EliminarAtributoServices {

    @Autowired
    private WebDriver driver;

    @Autowired
    private WebDriverWait wait;

    @Autowired
    private EliminarAtributoPage eliminarAtributoPage;

    @Autowired
    private HomeAtributoPage homeAtributoPage;

    public void clickOnTablaButtonBorrar() {
        this.wait.until(ExpectedConditions.visibilityOf(eliminarAtributoPage.getButtonBorrar()));
        this.eliminarAtributoPage.getButtonBorrar().click();
    }

    public void clickOnTablaButtonCancelar() {
        this.wait.until(ExpectedConditions.visibilityOf(eliminarAtributoPage.getButtonBorrar()));
        this.eliminarAtributoPage.getButtonBorrar().click();
    }

    public String getMensajeBorrar(){
        this.wait.until(ExpectedConditions.visibilityOf(this.eliminarAtributoPage.getMensajeBorrar()));
        return this.eliminarAtributoPage.getMensajeBorrar().getText();
    }

    public void clickOnCerrarMensaje() {
        this.eliminarAtributoPage.getMensajeCerrar().click();
    }


}
