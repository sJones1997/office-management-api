package com.firstapi.officemanagement.people;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class PeopleController {

    @GetMapping(value="/name")
    public People getName(@RequestParam String name) {
        return new People(name);
    }
    
}