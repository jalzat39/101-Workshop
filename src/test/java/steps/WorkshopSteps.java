package steps;

import elements.ColombiaPage;
import elements.HomePage;
import io.cucumber.java.en.*;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.Driver;

public class WorkshopSteps {

    protected WebDriver driver = Driver.getDriver();

    @Given("the user visits the El Tiempo website")
    public void the_user_visits_the_El_Tiempo_website() {
        driver.get("https://www.eltiempo.com/");
    }

    @When("the user clicks on the Colombia option")
    public void the_user_clicks_on_the_Colombia_option() {
        HomePage homePage = new HomePage(driver);
        homePage.clickColombia();
    }

    @Then("the Colombia page should load")
    public void the_Colombia_page_should_load() {
        ColombiaPage colombiaPage = new ColombiaPage(driver);
        Assert.assertEquals("COLOMBIA", colombiaPage.getColombiaMenu().getText());
    }

    @After
    public void afterScenario() {
        driver.quit();
    }
}
