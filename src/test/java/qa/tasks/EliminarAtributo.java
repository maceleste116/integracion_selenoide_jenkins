package qa.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import qa.pageobjects.EliminarAtributoServices;
import qa.pageobjects.HomeAtributoServices;

@Component
public class EliminarAtributo {

    @Autowired
    private HomeAtributoServices homeAtributoServices;

    @Autowired
    private EliminarAtributoServices eliminarAtributoServices;

     public void eliminarAceptarAtributoAsociada() {
        homeAtributoServices.clickOnTablaMostrarAccion();
        homeAtributoServices.clickOnTablaButtonEliminar();
         eliminarAtributoServices.clickOnTablaButtonBorrar();

        }

    public void eliminarAceptarAtributo() {
        homeAtributoServices.clickOnTablaMostrarAccion();
        homeAtributoServices.clickOnTablaButtonEliminar();
        eliminarAtributoServices.clickOnTablaButtonBorrar();

    }

}
