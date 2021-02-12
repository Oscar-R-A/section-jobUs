package SeleniumGradle.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ChoucairJobPage extends PageObject {

    //@FindBy (xpath = "//a[contains(text(), 'Qué es ser Choucair')]")
    @FindBy (xpath = "//img[contains(@src, 'trabajo-1')]")
    WebElementFacade linkCho;

    @FindBy (xpath = "//a[contains(text(), 'Convocatorias')]")
    WebElementFacade linkTextCon;

    @FindBy (xpath = "//a[contains(text(), 'Prepararse para aplicar')]")
    WebElementFacade linkTextPrep;

    @FindBy (id = "search_keywords")
    WebElementFacade txtKeyWords;

    @FindBy (id = "search_location")
    WebElementFacade txtCiudad;

    @FindBy (xpath = "//input[contains(@type, 'submit')]")
    WebElementFacade btnSubmit;

    @FindBy (xpath = "//*[contains(text(), 'Analista de Pruebas Medellín y Bogotá')]")
    WebElementFacade linkTextVa;



    public void queEsSerChoucair (){
        waitFor(ExpectedConditions.visibilityOf(linkCho));
        linkCho.click();
    }

    public void convocatorias (){
       linkTextCon.click();
    }

    public void prepareseParaAplicar (){
        linkTextPrep.click();
    }

    public void filtarEmpleoYCiudad (String keyWords, String ciudad){
        txtKeyWords.sendKeys(keyWords);
        txtCiudad.sendKeys(ciudad);
        btnSubmit.click();
    }

    public void selectVacante(){
        linkTextVa.click();
    }

}
