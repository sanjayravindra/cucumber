package com.step;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdef 
{
	  WebDriver driver;
	
	  @Given("^user is  on homepage$")
	  public void user_is_on_homepage() throws Throwable 
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanjay.ravindra\\eclipse-workspace\\Totara\\src\\main\\resources\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		    driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://demo.totaralearning.com/calendar/view.php\\r\\n");
	  }

	  @When("^Enter the Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	  public void enter_the_Username_as_and_Password_as(String arg1, String arg2) throws Throwable 
	  {
		  driver.findElement(By.id("username")).sendKeys(arg1);
 		  driver.findElement(By.id("password")).sendKeys(arg2);
	  }

	  @Then("^success message is displayed$")
	  public void success_message_is_displayed() throws Throwable 
	  {
		  driver.findElement(By.id("loginbtn")).click();
			driver.close();
	  }

}
