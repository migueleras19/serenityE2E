package stepdefinitions;

import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.PerformsTasks;
import net.serenitybdd.screenplay.actions.Open;
import userinterfaces.CheckoutPage;

import static net.serenitybdd.screenplay.GivenWhenThen.givenThat;

public class CheckSteps {

    private PerformsTasks actor;

    @Given("El usuario se encuentra en la pagina de verificacion de productos")
    public void elUsuarioSeEncuentraEnLaPaginaDeVerificacionDeProductos() {
        givenThat(actor).attemptsTo(Open.browserOn(new CheckoutPage()));
    }
    @When("Dar click en el boton {string}")
    public void darClickEnElBoton(String string) {



    }
    @When("Completa el formulario de informacion")
    public void completaElFormularioDeInformacion() {

    }
    @When("Dar clic en el boton {string}")
    public void darClicEnElBoton(String string) {


    }
    @When("Completa la informacion de pago")
    public void completaLaInformacionDePago() {

    }
    @Then("Se muestra el mensaje de {string}")
    public void seMuestraElMensajeDe(String string) {

    }

}
