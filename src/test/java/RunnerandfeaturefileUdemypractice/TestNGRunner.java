package RunnerandfeaturefileUdemypractice;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/RunnerandfeaturefileUdemypractice",glue= "StepDefinitionUdemyFrameeworkpractice",

		monochrome=true,plugin= {"html:target/RunnerandfeaturefileUdemypractice.html"})

public class TestNGRunner extends AbstractTestNGCucumberTests {

}
