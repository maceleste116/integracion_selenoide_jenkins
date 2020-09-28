package qa.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.testng.Assert;
import qa.conf.DriverConfig;
import qa.tasks.*;

@CucumberContextConfiguration
@ContextConfiguration(classes = {DriverConfig.class})
public class DimensionStepDefs{

    @Autowired
    private NavigateTo navigateTo;

    @Autowired
    private MenuAtributo menuAtributo;

    @Autowired
    private CrearAtributo crearAtributo;

    @Autowired
    private ValidarCrearAtributo validarCrearAtributo;

    @Autowired
    private EditarAtributo editarAtributo;

    @Autowired
    private ValidarEditarAtributo validarEditarAtributo;

    @Autowired
    private EliminarAtributo eliminarAtributo;

    @Autowired
    private ValidarEliminarAtributo validarEliminarAtributo;

    @Before
    public void goHomePage() throws InterruptedException {
        navigateTo.homePage();
        Thread.sleep(1000);
    }

    @Given("^actuario quiere ir a Atributo$")
    public void actuario_quiere_ir_a_atributo() throws Throwable {
        menuAtributo.irMenuAtributo();
        Thread.sleep(1000);
    }

    //CREAR ATRIBUTO CON DATOS REQUERIDOS
    @When("^actuario quiere crear atributo con datos requeridos$")
    public void actuario_quiere_crear_atributo_con_datos_requeridos() throws Throwable {
        crearAtributo.withInfoRequired();
        Thread.sleep(1000);
    }

    @Then("^actuario tiene atributo creado con datos requeridos$")
    public void actuario_tiene_atributo_creado_con_datos_requeridos() throws Throwable {
        Assert.assertTrue(validarCrearAtributo.validarAtributoWithInfoDefault());
    }

    //CREAR ATRIBUTO SIN DATOS REQUERIDOS
    @When("^actuario quiere crear atributo sin datos requeridos$")
    public void actuario_quiere_crear_atributo_sin_datos_requeridos() throws Throwable {
        crearAtributo.withOutInfoRequired();
        Thread.sleep(1000);
    }

    @Then("^actuario no tiene atributo creado sin datos requeridos$")
    public void actuario_no_tiene_atributo_creado_sin_datos_requeridos() throws Throwable {
        Assert.assertTrue(validarCrearAtributo.validarAtributoWithOutInfoDefault());
    }

    //CREAR ATRIBUTO CON CÓDIGO EXISTENTE
    @When("^actuario quiere crear atributo con codigo existente$")
    public void actuario_quiere_crear_atributo_con_codigo_existente() throws Throwable {
        crearAtributo.withCodigoExistente();
        Thread.sleep(1000);
    }

    @Then("^actuario no tiene atributo creado con codigo existente$")
    public void actuario_no_tiene_atributo_creado_con_codigo_existente() throws Throwable {
        Assert.assertTrue(validarCrearAtributo.validarAtributoWithCodigoExistente());
    }

    //EDITAR ATRIBUTO CON DATOS REQUERIDOS
    @When("^actuario quiere editar atributo existente con datos requeridos$")
    public void actuario_quiere_editar_atributo_existente_con_datos_requeridos() throws Throwable {
        editarAtributo.editarWithInfoRequired();
        Thread.sleep(1000);
    }

    @Then("^actuario tiene atributo editado con datos requeridos$")
    public void actuario_tiene_atributo_editado_con_datos_requeridos() throws Throwable {
        Assert.assertTrue(validarEditarAtributo.validarAtributoEditarWithInfoRequired());
    }

    //EDITAR ATRIBUTO SIN DATOS REQUERIDOS
    @When("^actuario quiere editar atributo existente sin datos requeridos$")
    public void actuario_quiere_editar_atributo_existente_sin_datos_requeridos() throws Throwable {
        editarAtributo.editarWithOutInfoRequired();
        Thread.sleep(1000);
    }

    @Then("^actuario tiene atributo editado sin datos requeridos$")
    public void actuario_tiene_atributo_editado_sin_datos_requeridos() throws Throwable {
        Assert.assertTrue(validarEditarAtributo.validarAtributoEditarWithOutInfoRequired());
    }

    @When("^actuario quiere editar atributo existente$")
    public void actuario_quiere_editar_atributo_existente() throws Throwable {

    }

    @Then("^actuario tiene atributo editado$")
    public void actuario_tiene_atributo_editado() throws Throwable {

    }

    @When("^actuario quiere eliminar atributo aceptar$")
    public void actuario_quiere_eliminar_atributo_aceptar() throws Throwable {
        eliminarAtributo.eliminarAceptarAtributo();
        Thread.sleep(1000);
    }

    @Then("^actuario tiene atributo eliminado$")
    public void actuario_tiene_atributo_eliminado() throws Throwable {
        Assert.assertTrue(validarEliminarAtributo.validarAtributoEliminarAceptar());
    }

    @When("^actuario quiere eliminar atributo aceptar asociado$")
    public void actuario_quiere_eliminar_atributo_aceptar_asociado() throws Throwable {
        eliminarAtributo.eliminarAceptarAtributoAsociada();
        Thread.sleep(1000);
    }

    @Then("^actuario no tiene atributo eliminado asociado$")
    public void actuario_no_tiene_atributo_eliminado_asociado() throws Throwable {
        Assert.assertTrue(validarEliminarAtributo.validarAtributoEliminarAceptarAsociada());
    }

    @When("^actuario quiere ordenar ascendente atributo existente$")
    public void actuario_quiere_ordenar_ascendente_atributo_existente() throws Throwable {
        System.out.println("Desarrollar");
    }

    @Then("^actuario tiene ordenado ascendente atributo existente$")
    public void actuario_tiene_ordenado_ascendente_atributo_existente() throws Throwable {
        System.out.println("Desarrollar");
    }

    @When("^actuario quiere ordenar descendente atributo existente$")
    public void actuario_quiere_ordenar_descendente_atributo_existente() throws Throwable {
        System.out.println("Desarrollar");
    }

    @Then("^actuario tiene ordenado descendente atributo existente$")
    public void actuario_tiene_ordenado_descendente_atributo_existente() throws Throwable {
        System.out.println("Desarrollar");
    }


}




