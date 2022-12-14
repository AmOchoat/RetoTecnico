package co.com.choucair.certification.retotecnico.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions( features = "src/test/resources/features/create_meeting.feature",
                                glue = "co.com.choucair.certification.retotecnico.stepdefinitions",
                                snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}
