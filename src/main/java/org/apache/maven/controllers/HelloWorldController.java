package org.apache.maven.controllers;

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/world")
    public String sayHi(){
        return "hello world!";
    }

}
