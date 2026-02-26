package com.example.demo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
@Service
@PropertySource("classpath:test.properties")
public class MyFirstService {
    private final  MyFirstClass myFirstClass;
    //get value from env file 
    @Value("${app.name}")
    private String appName;
    //get value from enn file that is not the appplication properties
    @Value("${app.test}")
private String appTest;
// constructor for the Myfirsclass to do the injection dependecies
    public MyFirstService (MyFirstClass myFirstClass){
        this.myFirstClass=myFirstClass;
    }
    public String tellAStory(){
         return "the dependecies is saying "+myFirstClass.sayHello()+"and the name is "+this.appName+"and the other propreties test is "+this.appTest;


    }

}
