package cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import cydeo.pages.LoginPage;
import cydeo.utilities.ConfigurationReader;
import cydeo.utilities.Driver;

public class WarningMessage {
    LoginPage loginPage = new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("the user enters invalid {string} and {string}")
    public void the_user_enters_invalid_and(String userName, String passWord) {
        loginPage.login(userName,passWord);
    }
    @Then("the user should see {string} message")
    public void the_user_should_see_message(String expectedMessage) {
        Assert.assertEquals("Invalid username or password.", expectedMessage);
    }



}
