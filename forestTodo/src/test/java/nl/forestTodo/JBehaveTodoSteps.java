package nl.forestTodo;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JBehaveTodoSteps {

    WebDriver driver;

    public JBehaveTodoSteps() {
        this.driver = new FirefoxDriver();
    }

    public JBehaveTodoSteps(WebDriver driver) {
        this.driver = driver;
    }

    @When("I go to the todo page")
    public void openTodoPage() {
        driver.get("http://localhost:8080/index.html");
    }

    @When("I check the first item on the list")
    public void checkFirstItem() {
        // Enter the query string "Cheese"
        WebElement firstCheckbox = driver.findElement(By.id("todoCheckbox[0]"));
        firstCheckbox.click();
    }

    @Then("I see the ... todo items")
    public int getNumberOfActions() {
        return Integer.parseInt(driver.findElement(By.id("incompleteCount")).getText());
    }

    @Then("The first item disapears from the list")
    public String getFirstVisableActionText() {
        return "To be implemented";
    }
}
