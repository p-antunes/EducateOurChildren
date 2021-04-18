package DAI.EducateOurChildren.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class HelloWorldTest {

    @RequestMapping({"/hello"})
    public String hello(){
        return "Hello World";
    }
}
