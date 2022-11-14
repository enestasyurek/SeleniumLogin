package cydeo.step_definitions;

import cydeo.pages.ForgotPasswordPage;
import cydeo.pages.LoginPage;
import cydeo.utilities.ConfigurationReader;
import cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.velocity.runtime.directive.contrib.For;
import org.junit.Assert;

public class ForgotPassword {
    LoginPage loginPage = new LoginPage();
    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();
    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("I click the forgot password link")
    public void i_click_the_forgot_password_link() {
        loginPage.forgotPassword.click();
        System.out.println("Clicked on forgot password link");

    }

    @Then("I should be on the forgot password page")
    public void i_should_be_on_the_forgot_password_page() {
        Assert.assertEquals("Forgot Password", Driver.getDriver().getTitle());
        System.out.println(Driver.getDriver().getTitle());

    }

    @When("I enter the username")
    public void iEnterTheUsername() {
        forgotPasswordPage.usernameInput.sendKeys("user1");
    }

    @When("I click the request button")
    public void iClickTheRequestButton() {
        forgotPasswordPage.requestBtn.click();
    }

    @Then("I should be on the forgot password request page")
    public void iShouldBeOnTheForgotPasswordRequestPage() {
        System.out.println("Ask Yakup Hoca");
    }
}
