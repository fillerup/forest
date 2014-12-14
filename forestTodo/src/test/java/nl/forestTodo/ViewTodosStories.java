package nl.forestTodo;

import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

import java.util.Arrays;
import java.util.List;

//@RunWith(JUnitReportingRunner.class)
public class ViewTodosStories extends JUnitStories {

    public ViewTodosStories() {
        super();
    }

    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new TodoPage());
    }

    @Override
    protected List<String> storyPaths() {
        return Arrays.asList("stories/nl/forestTodo/view_todos.story");
    }
}

