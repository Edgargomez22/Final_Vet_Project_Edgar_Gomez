package com.catalog.catalog.model;

import java.time.LocalDateTime;

public class Animal {
    private String animalId;
    private String animalName;
    private String type;
    private LocalDateTime dob;
    private String breed;
    private String owner;
    private String vetId;


    public Animal(String animalId, String animalName, String type, LocalDateTime dob, String breed, String owner, String vetId) {
     this.animalId = animalId;
     this.animalName = animalName;
     this.type = type;
     this.dob = dob;
     this.breed = breed;
     this.owner = owner;
     this.vetId = vetId;

    }

    public String getAnimalId() {
        return animalId;
    }

    public void setAnimalId(String animalId) {
        this.animalId = animalId;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getDob() {
        return dob;
    }

    public void setDob(LocalDateTime dob) {
        this.dob = dob;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getVetId() {
        return vetId;
    }

    public void setVetId(String vetId) {
        this.vetId = vetId;
    }






}
