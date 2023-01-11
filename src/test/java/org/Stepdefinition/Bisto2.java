package org.Stepdefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Bisto2 extends BaseClass {
	BistoPojo b=new BistoPojo();
	
	@When("To click the HOME button on the home page")
	public void to_click_the_HOME_button_on_the_home_page() {
	   clickBtn(b.getHome());
	}

	@When("To click the Dosa button in drop down box")
	public void to_click_the_Dosa_button_in_drop_down_box() throws InterruptedException {
		Thread.sleep(3000);
		clickBtn(b.getCookies());
		clickBtn(b.getDosa());
		
	}

	@When("To select the Masala Dosa option")
	public void to_select_the_Masala_Dosa_option() {
		
	clickBtn(b.getMasalaDosa());
	   	}

	@When("To enter the page and check the Available Time")
	public void to_enter_the_page_and_check_the_Available_Time() {
		String Time=b.getTime().getText();
		System.out.println(Time);
		
	   	}
	
}
