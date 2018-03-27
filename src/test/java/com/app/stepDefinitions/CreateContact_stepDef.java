package com.app.stepDefinitions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.app.pages.SuiteCRMCreateContactPage;
import com.app.pages.SuiteCRMDashboardPage;
import com.app.utilities.Browser;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CreateContact_stepDef {
	SuiteCRMDashboardPage dsh = new SuiteCRMDashboardPage();
	SuiteCRMCreateContactPage cp = new SuiteCRMCreateContactPage();

	@Given("^I go to create contact page$")
	public void i_go_to_create_contact_page() {
		Actions action = new Actions(Browser.getDriver());
		action.moveToElement(dsh.createMenu).perform();
		dsh.createContactButton.click();

	}

	@Then("^I create new contact using \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void i_create_new_contact_using(String prefix, String firstName, String lastName, String phoneNumber,
			String title) {

		cp.createContact(prefix, firstName, lastName, phoneNumber, title);

	}

	@Then("^I validate all created contact info \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void i_validate_all_created_contact_info(String prefix, String firstName, String lastName,
			String phoneNumber, String title) {

		Assert.assertTrue(cp.verifyTopTitle.getText().contains(lastName.toUpperCase()), "contact title validation ");
		Assert.assertEquals(cp.firstNameSaved.getText(), firstName);
		Assert.assertEquals(cp.lastNameSaved.getText(), lastName);
		Assert.assertEquals(cp.phoneNumberSaved.getText(), phoneNumber);
		Assert.assertEquals(cp.titleSaved.getText(), title);

	}

	// @Then("^I search for contact \"([^\"]*)\"$")
	// public void i_search_for_contact(String lastName) {
	//
	// }
	//
	// @Then("^I validate search result with \"([^\"]*)\" \"([^\"]*)\"$")
	// public void i_validate_search_result_with(String lastName, String firstName)
	// {
	//
	// }

}
