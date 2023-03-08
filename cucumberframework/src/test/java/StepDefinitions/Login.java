package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("deepthi");
	    
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
	    System.out.println("reddy");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	    
		System.out.println("abcd");
	    
	}

	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
		System.out.println("hello");
	    
	}

}
