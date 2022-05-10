package be.intec.springrestdemo.controller;

import be.intec.springrestdemo.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entity")
public class WorldControllerResponseEnitiy {
    private int counter = 0;

    // (below is the easy method)
    @RequestMapping("/hello") // "/" is not required. maps above path to this method (go to browser)
    public ResponseEntity helloWorld() {
        System.out.println("Executing the helloWorld() method for the " + ++counter + " time ...");
        return ResponseEntity.ok("Response ok. Hellow World");
    }

    // same as above. other way of working
//    @GetMapping("/hello")
    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public ResponseEntity helloWorld2() {
        ResponseEntity response = new ResponseEntity("Hello Mars", HttpStatus.OK);
        return response;
    }

    @GetMapping("/person")
    public ResponseEntity person() {
        Employee employee = new Employee("Loïc", "Deketelaere", 420);
        ResponseEntity response = new ResponseEntity(employee, HttpStatus.OK); // will send my object in json format
        return response;
    }
}
