package com.codecool.zoo;

import com.codecool.zoo.animals.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal newAnimal) {
        animals.add(newAnimal);
    }

    public void feedAnimals(Foods food) {
        for (Animal animal : animals) {
            animal.feed(food);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Animal animal : animals) {
            sb.append(animal.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
