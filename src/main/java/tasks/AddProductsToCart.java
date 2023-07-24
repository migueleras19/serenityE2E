package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.ProductPage;

public class AddProductsToCart implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProductPage.ADD_TO_CART_1),
                Click.on(ProductPage.ADD_TO_CART_2),
                Click.on(ProductPage.CART_BUTTON),
                Click.on(ProductPage.CHECKOUT_BUTTON)
        );

    }
}
