package nl.forestTodo.controller;

import nl.forestTodo.domain.Items;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @RequestMapping("/todo.json")
    public @ResponseBody Items todo() {
        return new Items();
    }
}