package qa.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import qa.pageobjects.EliminarAtributoServices;

@Component
public class ValidarEliminarAtributo {

    @Autowired
    private EliminarAtributoServices eliminarAtributoServices;

    public boolean validarAtributoEliminarAceptar(){
        String mensaje = eliminarAtributoServices.getMensajeBorrar();
        System.out.println("El mensaje obtenido es:" + mensaje);
        boolean contieneMensaje = mensaje.contains("Se eliminó");
        System.out.println("Contiene el mensaje?" + contieneMensaje);
        eliminarAtributoServices.clickOnCerrarMensaje();
        return contieneMensaje;
    }

    public boolean validarAtributoEliminarAceptarAsociada(){
        String mensaje = eliminarAtributoServices.getMensajeBorrar();
        System.out.println("El mensaje obtenido es:" + mensaje);
        boolean contieneMensaje = mensaje.contains("Falló al eliminar atributo");
        System.out.println("Contiene el mensaje?" + contieneMensaje);
        eliminarAtributoServices.clickOnCerrarMensaje();
        return contieneMensaje;
    }



}
