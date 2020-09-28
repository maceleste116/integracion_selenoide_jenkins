package qa.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import qa.pageobjects.EditarAtributoServices;

@Component
public class ValidarEditarAtributo {

    @Autowired
    private EditarAtributoServices editarAtributoServices;

    public boolean validarAtributoEditarWithInfoRequired(){
        String mensaje = editarAtributoServices.getMensajeEditar();
        System.out.println("El mensaje obtenido es:" + mensaje);
        boolean contieneMensaje = mensaje.contains("Se actualizó atributo");
        System.out.println("Contiene el mensaje?" + contieneMensaje);
        editarAtributoServices.clickOnCerrarMensaje();
        return contieneMensaje;
    }

    public boolean validarAtributoEditarWithOutInfoRequired(){
        String mensaje = editarAtributoServices.getMensajeEditar();
        System.out.println("El mensaje obtenido es:" + mensaje);
        boolean contieneMensaje = mensaje.contains("Faltan campos");
        System.out.println("Contiene el mensaje?" + contieneMensaje);
        editarAtributoServices.clickOnCerrarMensaje();
        return contieneMensaje;
    }




}
