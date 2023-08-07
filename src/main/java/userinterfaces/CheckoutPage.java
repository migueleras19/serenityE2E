package userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CheckoutPage  extends PageObject {
    public static final Target FIRST_NAME_FIELD = Target.the("fist name")
            .locatedBy("#first-name");

    public static final Target LAST_NAME_FIELD = Target.the("last name")
            .locatedBy("#last-name");
    public static final Target POSTAL_CODE_FIELD = Target.the("postal code field")
            .locatedBy("#postal-code");
    public static final Target CONTINUE_BUTTON = Target.the("continue button")
            .locatedBy("#continue");
    public static final Target FINISH_BUTTON = Target.the("finish button")
            .locatedBy("#finish");
    public static final Target THANK_YOU_MESSAGE = Target.the("thank you message")
            .locatedBy("//h2[@class='complete-header']");

    public static final Target CHECKOUT_OVERVIEW_TITLE = Target.the("checkout overview title")
            .locatedBy("//span[@class='title' and text()='Checkout: Overview']");
}
