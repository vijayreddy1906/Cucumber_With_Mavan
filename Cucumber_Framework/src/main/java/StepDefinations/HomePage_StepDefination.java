package StepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePage_StepDefination {
	@Given("^user is on Homepage1$")
	public void user_is_on_Homepage1() {
		System.out.println("homepage");
	}

	@When("^is element displayed$")
	public void is_element_displayed() {
		System.out.println("homepage1111111111111111111");
	}
}
