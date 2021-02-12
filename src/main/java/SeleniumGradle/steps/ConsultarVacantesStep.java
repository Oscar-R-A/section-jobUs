package SeleniumGradle.steps;

import SeleniumGradle.pages.ChoucairHomePage;
import SeleniumGradle.pages.ChoucairJobPage;
import net.thucydides.core.annotations.Step;

public class ConsultarVacantesStep {
    ChoucairHomePage choucairHomePage;
    ChoucairJobPage choucairJobPage;

    @Step
    public void abrirPaginaChoucair(){
        choucairHomePage.open();
    }

    @Step
    public void irPaginaDeEmpleo(){
        choucairHomePage.clickJobLink();
    }
    @Step
    public void queEsChoucair(){
        choucairJobPage.queEsSerChoucair();
    }
    @Step
    public void convocatorias(){
        choucairJobPage.convocatorias();
    }
    @Step
    public void prepareseParaAplicar(){
        choucairJobPage.prepareseParaAplicar();
    }
    @Step
    public void filtroVacantes(String keyWord, String ciudad){
        choucairJobPage.filtarEmpleoYCiudad(keyWord, ciudad);
    }
    @Step
    public void seleccionarVacante(){
        choucairJobPage.selectVacante();
    }
}
