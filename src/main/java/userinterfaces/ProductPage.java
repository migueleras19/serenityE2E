package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ProductPage {
    public static final Target ADD_TO_CART_1 = Target.the("add to cart button form product 1").locatedBy("//button['add-to-cart-sauce-labs-bike-light']");
    public static final Target ADD_TO_CART_2 = Target.the("aad to cart button form product 2").locatedBy("//button['add-to-cart-sauce-labs-bolt-t-shirt']");
    public static final Target CART_BUTTON = Target.the("cart button").locatedBy("//div['shopping_cart_container']/a[@safeclass~'\\bshopping_cart_link\\b']");
    public static final Target CHECKOUT_BUTTON = Target.the("checkout button").locatedBy("//button[#'checkout']");

}
