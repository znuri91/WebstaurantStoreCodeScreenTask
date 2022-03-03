package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        tags = "@regression",
        features = "src/test/resources",
        glue = "stepDefinitions" ,
        stepNotifications = true
        //,dryRun = true

        //       ,snippets = CucumberOptions.SnippetType.CAMELCASE
        ,plugin = {
//        "pretty",   //displays more detailed output on the console
        "html:target/cucumber_built-in-report.html",   //generates built in html report at the given path
//        "json:target/cucumber.json",
//        "rerun:target/failed.txt" // generates a text file with the list of failed scenarios
}
)

public class CucumberRunner {

}
