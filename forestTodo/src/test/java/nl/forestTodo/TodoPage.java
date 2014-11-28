package nl.forestTodo;

import org.jbehave.core.annotations.Aliases;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class TodoPage {

    @When("I go to the todo page")
    public void openTodoPage() {
        //webdriver stuff goes in here.
    }

    @When("I check the first item on the list")
    public void checkFirstItem() {
        //webdriver stuff goes in here.
    }

    @Then("I see the 14 todo items")
    public void getNumberOf(int grid) {
        assertThat(renderer.asString(), equalTo(grid));
    }

    @Then("The first item disapears from the list")
    public void theGridShouldLookLike(String grid) {
        assertThat(renderer.asString(), equalTo(grid));
    }
}
