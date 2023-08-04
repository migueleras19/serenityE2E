package userinterfaces;
import net.serenitybdd.screenplay.targets.Target;

public class ProductPage{

    public static final Target ADD_TO_CART_1 = Target.the("Agregar producto uno").
            locatedBy("//*[@id=\'add-to-cart-sauce-labs-bike-light\']");

    public static final Target ADD_TO_CART_2 = Target.the("Agregar producto dos").
            locatedBy("//*[@id=\'add-to-cart-sauce-labs-bolt-t-shirt\']");

    public static final Target CART_BUTTON = Target.the("cart button").
            locatedBy("//*[@id=\'shopping_cart_container\']/a");

    public static final Target CHECKOUT_BUTTON = Target.the("checkout button").
            locatedBy("//*[@id=\"checkout\"]");

}