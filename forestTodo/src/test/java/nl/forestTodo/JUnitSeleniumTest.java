package nl.forestTodo;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;


public class JUnitSeleniumTest {

    FirefoxDriver driver = new FirefoxDriver();

    @Before
    public void setup() {
        driver.get("http://localhost:8080/index.html");
    }

    @Test
    public void testNumberOfActions() {
        JBehaveTodoSteps todoPage = new JBehaveTodoSteps(driver);
        int incompleteActions = todoPage.getNumberOfActions();
        Assert.assertEquals("There should be 14 incomplete actions.", 10, incompleteActions);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
