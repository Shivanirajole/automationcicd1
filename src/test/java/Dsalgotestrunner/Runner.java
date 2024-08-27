package Dsalgotestrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features= {"src/test/resources/features/DSAlgo_login.feature"},
		glue="DsAlgoproject",
		dryRun=true,
		monochrome = true,
		plugin={"pretty","html:target/Dsalgo123.html"}
		
		)



public class Runner {
	
	

}
