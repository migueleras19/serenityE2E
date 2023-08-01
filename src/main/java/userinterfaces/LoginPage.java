package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage extends PageObject {
    public  static final Target USERNAME_FIELD = Target.the("username field")
            .locatedBy("input#user-name");
    public static final Target PASSWORD_FIELD = Target.the("password field")
            .locatedBy("input#password");
    public static final Target LOGIN_BUTTON = Target.the("login button")
            .locatedBy("input#login-button");

    public static final Target PRODUCT_TITLE = Target.the("Product title")
            .locatedBy(".title");


}
