package com.cmc.cucumber;



/*
@CucumberOptions(
    features = "src/test/resources/string-palindrome.feature",
    glue = "com.cmc"
)
*/


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class PalindromeStepDef {

  private String testPalindrome;


  @Given("username {string} and pwd {string}")
  public void usernameAndPwd(String arg0, String arg1) {
    System.out.println("Given username and pwd " + arg0);
  }

  private boolean isPalindrome;

 /* @Given("I entered string {string}")
  public void iEnteredString(String toTest) {
    testPalindrome = toTest;
    System.out.println("Så starte AAAAA!!!" + testPalindrome);
    throw new RuntimeException();
  }

  @When("I test it for Palindrome")
  public void iTestItForPalindrome() {
    System.out.println("Så starte sNNN!!!" + testPalindrome);
    isPalindrome = testPalindrome
        .equalsIgnoreCase(new StringBuilder(testPalindrome).reverse().toString());
  }

  @Then("the result should be {string}")
  public void theResultShouldBe(String result) {
    boolean expectedResult = Boolean.parseBoolean(result);
    if (expectedResult) {
      Assert.assertTrue(isPalindrome);
    } else {
      Assert.assertFalse(isPalindrome);
    }
  }

  @Given("username {string} and pwd {string}")
  public void usernameAndPwd(String arg0, String arg1) {
  }

  @And("submit page")
  public void submitPage() {
  }

  @Then("redirect to home page")
  public void redirectToHomePage() {
  }*/

  @And("submit page{int}")
  public void submitPage(int arg0) {
    System.out.println("Our arg is" + arg0);
  }

  @And("submit page")
  public void submitPage() {
  }

  @Then("redirect to home page")
  public void redirectToHomePage() {
  }
}
