package nl.forestTodo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumTodoPage {

    WebDriver driver;

    public SeleniumTodoPage(WebDriver driver) {
        this.driver = driver;
    }

    public void gotoPage() {
        driver.get("http://localhost:8080/index.html");
    }

    public String getNumberOfActiveActions() {
        return driver.findElement(By.id("incompleteCount")).getText();
    }

    public int getNumberOfDisplayedActions() {
        return driver.findElements(By.xpath("//table[@id='actionTable']/tbody/tr")).size();
    }

    public String getDisplayedActionNumber(int number) {
    }

    public void addAction(String action) {
    }

    public void showCompleted(boolean showThem) {
    }

    public void completeAction(boolean completed) {
    }

}
