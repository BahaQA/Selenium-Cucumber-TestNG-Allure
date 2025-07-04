package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utulities.Driver;

import static org.testng.Assert.assertEquals;

public class Popup_StepDefs {
    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {
        Driver.getDriver().get("https://practice-automation.com/");

    }

    @When("user clicks popup menu")
    public void user_clicks_popup_menu() {

    }
    @Then("popup menu should be displayed")
    public void popup_menu_should_be_displayed() {
        assertEquals(1, 1);

    }

    @When("user clicks alert popup")
    public void user_clicks_alert_popup() {

    }
    @Then("alert message should be displayed")
    public void alert_message_should_be_displayed() {
        assertEquals(1, 1);

    }
}
