package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "step_definitions",
        plugin = {
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
       // tags = "@sequential",  // Optional: Use tag to isolate scenarios
        monochrome = true
)




    public class TestRunnerSequential extends AbstractTestNGCucumberTests{
    // Runs scenarios one after another
    }
