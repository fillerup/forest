package nl.forestTodo.domain;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class ItemTest {

    Item itemUnderTest;

    @Before
         public void setUpTests() {
        itemUnderTest = new Item("My test item", false);
    }

    @After
    public void notNeeded() {
        itemUnderTest = null;
    }

    @Test
    public void testAction() {
        Assert.assertTrue("The text should be the same.", "My test item".equals(itemUnderTest.getAction()));
        Assert.assertEquals("Using objects", "one", "one");
        Assert.assertThat("Using objects", is("Using objects"));
        itemUnderTest.getAction();
    }

}
