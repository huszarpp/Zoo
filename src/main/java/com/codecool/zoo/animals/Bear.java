package com.codecool.zoo.animals;

import com.codecool.zoo.Foods;

public class Bear extends Animal{

    public Bear(String name, int weight) {
        super(name,  weight, 10);
    }

    @Override
    void modifyWeight(Foods food) {
        switch(food){
            case MEAT:
                setWeight(getWeight() + 1);
                break;
            case VEGETABLES:
                setWeight(getWeight() - 1);
                break;
            case FRUITS:
                setWeight(getWeight() + 1);
                break;
        }
    }
}

