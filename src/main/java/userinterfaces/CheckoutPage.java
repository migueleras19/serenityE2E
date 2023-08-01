package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage  extends PageObject {
    public static final Target FIRST_NAME_FIELD = Target.the("fist name").located(By.id("first-name"));
    public static final Target LAST_NAME_FIELD = Target.the("last name").located(By.id("last-name"));
    public static final Target POSTAL_CODE_FIELD = Target.the("postal code field").located(By.id("postal-code"));
    public static final Target CONTINUE_BUTTON = Target.the("continue button").located(By.id("continue"));
    public static final Target FINISH_BUTTON = Target.the("finish button").located(By.id("finish"));
    public static final Target THANK_YOU_MESSAGE = Target.the("thank you message").located(By.xpath("//div[@id='checkout_complete_container']/h2"));

}
