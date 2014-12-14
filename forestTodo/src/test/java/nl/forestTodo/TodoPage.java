package nl.forestTodo;

import org.jbehave.core.annotations.Aliases;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.model.Lifecycle;
import org.jbehave.core.steps.Steps;

public class TodoPage {

    @When("I go to the todo page")
    public void openTodoPage() {
        System.out.println("Test 1");
    }

    @When("I check the first item on the list")
    public void checkFirstItem() {
        System.out.println("Test 2");
    }

    @Then("I see the 14 todo items")
    public void getNumberOfTodos(int grid) {
        //webdriver stuff goes in here.
    }

    @Then("The first item disapears from the list")
    public void getFirstTodoVisible() {
        //webdriver stuff goes in here.
    }
}
