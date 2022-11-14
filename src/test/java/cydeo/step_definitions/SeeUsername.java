package cydeo.step_definitions;

import io.cucumber.java.en.When;

public class SeeUsername {

    @When("I enter {string} and {string} into the username field")
    public void i_enter_and_into_the_username_field(String string , String string2) {
        System.out.println("string = " + string);
    }
}
