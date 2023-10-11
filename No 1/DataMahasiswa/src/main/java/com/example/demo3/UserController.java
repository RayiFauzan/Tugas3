package com.example.demo3;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/addPerson")
    public User addPerson(@RequestBody User user){
        return userRepository.save(user);
    }

    @PostMapping("/updatePerson")
    public User updatePerson(@RequestBody User user){
        return userRepository.save(user);
    }

    @GetMapping("/getAllPerson")
    public List<User> getAllPerson(){
        return userRepository.findAll();
    }

    @GetMapping("/getPerson/{id}")
    public ResponseEntity<User> getPersonById(@PathVariable Long id){
        Optional<User> person = userRepository.findById(id);
        return person.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());
    }




}
