package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


//to definiy is a controller rest 
@RestController
public class FirstController {
    //get decorator
@GetMapping("/")
// Response status returned
@ResponseStatus(HttpStatus.ACCEPTED)
//methode getMethodeName with type return String 
public String getMethodName() {
    return "hello  from the Controller ";
}
@PostMapping("/post")
public String postMethodName(@RequestBody String message) {
    
    return "hello from the Controller post the message passed is"+message;
}

// with order class 
@PostMapping("/post-order")
public String postMethodName(@RequestBody Order order) {
    
    return "hello from the Controller post the message passed is"+order.toString();
}
@PostMapping("/post-record")
public String postMethodNameRecord(@RequestBody OrderRecord record ){
    return "hello from the record field "+record.toString() ;
}
// get the variable name in the path 
@GetMapping("/hello/{user-name}")
public String ValuePath (@PathVariable("user-name")String name){
    return "my value in path is "+name;
}

//get param req 
@GetMapping("/helloParam")
public String valueQueryParam(@RequestParam("user-name") String name) {
    return "my value in query param is " + name;
}
}
