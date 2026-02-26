package com.example.demo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
@Service
@PropertySource("classpath:test.properties")
public class MyFirstService {
    private final  MyFirstClass myFirstClass;
    @Value("${app.name}")
    private String appName;
    @Value("${app.test}")
private String appTest;
    public MyFirstService (MyFirstClass myFirstClass){
        this.myFirstClass=myFirstClass;
    }
    public String tellAStory(){
         return "the dependecies is saying "+myFirstClass.sayHello()+"and the name is "+this.appName+"and the other propreties test is "+this.appTest;


    }

}
