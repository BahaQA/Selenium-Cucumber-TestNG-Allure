package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utulities.Driver;
import io.cucumber.java.Scenario;


public class Hooks {
    @Before
    public void setupMethod() {
        System.out.println("Before hook - Thread: " + Thread.currentThread().getId());
    }

    @After
    public void teardownMethod(Scenario scenario) {
        System.out.println("After hook - Thread: " + Thread.currentThread().getId());
        try {
            if (scenario.isFailed()) {
                byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", scenario.getName());
            }
        } catch (Exception e) {
            System.out.println("Exception in screenshot capture: " + e.getMessage());
        }
        Driver.closeDriver();
        System.out.println("Driver closed - Thread: " + Thread.currentThread().getId());
    }
}
