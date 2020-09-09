package com.hrms.steps;

import org.junit.Assert;

import com.hrms.pages.ReportPageElements;
import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ReportSteps extends CommonMethods{
	ReportPageElements rp;
	@Given("I navigated to the Reports Page")
	public void i_navigated_to_the_Reports_Page() {
		 rp=new ReportPageElements();
	    click(rp.Report);
	}

	@When("I enter invalid report")
	public void i_enter_invalid_report() {
	   sendText(rp.Report, "JJJjjj");
	}

	@When("I click search button")
	public void i_click_search_button() {
	    click(rp.searchBtn);
	}

	@Then("I see no record found message")
	public void i_see_no_record_found_message() {
	    String noRecord=rp.NoRecord.getText();
	    System.out.println(noRecord);
	}

	@When("I enter valid report")
	public void i_enter_valid_report() {
	   sendText(rp.Report, "Syntax Report");
	}

	@Then("I see the search report is displayed")
	public void i_see_the_search_report_is_displayed() {
	   boolean valRp= rp.Report.isDisplayed();
	   Assert.assertTrue(valRp);
	}


}
