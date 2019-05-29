package com.test.CucumberTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CheckBDDBasic {
	@Given("^I am tester$")
	public void I_am_tester(){
		System.out.println("I am tester");
	
	}

	
	@When("^i want to run test$")
	public void i_want_to_run_test(){
		System.out.println("i want to run test");
	}
	
	@Then("^I will run test$")
	public void I_will_run_test(){
		System.out.println("I will run test");
	}
	
	@And("^Test looks good$")
	public void Test_looks_good(){
		System.out.println("Test looks good");
	}
	
	@But("^Validation on test required$")
	public void Validation_on_test_required(){
		System.out.println("Validation on test required");
	}
	
	
	@Given("^I am tester \"([^\"]*)\" $")
	public void I_am_tester_Abc(String alpha){
		System.out.println("I am tester Abc"+alpha);
	
	}

	
	@When("^i want to run test \"([^\"]*)\" $")
	public void i_want_to_run_test_Abc(String beta){
		System.out.println("i want to run test Abc"+beta);
	}
	
	@Then("^I will run test \"([^\"]*)\" $")
	public void I_will_run_test_Abc(String gamma){
		System.out.println("I will run test Abc"+gamma);
	}
	
	@And("^Test looks good \"([^\"]*)\" $")
	public void Test_looks_good_Abc(String delta){
		System.out.println("Test looks good Abc"+delta);
	}
	
	@But("^Validation on test required \"([^\"]*)\" $")
	public void Validation_on_test_required_Abc(String jgj){
		System.out.println("Validation on test required Abc"+jgj);
	}
}
