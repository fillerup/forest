package nl.forestTodo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class ForestTodoMain {

    public static void main(String[] args) {
        SpringApplication.run(ForestTodoMain.class, args);
    }
}