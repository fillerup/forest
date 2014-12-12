package nl.forestTodo.domain;

import java.util.ArrayList;

public class Items {

    public static Items items = new Items();

    private ArrayList<Item> itemList;

    private Items() {
        itemList = new ArrayList<Item>();

        itemList.add(new Item("Write angular demo app", true));
        itemList.add(new Item("Write the backend", true));
        itemList.add(new Item("Connect frontend with backend", true));
        itemList.add(new Item("Write a test driver for the FE", false));
        itemList.add(new Item("Add Testing with cucumber", false));
        itemList.add(new Item("Write a test driver for the BE ", false));
        itemList.add(new Item("Write a simulator for the FE", false));
        itemList.add(new Item("Write a simulator for the BE", false));
        itemList.add(new Item("Seperate the test data from the tests.", false));
        itemList.add(new Item("Create a recorder generator for the test data", false));
        itemList.add(new Item("Create a mock generator that uses test data", false));
        itemList.add(new Item("Create a configuration tool/format", false));
        itemList.add(new Item("Create a test runner that uses the configuration", false));
    }

    public ArrayList<Item> getItems() {
        return itemList;
    }

    public void addItem(String action) {
        itemList.add(new Item(action, false));
    }
}
