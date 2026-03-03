package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



//to definiy is a controller rest 
@RestController
public class FirstController {
    private final JpaRepositoryy repositoryy;
     
    public FirstController(JpaRepositoryy repositoryy) {
        this.repositoryy = repositoryy;
    }
 
//get decorator
@PostMapping("/student")
public String getMethodName(@RequestBody Student student) {
    repositoryy.save(student);
    return "hello  from the Controller this is the req  "+student.toString();
}


}



