package nl.forestTodo.interfaces;

/**
 * Created by mafi on 11/12/14.
 */
public interface TodoPage {
    public void gotoPage();
    public String getNumberOfActiveActions();
    public String getNumberOfDisplayedActions();
    public String getDisplayedActionNumber(int number);
    public void addAction(String action);
    public void showCompleted(boolean showThem);
    public void completeAction(boolean completed, int id);
}
