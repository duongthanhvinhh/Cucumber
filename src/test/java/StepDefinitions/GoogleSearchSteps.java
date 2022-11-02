package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {

    @Given("browser is open")
    public void browser_is_open() {
        System.out.println("Inside step - browser is open");
    }
    @And("user is on google search page")
    public void user_is_on_google_search_page() {
        System.out.println("Inside step - user is on google search page");
    }
    @When("user enters texts in search box")
    public void user_enters_texts_in_search_box() {
        System.out.println("Inside step - user enters text in search box");
    }
    @And("hits Enter")
    public void hits_enter() {
        System.out.println("Inside step - hits enter");
    }
    @Then("user is navigated to search results")
    public void user_is_navigated_to_search_results() {
        System.out.println("Inside step - user is navigated to search results");
    }

}
