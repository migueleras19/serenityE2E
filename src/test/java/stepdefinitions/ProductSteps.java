package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;
import tasks.AddProductsToCart;
import userinterfaces.ProductPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ProductSteps {
    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("El usuario se encuentra en la pagina de incio de la tienda")
    public void elUsuarioSeEncuentraEnLaPaginaDeIncioDeLaTienda() {
        OnStage.theActorCalled("Usuario");
    }

    @When("Selecciona el producto {string} y lo agrega al carrito")
    public void seleccionaElProductoYLoAgregaAlCarrito(String producto) {
        OnStage.theActorInTheSpotlight().attemptsTo(new AddProductsToCart());
    }

    @When("Selecciona el producto dos {string} y lo agrega al carrito")
    public void selecciona_el_producto_dos_y_lo_agrega_al_carrito(String productoDos) {
        OnStage.theActorInTheSpotlight().attemptsTo(new AddProductsToCart());
    }

    @And("El usuario hace click en el carrito de compras")
    public void elUsuarioHaceClickEnElCarritoDeCompras() {
        OnStage.theActorInTheSpotlight().attemptsTo(WaitUntil.the(ProductPage.CART_BUTTON, isVisible()).forNoMoreThan(30).seconds());
        OnStage.theActorInTheSpotlight().attemptsTo(Click.on(ProductPage.CART_BUTTON));
    }

    @And("El usuario hace click en el boton {string}")
    public void elUsuarioHaceClickEnElBoton(String button) {
        OnStage.theActorInTheSpotlight().attemptsTo(WaitUntil.the(ProductPage.CHECKOUT_BUTTON, isVisible()).forNoMoreThan(30).seconds());
        OnStage.theActorInTheSpotlight().attemptsTo(AddProductsToCart.clickOnCheckoutButton());
    }
}