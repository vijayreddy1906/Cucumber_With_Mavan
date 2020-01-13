package StepDefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStepDefination {


	@Given("^user already in LoginPage$")
	public void user_already_in_LoginPage()  {
	    System.out.println(11111111);
	}

	@When("^title of Login Page Free CRM$")
	public void title_of_Login_Page_Free_CRM()  {
	   System.out.println(222222222);
	    
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password()  {
	   System.out.println(33333333);
	    
	}

	@And("^user clicks login button$")
	public void user_clicks_login_button()  {
		System.out.println(444444444);
	    
	}

	@But("^user is on Homepage$")
	public void user_is_on_Homepage()  {
		System.out.println(55555555);
	    
	}
}
