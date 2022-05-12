package be.intec.springrestdemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorldController {
    // url that points to my pc and has app path: /hello
    // url has to execute below method
    // http:/127.0.0.1:8080/hello --> is url we want to use
    // url points to method -> called endpoint

    private int counter = 0;

    // (below is the easy method)
    @RequestMapping("/hello") // "/" is not required. maps above path to this method (go to browser)
    public String helloWorld() {
        System.out.println("Executing the helloWorld() method for the " + ++counter + " time ...");
        return "<h1 style=\"text-align: center;\">Hello World</h1>";
    }

//    @GetMapping("/hello") // same as below but shorter
    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public String helloWorld2() {
        int result = 1 + 1;
        return "1 + 1 = " + result;
    }

    // now we have two methods (with different request method) so we can overload them
    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public ResponseEntity postExample() {
        ResponseEntity response = new ResponseEntity("Hello from post version of /hello method", HttpStatus.OK); // will send my object in json format
        return response;
    }

    // now we have three methods (with different request method) so we can overload them
    @RequestMapping(value = "/hello", method = RequestMethod.PUT)
    public ResponseEntity putExample() {
        ResponseEntity response = new ResponseEntity("Hello from put of /hello method", HttpStatus.OK); // will send my object in json format
        return response;
    }

    // now we have two methods (with different request method) so we can overload them
    @RequestMapping(value = "/helloInput", method = RequestMethod.GET)
    public ResponseEntity postExampleWithInput(String input) {
        ResponseEntity response = new ResponseEntity(input, HttpStatus.OK); // will send my object in json format
        System.out.println(input);
        return response;
    }
}
