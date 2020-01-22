package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	static WebDriver driver;
	@Given("user launches and open app")
	public void user_launches_and_open_app() { 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\prems\\OneDrive\\Desktop\\eclipse ide\\sample\\div\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		driver.findElement(By.id("email")).sendKeys("honey@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("honey123");
	   
	}

	@When("user click login button")
	public void user_click_login_button() {
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	   
	}

	@Then("user navigates to home page")
	public void user_navigates_to_home_page() {
		System.out.println("user is not in home page");
	    
	}



}
