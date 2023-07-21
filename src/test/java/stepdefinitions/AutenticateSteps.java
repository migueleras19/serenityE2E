package stepdefinitions;

import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Managed;

public class AutenticateSteps {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("actor");

    @Given("El usuario se encuentra en la pantalla de login")
    public void elUsuarioSeEncuentraEnLaPantallaDeLogin() {

    }
    @When("El usuario ingresa username  y su password")
    public void elUsuarioIngresaUsernameYSuPassword() {

    }
    @Then("El usuario se autentica exitosamente presentando la pantalla de inventario")
    public void elUsuarioSeAutenticaExitosamentePresentandoLaPantallaDeInventario() {

    }

    @When("El usuario ingresa  usuario y su contrasena")
    public void elUsuarioIngresaUsuarioYSuContrasena(io.cucumber.datatable.DataTable dataTable) {

    }

}
