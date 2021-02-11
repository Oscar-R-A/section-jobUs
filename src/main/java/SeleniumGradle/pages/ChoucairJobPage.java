package SeleniumGradle.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChoucairJobPage {

    WebDriver driver;

    //Qué es ser choucair
    By linktextCho = By.xpath("//a[contains(text(), '¿Qué es ser Choucair?')]");

    //Convocatorias
    By linktextCon = By.xpath("//a[contains(text(), 'Convocatorias')]");

    //Preparese para aplicar
    By linktextPrep = By.xpath("//a[contains(text(), 'Prepararse para aplicar')]");

    // Filtro por palabra clave
    By txtKeyWords = By.id("search_keywords");

    // Filtro por ciudad
    By txtCiudad = By.id("search_location");

    // Filtro por ciudad
    By btnSubmit = By.xpath("//input[contains(@type, 'submit')]");

    //seleccionar una vacante
    By linktextVa = By.xpath("//*[contains(text(), 'Analista de Pruebas Medellín y Bogotá')]");

    public ChoucairJobPage (WebDriver driver){
        this.driver = driver;
    }

    public void clickQueEsSerChoucair (){
        driver.findElement(linktextCho).click();
    }

    public void clickConvocatorias (){
        driver.findElement(linktextCon).click();
    }

    public void clickPreparese (){
        driver.findElement(linktextPrep).click();
    }

    public void setKeyWords (String strKeyWords){
        driver.findElement(txtKeyWords).sendKeys(strKeyWords);
    }

    public void setCiudad (String strCiudad){
        driver.findElement(txtCiudad).sendKeys(strCiudad);
    }

    public void clickOnSubmitButton(){
        driver.findElement(btnSubmit).click();
    }
    public void selectVacante(){
        driver.findElement(linktextVa).click();
    }

}
