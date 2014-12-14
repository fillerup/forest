package nl.forestTodo.domain;

import java.util.ArrayList;

public class Items {

    public static Items items = new Items();

    private ArrayList<Item> itemList;
    
    private Items() {
        items = new ArrayList<Item>();

        items.add(new Item("Write angular demo app", true));
        items.add(new Item("Write the backend", true));
        items.add(new Item("Connect frontend with backend", true));
        items.add(new Item("Learn Git, true", true));
        items.add(new Item("Advanced JUnit", true));
        items.add(new Item("Spring test", false));
        items.add(new Item("Add Testing with Jbehave", false));
        items.add(new Item("Write a test driver for the FE", false));
        items.add(new Item("Write a test driver for the BE ", false));
        items.add(new Item("Write a simulator for the FE", false));
        items.add(new Item("Write a simulator for the BE", false));
        items.add(new Item("Seperate the test data from the tests.", false));
        items.add(new Item("Create a recorder generator for the test data", false));
        items.add(new Item("Create a mock generator that uses test data", false));
        items.add(new Item("Create a configuration tool/format", false));
        items.add(new Item("Create a test runner that uses the configuration", false));
        items.add(new Item("Docker, deploying, chef?, ansible, ", false));
    }

    public ArrayList<Item> getItems() {
        return itemList;
    }

    public void addItem(String action) {
        itemList.add(new Item(action, false));
    }
}
