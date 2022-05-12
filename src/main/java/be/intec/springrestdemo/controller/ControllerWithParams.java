package be.intec.springrestdemo.controller;

import be.intec.springrestdemo.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class ControllerWithParams {

    // @PathVariable makes it so you can input stuff. naming it (@PathVariable("name")) is not required but commanded
    @GetMapping("/{name}")
    public ResponseEntity getEmployee(@PathVariable("name") String name) {
        if (name.equals("patrick")) {
            return ResponseEntity.internalServerError()
                    .body("Too fat, does not fit UTP cable...");
        } else {
            return new ResponseEntity("Hey " + name + "!", HttpStatus.OK); // will send my object in json format
        }
    }

    // below is sameasabove but two paramaters
    @GetMapping("/{firstName}/{lastName}")
    public ResponseEntity getEmployee(@PathVariable String firstName, @PathVariable String lastName) {
        if (firstName.equals("patrick")) {
            return ResponseEntity.internalServerError()
                    .body("Too fat, does not fit UTP cable...");
        } else {
            return new ResponseEntity("Hey " + firstName + " " + lastName + "! This is the method with two parameters", HttpStatus.OK); // will send my object in json format
        }
    }

    // example with datatype
    @GetMapping("/id/{id}")
    public ResponseEntity getEmployeeById(@PathVariable Long id) {
        return ResponseEntity.ok(id);
    }


    // 2nd type: RequestBody

    // @RequestBody allows to send json in the body. here we tell the app the body will contain info of an  employee object
    @PutMapping("/id/{id}")
    public ResponseEntity updateEmployee(@PathVariable long id, @RequestBody Employee employee) {
        System.out.println(id);
        System.out.println(employee);
        return ResponseEntity.ok(employee.toString());
    }
}
