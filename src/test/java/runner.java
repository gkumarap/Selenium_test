import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features"},glue = {"StepDef"},
        tags = "@First",
        plugin = {"json:target/cucumber-hdm.json", "junit:target/cucumber-hdm.xml", "pretty"})
public class runner {

}
