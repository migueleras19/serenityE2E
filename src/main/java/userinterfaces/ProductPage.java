package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ProductPage {
    public static final Target ADD_TO_CART_1 = Target.the("add to cart button form product 1").located(By.id("add-to-cart-sauce-labs-bike-light"));
    public static final Target ADD_TO_CART_2 = Target.the("aad to cart button form product 2").located(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
    public static final Target CART_BUTTON = Target.the("cart button").located(By.id("shopping_cart_link"));
    public static final Target CHECKOUT_BUTTON = Target.the("checkout button").located(By.id("checkout"));

}
