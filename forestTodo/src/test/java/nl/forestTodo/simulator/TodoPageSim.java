package nl.forestTodo.simulator;

import nl.forestTodo.controller.TodoController;
import nl.forestTodo.domain.Items;
import nl.forestTodo.interfaces.TodoPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TodoPageSim implements TodoPage {

    /**
     * The page variables that are not present in the backend.
     */
    public boolean showComplete = false;

    /**
     * Note, this can be the java class, a mock, a driver.
     * It's also possible that a recorder is set in the middle.
     * Do I need an interface for this??? (Yes I think I do).
     */
    @Autowired
    public TodoController todoController;

    private Items getItems() {
        return todoController.todo();
    }

    /**
     * When the page loads the content is retrieved from the backend.
     */
    public void gotoPage() {
        showComplete = false;
    }

    /**
     * The number of active actions are the ones where done is false.
     * @return
     */
    public String getNumberOfActiveActions() {

        long numberOfActiveItems = getItems().getItems().stream().filter(item -> !item.isDone()).count();
        String retVal = "" + numberOfActiveItems;
        return retVal;
    }

    /**
     * This one depends on the setting of a variable I do not know.
     * So I just return what is expected from the mock.
     * Or is a page simulator smarter than that?
     *
      * @return
     */

    public String getNumberOfDisplayedActions() {
        if(showComplete) {
            return "" + getItems().getItems().size();
        } else {
            return getNumberOfActiveActions();
        }
    }

    public String getDisplayedActionNumber(int number) {
        return getNumberOfActiveActions();
    }

    public void addAction(String action) {
        todoController.addAction(action);
    }

    public void showCompleted(boolean showThem) {
        this.showComplete = showThem;
    }

    public void completeAction(boolean completed, int id) {
        todoController.compleAction(completed, id);

    }

}
