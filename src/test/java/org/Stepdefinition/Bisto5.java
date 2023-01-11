package org.Stepdefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Bisto5 extends BaseClass{
	BistoPojo b=new BistoPojo();
	
	@When("To click the Search icon")
	public void to_click_the_Search_icon() {
		clickBtn(b.getSearchicon());
		
	}

	@When("To select the option by probability")
	public void to_select_the_option_by_probability() {
		passText("Spanish Omelet",b.getSearchBox());
		   clickBtn(b.getSearchBox());
	    
	}

	@When("To check the dollar probability")
	public void to_check_the_dollar_probability() {
		String Dollar=b.getSpanishOmeletPrice().getText();
		System.out.println(Dollar);
	   
	}
	
}
