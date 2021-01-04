package com.codecool.zoo.animals;

import com.codecool.zoo.Foods;

public class Rabbit extends Animal{

    public Rabbit(String name, int weight) {
        super(name,  weight, 4);
    }

    @Override
    void modifyWeight(Foods food) {
        switch(food){
            case MEAT:
                setWeight(getWeight() - 1);
                break;
            case VEGETABLES:
                setWeight(getWeight() + 2);
                break;
            case FRUITS:
                setWeight(getWeight() + 1);
                break;
        }
    }
}
