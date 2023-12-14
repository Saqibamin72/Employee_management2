package com.dailySaqibsameena_Springbootdemo2.Controller;

import com.dailySaqibsameena_Springbootdemo2.model1.User1;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController

public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "Hello SpringBoot";
    }

    @RequestMapping("/user1")
    public User1 user() {
        User1 user1 = new User1();
        user1.setId("1");
        user1.setName("sameena");
        user1.setEmailId("sameena.hassan");
        return user1;

    }
    @GetMapping("/{id}/{id2}/{id3}")
    public String pathvariable(@PathVariable String id,@PathVariable("id2") String Nav,@PathVariable String id3){
        return  "the pathVAriabele is "+id+":"+Nav+"and"+id3;
    }
    @GetMapping("/requestParam")
    public String requestParams(@RequestParam String name,@RequestParam(name="email",required = false,defaultValue = " ") String emailId){
        return "name is:" +name+ "and email is: "+emailId;
    }



}