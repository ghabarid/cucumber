package com.cmc.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDef {

  @Given("username logs in")
  public void username_logs_in() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("From current page ");
  }

  @Then("redirect to home page {int}")
  public void redirect_to_home_page(Integer pageNr) {
    System.out.println("Ridha GHABAROU -1 ->" + pageNr);

  }
}