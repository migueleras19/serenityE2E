package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.chrome.ChromeDriver;
import questions.ElementText;
import tasks.Login;
import userinterfaces.LoginPage;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.CoreMatchers.equalTo;

public class AutenticateSteps {

    @Given("El usuario se encuentra en la pantalla de login")
    public void elUsuarioSeEncuentraEnLaPantallaDeLogin(Actor actor) {
        givenThat(actor).attemptsTo(Open.browserOn().the(LoginPage.class)
        );
    }

    @When("El usuario ingresa su username {string} y su password {string}")
    public void elUsuarioIngresaSuUsernameYSuPassword(String username, String password) {
        when(OnStage.theActorInTheSpotlight()).attemptsTo(
                Login.with(username, password)
        );
    }

    @Then("El usuario se autentica exitosamente presentando la pantalla de inventario")
    public void elUsuarioSeAutenticaExitosamentePresentandoLaPantallaDeInventario() {
        then(OnStage.theActorInTheSpotlight()).should(
                seeThat(ElementText.of(String.valueOf(LoginPage.class)), equalTo("PRODUCTS"))
        );
    }
}