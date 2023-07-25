package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.chrome.ChromeDriver;
import questions.ElementText;
import tasks.Login;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class AutenticateSteps {
    private Actor actor;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        actor = OnStage.theActorCalled("Miguel");
        actor.can(BrowseTheWeb.with(new ChromeDriver()));
    }

    @Given("El usuario se encuentra en la pantalla de login")
    public void elUsuarioSeEncuentraEnLaPantallaDeLogin() {
        actor.attemptsTo(Login.with("standard_user", "secret_sauce"));

    }

    @When("El usuario ingresa su username {string} y su password {string}")
    public void elUsuarioIngresaSuUsernameYSuPassword(String username, String password) {
        actor.attemptsTo(Login.with(username, password));
    }

    @Then("El usuario se autentica exitosamente presentando la pantalla de inventario")
    public void elUsuarioSeAutenticaExitosamentePresentandoLaPantallaDeInventario() {
        actor.should(
                seeThat("Text of the element", ElementText.of("//*[@id='header_container']/div[1]/div[2]/div"), equalTo("Swag Labs"))
        );
    }
}
