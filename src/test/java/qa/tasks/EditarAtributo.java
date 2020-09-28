package qa.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import qa.pageobjects.EditarAtributoServices;
import qa.pageobjects.HomeAtributoServices;

@Component
public class EditarAtributo {

    @Autowired
    private HomeAtributoServices homeAtributoServices;

    @Autowired
    private EditarAtributoServices editarAtributoServices;

    public void editarWithInfoRequired() throws InterruptedException {
        homeAtributoServices.clickOnTablaMostrarAccion();
        homeAtributoServices.clickOnTablaButtonEditar();
        //editarAtributoServices.writeEditarInputCrearCodigo("AAAAAT01");
        editarAtributoServices.writeInputEditarDescripcion("AAAAAT01");
        Thread.sleep(2000);
        editarAtributoServices.selectEditarAtributo("Monto");
        //editarAtributoServices.selectEditarRamo("Automotores");
        editarAtributoServices.selectEditarEstado("Inactivo");
        editarAtributoServices.selectEditarEscala("Provincia");
        editarAtributoServices.clickOnButtonConfirmar();
    }

    public void editarWithOutInfoRequired() throws InterruptedException {
        homeAtributoServices.clickOnTablaMostrarAccion();
        homeAtributoServices.clickOnTablaButtonEditar();
        //editarAtributoServices.writeEditarInputCrearCodigo("AAAAAT01");
        editarAtributoServices.writeInputEditarDescripcion(" \b");
        editarAtributoServices.selectEditarAtributo("Monto");
        //editarAtributoServices.selectEditarRamo("Automotores");
        editarAtributoServices.selectEditarEstado("Inactivo");
        editarAtributoServices.selectEditarEscala("Provincia");
        editarAtributoServices.clickOnButtonConfirmar();
    }

}
