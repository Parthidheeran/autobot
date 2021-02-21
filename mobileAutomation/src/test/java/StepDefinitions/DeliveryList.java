package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tests.BaseClass;


public class DeliveryList {
	
	BaseClass baseclass = new BaseClass();
	
	@Given("^Launch the mobile application$")
	public void launch_the_mobile_application() throws InterruptedException {
		baseclass.LaunchApp();
		Thread.sleep(10000);
		baseclass.verifyHomePage();
	}

	@When("^SwipeDown in the Delivery list screen$")
	public void SwipeDown_in_the_Delivery_list_screen() throws InterruptedException {
		baseclass.swipeDown(280);
		Thread.sleep(5000);
	}

	@Then("^verify the customer description displayed in the top position after swipe down$")
	public void verify_the_customer_description_displayed_in_the_top_position_after_swipe_down() {
		baseclass.verifyDeliveryDescriptionAfterSwipeDown();
	
	}

	@When("^SwipeUp in the Delivery list screen$")
	public void SwipeUp_in_the_Delivery_list_screen() throws InterruptedException {
		baseclass.swipeUp(280);
		Thread.sleep(5000);
	}

	@Then("^verify the customer description displayed in the top position after swipe Up$")
	public void verify_the_customer_description_displayed_in_the_top_position_after_swipe_Up() {
		baseclass.verifyDeliveryDescriptionAfterSwipeUp();
	
	}


}
