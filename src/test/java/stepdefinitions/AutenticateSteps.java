package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.PerformsTasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.LoginPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static org.hamcrest.CoreMatchers.equalTo;

public class AutenticateSteps {



    //

    @Before
    public void prepareStage() {

        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Usuario");
    }

    @Given("El usuario se encuentra en la pantalla de login")
     public void elUsuarioSeEncuentraEnLaPantallaDeLogin() {

      String url = EnvironmentSpecificConfiguration.from(null).getProperty("webdriver.base.url");
      OnStage.theActorCalled("Usuario").attemptsTo(Open.url(url));

    }

    @When("El usuario ingresa su username {string} y password {string}")
    public void elUsuarioIngresaElUsuarioUserNameYPasswordPassword(String username, String password) {
        System.out.println("username: " + username);
        System.out.println("password: " + password);

        OnStage.theActorCalled("Usuario").attemptsTo(
            Enter.theValue(username).into(LoginPage.USERNAME_FIELD),
            Enter.theValue(password).into(LoginPage.PASSWORD_FIELD),
            Click.on(LoginPage.LOGIN_BUTTON)
        );

    }

    @Then("El usuario se autentica exitosamente presentando la pantalla de inventario")
    public void elUsuarioSeAutenticaExitosamentePresentandoLaPantallaDeInventario() {
        then(OnStage.theActorInTheSpotlight()).should(
                seeThat("Titulo de la pagina ", Text.of(LoginPage.PRODUCT_TITLE.getCssOrXPathSelector()), equalTo("Products"))
        );
    }
}
