package qa.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import qa.pageobjects.CrearAtributoServices;
import qa.pageobjects.HomeAtributoServices;

@Component
public class CrearAtributo {

    @Autowired
    private HomeAtributoServices homeAtributoServices;

    @Autowired
    private CrearAtributoServices crearAtributoServices;

    public void withInfoRequired(){
        homeAtributoServices.clickOnButtonCrear();
        crearAtributoServices.writeInputCrearCodigo("AAAAAT01");
        crearAtributoServices.writeInputCrearDescripcion("AAAAAT01");
        crearAtributoServices.selectCrearAtributo("Porcentaje");
        crearAtributoServices.selectCrearRamo("Automotores");
        crearAtributoServices.selectCrearEstado("Activo");
        crearAtributoServices.selectCrearEscala("Valor");
        crearAtributoServices.clickOnButtonConfirmar();
    }

    public void withOutInfoRequired(){
        homeAtributoServices.clickOnButtonCrear();
        crearAtributoServices.writeInputCrearCodigo("");
        crearAtributoServices.writeInputCrearDescripcion("");
        crearAtributoServices.selectCrearAtributo("Porcentaje");
        crearAtributoServices.selectCrearRamo("Automotores");
        crearAtributoServices.selectCrearEstado("Activo");
        crearAtributoServices.selectCrearEscala("Valor");
        crearAtributoServices.clickOnButtonConfirmar();
    }

    public void withCodigoExistente(){
        homeAtributoServices.clickOnButtonCrear();
        crearAtributoServices.writeInputCrearCodigo("AAAAAT01");
        crearAtributoServices.writeInputCrearDescripcion("AAAAAT01");
        crearAtributoServices.selectCrearAtributo("Porcentaje");
        crearAtributoServices.selectCrearRamo("Automotores");
        crearAtributoServices.selectCrearEstado("Activo");
        crearAtributoServices.selectCrearEscala("Valor");
        crearAtributoServices.clickOnButtonConfirmar();
    }

}
