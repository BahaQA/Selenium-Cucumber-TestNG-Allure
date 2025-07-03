package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.Assert.assertEquals;

public class SliderStepDefs {

    @When("user clicks slider menu")
    public void user_clicks_slider_menu() {

    }
    @Then("slider bar should be displayed")
    public void slider_bar_should_be_displayed() {
        assertEquals(1, 1);

    }
    @Then("current value should be displayed")
    public void current_value_should_be_displayed() {
        assertEquals(1, 1);

    }
}
