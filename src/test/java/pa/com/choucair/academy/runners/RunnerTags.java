package pa.com.choucair.academy.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/academyChoucair.feature",	
		tags= "@Caso1",
		glue="pa.com.choucair.academy.stepdefinitions",
		snippets=SnippetType.CAMELCASE		)
public class RunnerTags {

}
