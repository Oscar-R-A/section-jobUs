package SeleniumGradle.tests;

import SeleniumGradle.pages.ChoucairHomePage;
import SeleniumGradle.pages.ChoucairJobPage;
import javafx.scene.layout.Priority;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ConsultaVacanteTest {
    WebDriver driver;
    String expectedResult = null;
    String actualResult = null;
    ChoucairHomePage objHome;
    ChoucairJobPage objJob;

    @Before
    public void setUp (){
        System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.choucairtesting.com/");
    }

    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void goToChoucairHomePage (){
        objHome = new ChoucairHomePage(driver);
        objHome.clickJobLink();
    }

    @Test
    public void goToChoucairJobPage (){
        objJob = new ChoucairJobPage(driver);
        objJob.clickQueEsSerChoucair();
        objJob.clickConvocatorias();
        objJob.clickPreparese();
        objJob.setKeyWords("Pruebas");
        objJob.setCiudad("Bogotá");
        objJob.clickOnSubmitButton();
    }
}
