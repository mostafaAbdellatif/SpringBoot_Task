package com.example.demo.task;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/solve")
public class ControllerClass {

    private final ServiceClass serviceClass;

    @Autowired
    public ControllerClass(ServiceClass serviceClass) {
        this.serviceClass = serviceClass;
    }

    @GetMapping
    String getDefault(){
        return "You can use an API platform to make the POST request";
    }

    @PostMapping
    ResponseEntity<Integer> solveProblem(@RequestBody String number){

        int answer = serviceClass.getAnswer(number);
        return ResponseEntity.ok().body(answer);

    }


}
