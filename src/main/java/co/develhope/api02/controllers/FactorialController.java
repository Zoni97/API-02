package co.develhope.api02.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorialController {

    @GetMapping("/{id}")
    public int factorial(@PathVariable int id){
        int factorial = 1;
        for(int i=1; i<id; i++) {
            factorial += factorial*i;
        }
        return factorial;
    }
}
