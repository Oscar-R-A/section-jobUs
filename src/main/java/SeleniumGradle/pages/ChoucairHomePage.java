package SeleniumGradle.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("page:webdriver.base.url")
public class ChoucairHomePage extends PageObject {

    @FindBy(xpath = "//a[contains(text(), 'Empleos')]")
    WebElementFacade linkEmpleos;

    public void clickJobLink(){
        linkEmpleos.click();
    }
}
