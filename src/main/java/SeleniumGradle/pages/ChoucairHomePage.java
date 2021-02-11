package SeleniumGradle.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ChoucairHomePage {

   WebDriver driver;

    By linkJob = By.xpath("//a[contains(text(), 'Empleos')]");

    public ChoucairHomePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickJobLink(){
        driver.findElement(linkJob).click();
    }
}
