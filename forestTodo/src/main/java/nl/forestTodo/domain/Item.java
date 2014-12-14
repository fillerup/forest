package nl.forestTodo.domain;

public class Item {
    String action;
    boolean done;

    public Item(String action, boolean done) {
        this.action = action;
        this.done = done;
    }

    public String getAction() {
        return action;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
