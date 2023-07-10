package com.catalog.catalog.controller;

import com.catalog.catalog.model.Animal;
import com.catalog.catalog.resources.Util;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller

public class TaskController {

    @GetMapping("/animal")
    public ResponseEntity<List<Animal>> getanimal(@RequestParam String animalId) {
        Util.getInstance();
        return new ResponseEntity<>(Util.getInstance().getValue(animalId), HttpStatus.OK);

    }

    @PutMapping("/save/{animalId}")
    public ResponseEntity<String> save(@PathVariable String animalId, @RequestBody Animal animal) {
        List<Animal> animals = Util.getInstance().getValue(animalId);
        if(animals == null) {
            animals = new ArrayList<Animal>();
        }
 // String animalId, String animalName, String type, LocalDateTime dob, String breed, String owner, String vetId
        animals.add(new Animal(animal.getAnimalId(),animal.getAnimalName(), animal.getType(),LocalDateTime.now(),animal.getBreed(),animal.getOwner(), animal.getVetId()));
     Util.getInstance().add(animalId, animals);
     return new ResponseEntity<>("Success", HttpStatus.OK);

    }
}
