package cydeo.step_definitions;

import cydeo.pages.DashboardPage;
import cydeo.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RememberMe_StepDef {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @When("I enter {string} and {string}")
    public void i_enter_and(String username, String password) {
        loginPage.login(username, password);
    }

    @When("I click on Remember me on this computer checkbox")
    public void i_click_on_checkbox() {
        loginPage.rememberMe.click();
    }

    @When("I click on Login button")
    public void i_click_on_button() {
        loginPage.loginBtn.click();
    }

    @When("I logout from the application")
    public void i_logout_from_the_application() {
        dashboardPage.userMenu.click();
        dashboardPage.logoutLink.click();
    }

    @Then("I should see {string}")
    public void i_should_see_my_credentials(String username) {

        Assert.assertEquals(username, loginPage.usernameInput.getAttribute("value"));
    }
}
