package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public  static final Target USERNAME_FIELD = Target.the("username field").located(By.id("user-name"));
    public static final Target PASSWORD_FIELD = Target.the("password field").located(By.id("password"));
    public static final Target LOGIN_BUTTON =Target.the("login button").located(By.id("login-button"));

}
