package nl.forestPets.controller;

import nl.forestPets.domain.Store;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {

    @RequestMapping("/products")
    public Store greeting() {
        return new Store();
    }
}