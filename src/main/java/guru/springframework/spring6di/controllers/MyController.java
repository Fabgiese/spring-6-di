package guru.springframework.spring6di.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Inner controller!!");
        return "Hello, World!";
    }

}
