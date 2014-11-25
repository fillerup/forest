package nl.forestTodo.domain;

import java.util.ArrayList;

public class Items {

    public ArrayList<Item> items;

    public Items() {
        items = new ArrayList<Item>();

        items.add(new Item("Write angular demo app", false));
        items.add(new Item("Write the backend", false));
        items.add(new Item("Connect frontend with backend", false));
        items.add(new Item("Write a test driver for the FE", false));
        items.add(new Item("Add Testing with cucumber", false));
        items.add(new Item("Write a test driver for the BE ", false));
        items.add(new Item("Write a simulator for the FE", false));
        items.add(new Item("Write a simulator for the BE", false));
        items.add(new Item("Seperate the test data from the tests.", false));
        items.add(new Item("Create a recorder generator for the test data", false));
        items.add(new Item("Create a mock generator that uses test data", false));
        items.add(new Item("Create a configuration tool/format", false));
        items.add(new Item("Create a test runner that uses the configuration", false));
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
