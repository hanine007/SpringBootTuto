package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

//to definiy is a controller rest 
@RestController
public class FirstController {
    //get decorator
@GetMapping("/")
public String getMethodName() {
    return "hello  from the Controller ";
}

}
