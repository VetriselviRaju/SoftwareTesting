package org.Stepdefinition;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Bisto3 extends BaseClass{
	BistoPojo b=new BistoPojo();
	@When("To click the Account")
	public void to_click_the_Account() {
		clickBtn(b.getAccount());
	}
	@When("To fill out the registration form with dummy data\\(name, phone number, email…)")
	public void to_fill_out_the_registration_form_with_dummy_data_name_phone_number_email() {
	   passText("Vetriselvi",b.getName());
	   passText("vetriselvi.raju@gmail.com",b.getEmail());
	   passText("8754098131",b.getPhoneNo());
	   passText("Saiaarav@22",b.getRegPswd());
	}

	@When("To click the register button")
	public void to_click_the_register_button() throws InterruptedException {
		clickBtn(b.getRegister());
		
	}

	@When("To check the output in the pop-up box as Please fill out the field")
	public void to_check_the_output_in_the_pop_up_box_as_Please_fill_out_the_field() throws IOException  {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File img = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(
				"C:\\Users\\Vettriselvi\\eclipse-workspace\\CucumberProject\\Screenshot\\Register.png");
		FileUtils.copyFile(img, dest);
		
	}
	
}
