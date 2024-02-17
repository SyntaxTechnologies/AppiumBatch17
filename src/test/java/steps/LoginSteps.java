package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

import java.net.MalformedURLException;

public class LoginSteps extends CommonMethods {

    @Given("user is able to open android application in android device")
    public void user_opens_the_appium_driver() throws MalformedURLException, InterruptedException {
        launchingTheApplication();
    }

    @When("user enters username and Password")
    public void user_enters_username_and_password() {
        System.out.println("Step is yet to be implemented");
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        System.out.println("Step is yet to be implemented");
    }
    @Then("user should be able to navigate to product catalogue page")
    public void user_should_be_able_to_navigate_to_products_page() {
        System.out.println("Step is yet to be implemented");
    }
}
