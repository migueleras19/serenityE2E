package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;

public class ElementText implements Question<String> {

    private final String xpath;

    public ElementText(String xpath) {
        this.xpath = xpath;
    }

    public static Question<String> of(String xpath) {
        return new ElementText(xpath);
    }

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).element(By.xpath(xpath)).getText();
    }
}
