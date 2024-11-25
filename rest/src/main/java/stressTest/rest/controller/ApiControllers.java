package stressTest.rest.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiControllers {

    ArrayList<User> list = new ArrayList<User>();

    @GetMapping(value = "/")
    public String getPage() {

        return "Populate the array!";
    }

    @GetMapping(value = "/1")
    public String tryThis() {
        return "This is a number 1";
    }

    @PostMapping(value = "/createUser")
    public String createUser(@RequestBody String name) {
        list.add(new User(name));

        return name;
    }

    @GetMapping(value = "/getUser")
    public String getUser() {
        return list.get(0).getName();
    }

    @PostMapping(value = "/post")
    public int postRoute() {
        return 1;
    }

    @GetMapping(value = "/get")
    public int getRoute() {
        return 2;
    }

    @PutMapping(value = "/put")
    public int putRoute() {
        return 3;
    }

    @DeleteMapping(value = "/delete")
    public int deleteRoute() {
        return 4;
    }
}

class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}