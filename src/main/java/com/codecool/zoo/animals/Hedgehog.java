package com.codecool.zoo.animals;

import com.codecool.zoo.Foods;

public class Hedgehog extends Animal{

    public Hedgehog(String name, int weight) {
        super(name,  weight, 5);
    }

    @Override
    void modifyWeight(Foods food) {
        switch(food){
            case MEAT:
                setWeight(getWeight() - 1);
                break;
            case VEGETABLES:
                break;
            case FRUITS:
                setWeight(getWeight() + 2);
                break;
        }
    }
}

