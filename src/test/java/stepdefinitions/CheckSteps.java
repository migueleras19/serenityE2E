package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterfaces.CheckoutPage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.CoreMatchers.is;

public class CheckSteps {

    @Given("El usuario completa el formulario de informacion")
    public void el_usuario_completa_el_formulario_de_informacion() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(CheckoutPage.FIRST_NAME_FIELD, isVisible()).forNoMoreThan(15).seconds(),
                Enter.theValue("FirstName").into(CheckoutPage.FIRST_NAME_FIELD),
                Enter.theValue("LastName").into(CheckoutPage.LAST_NAME_FIELD),
                Enter.theValue("12345").into(CheckoutPage.POSTAL_CODE_FIELD),
                Click.on(CheckoutPage.CONTINUE_BUTTON));
    }
    @When("El usuario da click al boton {string}")
    public void el_usuario_da_click_al_boton(String button) {
        theActorInTheSpotlight().attemptsTo(WaitUntil.the(CheckoutPage.FINISH_BUTTON, isVisible()).forNoMoreThan(15).seconds(),
                Click.on(CheckoutPage.FINISH_BUTTON));
    }
    @Then("El usuario identifica el de {string}")
    public void el_usuario_identifica_el_de(String string) {
        theActorInTheSpotlight().should(seeThat("Checkout Overview is visible", Text.of(CheckoutPage.CHECKOUT_OVERVIEW_TITLE), is(string)));
    }
    @Then("El usuario identifica el mensaje de {string}")
    public void el_usuario_identifica_el_mensaje_de(String string) {
        theActorInTheSpotlight().should(seeThat("Thank you message is visible", Text.of(CheckoutPage.THANK_YOU_MESSAGE), is(string)));
    }
}
