package be.intec.springrestdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/V2")
public class WorldControllerV2 {
    // same app as V1. but with above requestmapping added. all url for this class will be -> /V2/*method*

    private int counter = 0;

    // (below is the easy method)
    @RequestMapping("/hello") // "/" is not required. maps above path to this method (go to browser)
    public String helloWorld() {
        System.out.println("Executing the helloWorld() method for the " + ++counter + " time ...");
        return "Hello World from V2";
    }

//    @GetMapping("/hello") // same as below but shorter
    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public String helloWorld2() {
        int result = 2 + 2;
        return "2 + 2 = " + result;
    }
}
