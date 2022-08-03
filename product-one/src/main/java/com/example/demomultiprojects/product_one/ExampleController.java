package com.example.demomultiprojects.product_one;

import com.example.demomultiprojects.commons.RandomNumber;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping("/random/number")
    public int randomNumber() {
        return RandomNumber.random();
    }
}