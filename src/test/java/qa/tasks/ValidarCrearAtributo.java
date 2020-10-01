package qa.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import qa.pageobjects.CrearAtributoServices;

@Component
public class ValidarCrearAtributo {

    @Autowired
    private CrearAtributoServices crearAtributoServices;

    public boolean validarAtributoWithInfoDefault(){
        String mensaje = crearAtributoServices.getMensajeCrear();
        System.out.println("El mensaje obtenido es:" + mensaje);
        System.out.println("El mensaje que debe contener es: Se creó atributo con éxito");
        boolean contieneMensaje = mensaje.contains("Se creó atributo con éxito");
        System.out.println("Contiene el mensaje?" + contieneMensaje);
        crearAtributoServices.clickOnCerrarMensaje();
        return contieneMensaje;

    }

    public boolean validarAtributoWithOutInfoDefault(){
        String mensaje = crearAtributoServices.getMensajeCrear();
        System.out.println("El mensaje obtenido es:" + mensaje);
        boolean contieneMensaje = mensaje.contains("Faltan campos");
        System.out.println("Contiene el mensaje?" + contieneMensaje);
        crearAtributoServices.clickOnCerrarMensaje();
        return contieneMensaje;
    }

    public boolean validarAtributoWithCodigoExistente(){
        String mensaje = crearAtributoServices.getMensajeCrear();
        System.out.println("El mensaje obtenido es:" + mensaje);
        boolean contieneMensaje = mensaje.contains("Ya se encuentra un atributo creado con el codigo");
        System.out.println("Contiene el mensaje?" + contieneMensaje);
        crearAtributoServices.clickOnCerrarMensaje();
        return contieneMensaje;

    }

}
