package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class StepDefinition {
	
	static WebDriver driver;
	
	@Given("user must launch the facebook url")
	public static void user_must_launch_the_facebook_url() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	}
	@When("user enters the correct username and correct password")
	public static void user_enters_the_correct_username_and_correct_password() {
	driver.findElement(By.id("email")).sendKeys("ganesh");
	driver.findElement(By.id("pass")).sendKeys("6789");
		
	}

	@And("user clicks on the login button")
	public static void user_clicks_on_the_login_button() {
	   
		driver.findElement(By.name("login")).click();
	}

	@Then("user validates url is navigated to hoome page")
	public static void user_validates_url_is_navigated_to_hoome_page() {
	    System.out.println(driver.getTitle());
		boolean contains = driver.getTitle().contains("Facebook");
		Assert.assertTrue(contains);
		System.out.println("Facebook Validation");
	}


}
