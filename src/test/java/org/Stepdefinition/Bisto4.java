package org.Stepdefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Bisto4 extends BaseClass{
	BistoPojo b=new BistoPojo();
	
	@When("To click the search icon")
	public void to_click_the_search_icon() {
	   clickBtn(b.getSearchicon());
	}

	@When("To search Coke and check the can dollar price")
	public void to_search_Coke_and_check_the_can_dollar_price() throws InterruptedException {
		Thread.sleep(3000);
		clickBtn(b.getSearchBox());
	  passText("coke",b.getSearchBox());
	   clickBtn(b.getSearchBox());
	   String Dollar=b.getCanPrice().getText();
		System.out.println(Dollar);
	}
	
}
