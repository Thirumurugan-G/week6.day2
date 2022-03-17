package runner_Tags;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/java/features_tags/tags.feature",
		glue = "steps_Tags",
		monochrome = true,
		publish = true,
		tags="@Sanity or @Smoke"
		)
public class Runner extends AbstractTestNGCucumberTests{

}
