package com.springboot.basics.springbootproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController     //Discovered by Spring Auto Configuration, Registered as a Bean, and managed by Spring Framework
public class BooksController {

    @GetMapping("/books")
    public List<Book> getAllBooks() {

        return Arrays.asList(
                new Book(1L, "Cook Book", "Brook McBook")
        );

    }
}

//Spring Boot Dev Tools - automatically restarts the App whenever a change is made
//so no need to physically restart Spring Boot Application
//saves time because Dev Tools take 2-3 seconds to reload versus the actual restart of the App which takes 8-9 seconds
//that's because Dev Tools only reloads the Component/Bean that has changed, while actual App restart reloads everything

