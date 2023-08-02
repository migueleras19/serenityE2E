package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.AddProductsToCart;
import tasks.Login;

import java.util.ArrayList;
import java.util.List;

public class ProductSteps {
    private String actor = "user";
    private boolean isUserLoggedIn = false;
    private String username = "standard_user"; // Replace with your actual username
    private String password = "secret_sauce"; // Replace with your actual password
    private List<String> selectedProducts = new ArrayList<>();

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("El usuario se encuentra en la pagina de incio de la tienda")
    public void elUsuarioSeEncuentraEnLaPaginaDeIncioDeLaTienda() {
        if (!isUserLoggedIn) {
            OnStage.theActorCalled(actor).attemptsTo(Login.with(username, password));
            isUserLoggedIn = true;
        }
    }

    @When("Selecciona el producto {string} y lo agrega al carrito")
    public void seleccionaElProductoYLoAgregaAlCarrito(String producto) {
        selectedProducts.add(producto);
    }

    @When("Selecciona el producto dos {string} y lo agrega al carrito")
    public void seleccionaElProductoDosYLoAgregaAlCarrito(String productodos) {
        selectedProducts.add(productodos);
    }

    @Then("El usuario debe observer los dos productos seleccionados")
    public void elUsuarioDebeObserverLosDosProductosSeleccionados() {
        OnStage.theActorInTheSpotlight().attemptsTo(AddProductsToCart.named(selectedProducts));
    }
}
