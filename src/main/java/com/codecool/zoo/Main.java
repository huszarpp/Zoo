package com.codecool.zoo;

import com.codecool.zoo.animals.*;

public class Main {

    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        Animal animal1 = new Wolf("Akela", 3);
        Animal animal2 = new Bear("Balu", 4);
        Animal animal3 = new Rabbit("Tapsi", 2);
        Animal animal4 = new Bear("Brumi", 6);
        Animal animal5 = new Hedgehog("Durum", 4);
        zoo.addAnimal(animal1);
        zoo.addAnimal(animal2);
        zoo.addAnimal(animal3);
        zoo.addAnimal(animal4);
        zoo.addAnimal(animal5);
        System.out.println(zoo.toString());

        Foods[] foods1 = {Foods.MEAT, Foods.VEGETABLES, Foods.MEAT, Foods.FRUITS, Foods.MEAT};
        Foods[] foods2 = {Foods.MEAT, Foods.VEGETABLES, Foods.MEAT, Foods.FRUITS, Foods.MEAT, Foods.MEAT, Foods.MEAT, Foods.MEAT, Foods.MEAT, Foods.MEAT, Foods.MEAT};

        for (Foods food : foods1) {
            zoo.feedAnimals(food);
            System.out.println("Today's food: " + food.toString());
            System.out.println(zoo.toString());
        }
    }
}
