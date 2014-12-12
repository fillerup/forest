package nl.forestTodo.controller;

import nl.forestTodo.domain.Item;
import nl.forestTodo.domain.Items;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @RequestMapping("/todo.json")
    public @ResponseBody Items todo() {
        return Items.items;
    }

    public void addAction(String action) {
        Items.items.addItem(action);

    }

    public void compleAction(boolean completed, int id) {
        Item item = Items.items.getItems().get(id);
        item.setDone(completed);
    }
}