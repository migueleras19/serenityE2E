package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterfaces.ProductPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddProductsToCart implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(ProductPage.ADD_TO_CART_1, isVisible()).forNoMoreThan(30).seconds());
        actor.attemptsTo(Click.on(ProductPage.ADD_TO_CART_1));
        actor.attemptsTo(WaitUntil.the(ProductPage.ADD_TO_CART_2, isVisible()).forNoMoreThan(30).seconds());
        actor.attemptsTo(Click.on(ProductPage.ADD_TO_CART_2));
        actor.attemptsTo(
                WaitUntil.the(ProductPage.CART_BUTTON, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(ProductPage.CART_BUTTON)
        );
    }

    public static Performable clickOnCheckoutButton() {
        return Click.on(ProductPage.CHECKOUT_BUTTON);
    }
}