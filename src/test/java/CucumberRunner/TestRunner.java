package CucumberRunner;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Login.feature",
        glue = {"MyStepDefinitions"},
        monochrome=true,
        plugin = {"pretty"}
)
public class TestRunner{

}