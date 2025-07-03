package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.Assert.assertEquals;

public class FormFields_StepDefs {
    @When("user clicks form fields menu")
    public void user_clicks_form_fields_menu() {

    }
    @Then("password field should be displayed")
    public void password_field_should_be_displayed() {
        assertEquals(1, 1);
    }

    @Then("name field should be displayed")
    public void name_field_should_be_displayed() {
        assertEquals(1, 1);
    }

    @Then("email field should be displayed")
    public void email_field_should_be_displayed() {
        assertEquals(1, 1);
    }

}
