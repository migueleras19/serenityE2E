package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.ProductPage;

import java.util.List;

public class AddProductsToCart implements Task {

    private List<String> productos;

    public  AddProductsToCart(List<String> productos) {
        this.productos = productos;
    }

    public static Performable named(List<String> productos) {
        return new AddProductsToCart(productos);
    }

    public static Performable clickOnCartButton() {
        return Click.on(ProductPage.CART_BUTTON);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (String producto : productos) {
            actor.attemptsTo(Click.on(ProductPage.ADD_TO_CART_1.of(producto)));
            actor.attemptsTo(Click.on(ProductPage.ADD_TO_CART_2.of(producto)));
        }

        actor.attemptsTo(
                Click.on(ProductPage.CART_BUTTON),
                Click.on(ProductPage.CHECKOUT_BUTTON)
        );
    }
}
