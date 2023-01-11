package org.Stepdefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Bisto6 extends BaseClass {
	BistoPojo b=new BistoPojo();

@When("To click the Our Story option")
public void to_click_the_Our_Story_option() {
   clickBtn(b.getOurStory());
}

@When("To check the spelling mistake")
public void to_check_the_spelling_mistake() {
	String corspell="It’s true! Delicious, hand -crafted crepes make us go bananas – and strawberries… and mangos…and ham & cheese…";
	String Storyspell="It’s true! Delicious, hand -crafted crepes make us go bananas – and strawberries… and mangos… and ham & cheese…";
	System.out.println (corspell.equals(Storyspell));
}
	@Then("To close the Browser")
	public void to_close_the_Browser() {
		closeEntireBrowser();
	}
}
