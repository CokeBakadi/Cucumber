package org.stepdefenition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.pages.AdactinWebElements;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import reusable.pack.BaseClass;

public class StepDefenition extends BaseClass {
	public AdactinWebElements AW;
	

	@Given("user click login button")
	public void userClickLoginButton() {
	     AW = new AdactinWebElements();
	   toClick(AW.getBtnLogin());
	}
	
	@Given("user is in Adactin login page")
	public void userIsInAdactinLoginPage() {
	    
	    toPassUrl("https://adactinhotelapp.com/");
	}
	
// Scenario outline
    @When("user enter invalid {string} and invalid {string}")
    public void userEnterInvalidAndInvalid(String user, String pass) {
    	AW = new AdactinWebElements();
        totype(AW.getUser(), user);
        totype(AW.getpass(), pass);
    }
    //1d list
    @When("user enter invalid username and invalid password")
    public void userEnterInvalidUsernameAndInvalidPassword(io.cucumber.datatable.DataTable d) {
    	AW = new AdactinWebElements();
//    	 List<List<String>> asLists = d.asLists();
//   List<String> l1 = asLists.get(1);
//   String email = l1.get(1);
//   String pass = l1.get(2);
//   totype(AW.getUser(), email);
//   totype(AW.getpass(), pass);
    	 List<Map<String, String>> asMaps = d.asMaps(String.class, String.class);
    	Map<String, String> map = asMaps.get(2);
    	String email = map.get("username");
    	String pass = map.get("password");
    	totype(AW.getUser(), email);
    	totype(AW.getpass(), pass);
    	
    }
    
	@Then("user gets the Error message")
	public void userGetsTheErrorMessage() {
	    AW = new AdactinWebElements();
	    Assert.assertTrue(AW.getErrorMsg().isDisplayed());
	    System.out.println("Invalid Credentials");
	}

	@When("user enter valid username and valid password")
	public void userEnterValidUsernameAndValidPassword() {
		 AW = new AdactinWebElements();
		    totype(AW.getUser(), "Diasdaniel");
		    totype(AW.getpass(), "Dias@123");
	}

	@Then("user gets passed to next page")
	public void userGetsPassedToNextPage() {
		 AW = new AdactinWebElements();
		    Assert.assertTrue(AW.getNxtPg().isDisplayed());
		    System.out.println("Valid Credentials");
	}


}
