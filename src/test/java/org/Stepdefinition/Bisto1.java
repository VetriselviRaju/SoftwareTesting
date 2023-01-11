package org.Stepdefinition;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Bisto1 extends BaseClass{
	   BistoPojo b=new BistoPojo();
	   @Given("To launch the chrome browser and maximize the window")
		public void to_launch_the_chrome_browser_and_maximize_the_window() {
			launchBrowser();
			   windowMaximize();
		}
		@When("To launch the url of the Bisto Bite application")
		public void to_launch_the_url_of_the_Bisto_Bite_application()  {
			
			launchUrl("https://bistrobitesdc.com/");
			 
		}
	   @When("To click the Account button")
	      public void to_click_the_Account_button()  {
		   
		   WebDriverWait wait = new WebDriverWait(driver,30);
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@href='https://bistrobitesdc.com/login'])[2]")));
		   driver.findElement(By.xpath("(//a[@href='https://bistrobitesdc.com/login'])[2]")).click();
		   }

	  @When("To enter the wrong Username in mobile field")
	public void to_enter_the_wrong_Username_in_mobile_field()  {
		  WebDriverWait wait = new WebDriverWait(driver,30);
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='text'])[3]")));
		   driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("8754098131");
	    
	    
	}
	
	 @When("To enter the wrong Password in password field")
	public void to_enter_the_wrong_Password_in_password_field() {
		 WebDriverWait wait = new WebDriverWait(driver,30);
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		   driver.findElement(By.id("password")).sendKeys("Saiaarav@22");
	   
	}
	 @When("To click the login button")
	public void to_click_the_login_button() {
		 WebDriverWait wait = new WebDriverWait(driver,30);
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='submit'])[1]")));
		   driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
	}

	  @When("To check the output as Invalid Mobile No")
	public void to_check_the_output_as_Invalid_Mobile_No() throws InterruptedException, IOException {
          
		TakesScreenshot ts = (TakesScreenshot) driver;
		File img = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(
				"C:\\Users\\Vettriselvi\\eclipse-workspace\\CucumberProject\\Screenshot\\Login.png");
		FileUtils.copyFile(img, dest);
	}
	
	
}
