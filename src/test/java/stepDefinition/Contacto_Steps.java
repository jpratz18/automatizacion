package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class Contacto_Steps {

    private WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/java/drivers/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        //driver.quit();
    }

    @Given("Ingresamos a la pagina de contacto")
    public void ingresamos_a_la_pagina_de_contacto() {
        driver.get("https://www.webdriveruniversity.com/Contact-Us/contactus.html");
    }

    @When("Ingreso el nombre")
    public void ingreso_el_nombre() {
        driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Juan");
    }

    @When("Ingreso el apellido")
    public void ingreso_el_apellido() {
        driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Pratz");
    }

    @When("Ingreso el email")
    public void ingreso_el_email() {
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("juan.pratz@qacg.com");
    }

    @When("Ingreso el comentario")
    public void ingreso_el_comentario() {
        driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("comentario");
    }

    @When("Hago click en el button submit")
    public void hago_click_en_el_button_submit() {
        driver.findElement(By.xpath("//input[@value='SUBMIT']")).click();
    }

    @Then("Se muestra la pagina del correcto ingreso de los datos")
    public void se_muestra_la_pagina_del_correcto_ingreso_de_los_datos() {
        WebElement webElement = driver.findElement(By.xpath("//div[@id='contact_reply']/h1"));
        Assert.assertEquals(webElement.getText(), "Thank You for your Message!");
    }

}
