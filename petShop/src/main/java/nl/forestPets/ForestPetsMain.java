package nl.forestPets;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class ForestPetsMain {

    public static void main(String[] args) {
        SpringApplication.run(ForestPetsMain.class, args);
    }
}