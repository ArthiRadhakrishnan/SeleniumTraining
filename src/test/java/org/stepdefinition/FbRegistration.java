package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.pojo.SignInPojo;
import io.cucumber.datatable.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbRegistration extends BaseClass {
	SignInPojo s;

	@Given("To launch the browser and maximize the window")
	public void to_launch_the_browser_and_maximize_the_window() {
		launchBrowser();
		windowMaximize();
	}

	@When("To launch the url of facebook application")
	public void to_launch_the_url_of_facebook_application() {
		launchUrl("https://en-gb.facebook.com/");
	}

	@When("To click the create new button")
	public void to_click_the_create_new_button() {
		s = new SignInPojo();
		clickBtn(s.getCreateNewAccount());
	}

	@When("To pass the firstname in firstname text box")
	public void to_pass_the_firstname_in_firstname_text_box(DataTable d) throws InterruptedException {
		Thread.sleep(3000);
		Map<String, String> m = d.asMap(String.class, String.class);
		s = new SignInPojo();
		passText(m.get("firstname3"), s.getFirstname());
	}

	@When("To pass the second name in secondname text box")
	public void to_pass_the_second_name_in_secondname_text_box() {
		s = new SignInPojo();
		passText("inmakes", s.getSurname());
	}

	@When("To pass mobile number or email id in the email text box")
	public void to_pass_mobile_number_or_email_id_in_the_email_text_box(DataTable d) {
		List<Map<String, String>> m = d.asMaps();
		s = new SignInPojo();
		passText(m.get(1).get("password1"), s.getMobile());
	}

	@When("To create new password using  newpassword text box")
	public void to_create_new_password_using_newpassword_text_box() {
		s = new SignInPojo();
		passText("123456", s.getPasswd());
	}

	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() {
		// closeEntireBrowser();
	}

}
