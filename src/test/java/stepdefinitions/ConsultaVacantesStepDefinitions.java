package stepdefinitions;

import SeleniumGradle.steps.ConsultarVacantesStep;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


public class ConsultaVacantesStepDefinitions {

    @Steps
    ConsultarVacantesStep consultarVacantesStep;

    @Given("^que estoy en la pagina de choucair$")
    public void queEstoyEnLaPaginaDeChoucair() {
        consultarVacantesStep.abrirPaginaChoucair();
    }

    @When("^ingreso a la seccion de empleo$")
    public void ingresoALaSeccionDeEmpleo() {
        consultarVacantesStep.irPaginaDeEmpleo();
    }

    @Then("^puedo consultar las vacantes disponibles$")
    public void puedoConsultarLasVacantesDisponibles() {
        consultarVacantesStep.queEsChoucair();
        consultarVacantesStep.convocatorias();
        consultarVacantesStep.prepareseParaAplicar();
        consultarVacantesStep.filtroVacantes("Prueba","Bogotá");
        consultarVacantesStep.seleccionarVacante();
    }


}
