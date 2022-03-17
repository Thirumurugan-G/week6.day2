package hooks;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/hooks/Hooks.feature",
		glue="hooks",
		monochrome = true,
		publish = true)

public class Runner extends AbstractTestNGCucumberTests{

}
