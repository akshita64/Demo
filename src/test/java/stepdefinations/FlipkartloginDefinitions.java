package stepdefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FlipkartloginDefinitions {
	
	@Given("Flipcart is up and running and is launched")
	public void flipcart_is_up_and_running_and_is_launched() {
		System.out.println("Code for launch");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("User clicks on Login Link")
	public void user_clicks_on_Login_Link() {
		System.out.println("Code for login click");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("User provides valid credentials")
	public void user_provides_valid_credentials() {
		System.out.println("Code for valid credentials");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("user clicks on OK button")
	public void user_clicks_on_OK_button() {
		System.out.println("Code for OK button ");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}


}
