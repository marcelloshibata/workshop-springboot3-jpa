package com.shida.springCourseWebServices.resources;

import com.shida.springCourseWebServices.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Sabrina", "sabrina@gmail.com", "997195148", "sahecello");
        return ResponseEntity.ok().body(u);
    }

}
