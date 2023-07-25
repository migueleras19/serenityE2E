package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Autenticate.feature",
        glue = "stepdefinitions",
        tags = "stepdefinitions.AutenticateStepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class AutenticateRunner {

}

