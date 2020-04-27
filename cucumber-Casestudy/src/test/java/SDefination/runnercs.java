package SDefination;

import org.junit.runner.RunWith;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/cs3.feature",
//glue="stepdefinition",
//tags={"~@select"},
plugin={"html:target/htmlreport",
		"json:target/jsonreport.json",
		"junit:target/xmlreport.xml"
})
public class runnercs {

}
