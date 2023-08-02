package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.saucedemo.com/")

public class LoginPage extends PageObject {
    public  static final Target USERNAME_FIELD = Target.the("username field")
            .locatedBy("#user-name");
    public static final Target PASSWORD_FIELD = Target.the("password field")
            .locatedBy("#password");
    public static final Target LOGIN_BUTTON = Target.the("login button")
            .locatedBy("#login-button");

    public static final Target PRODUCT_TITLE = Target.the("Product")
            .locatedBy(".title");


}
