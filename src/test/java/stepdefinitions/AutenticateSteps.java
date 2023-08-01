package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.PerformsTasks;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenPage;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ElementText;
import tasks.Login;
import userinterfaces.LoginPage;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.CoreMatchers.equalTo;

public class AutenticateSteps {

    private PerformsTasks actor;

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("El usuario se encuentra en la pantalla de login")
    public void elUsuarioSeEncuentraEnLaPantallaDeLogin() {

        actor = OnStage.theActorCalled("Usuario");
        actor.<OpenPage>attemptsTo(Open.browserOn(new LoginPage()));
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
                seeThat("Titulo de la pagina ", ElementText.of
                        (LoginPage.PRODUCT_TITLE.getCssOrXPathSelector()), equalTo("PRODUCTS"))
        );
    }
}