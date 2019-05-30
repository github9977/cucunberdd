package com.test.CucumberTest;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
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
	
	
	@Given("I am manual abc$")
	public void I_am_tester_Abc(DataTable table){
		List<List<String>> data = table.raw();
		System.out.println("I am tester Abc"+data.get(0).get(0));
		System.out.println("I am tester Abc"+data.get(0).get(1));
		System.out.println("I am tester Abc"+data.get(1).get(0));
		System.out.println("I am tester Abc"+data.get(1).get(1));
		System.out.println("I am tester Abc"+data.get(2).get(0));
		System.out.println("I am tester Abc"+data.get(2).get(1));
	}

	
	@When("^i want to run test abc$")
	public void i_want_to_run_test_Abc(){
		System.out.println("i want to run test Abc");
	}
	
	@Then("^I will run test abc")
	public void I_will_run_test_Abc(){
		System.out.println("I will run test Abc");
	}
	
	@And("^Test looks good abc$")
	public void Test_looks_good_Abc(){
		System.out.println("Test looks good Abc");
	}
	
	@But("^Validation on test required abc$")
	public void Validation_on_test_required_Abc(){
		System.out.println("Validation on test required Abc");
	}
}
