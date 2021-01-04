package com.codecool.zoo.animals;

import com.codecool.zoo.Foods;

public abstract class Animal {

    private final String name;
    private final int overweightLimit;
    private int weight;
    private boolean isAlive = true;

    public Animal(String name, int weight, int overweightLimit) {
        this.name = name;
        this.weight = weight;
        this.overweightLimit = overweightLimit;
    }

    abstract void modifyWeight(Foods food);

    public void feed(Foods food) {
        if (isAlive) {
            modifyWeight(food);
            checkAlive();
        }
    }

    private void checkAlive() {
        if (weight <= 0 || weight >= overweightLimit) {
            isAlive = false;
        }
    }

    @Override
    public String toString() {
        return "Species: " + getClass().getSimpleName() + ", Name: " + name + ", Weight: " + weight +
                ", Overweight Limit: " + overweightLimit + ", Is alive: " + isAlive;
    }

    public String getName() {
        return name;
    }

    public int getOverweightLimit() {
        return overweightLimit;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
