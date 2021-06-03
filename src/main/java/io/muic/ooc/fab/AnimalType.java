package io.muic.ooc.fab;

import java.awt.*;

public enum AnimalType {
    HUNTER(0.01, Hunter.class, Color.BLACK, 0),
    TIGER(0.02, Tiger.class, Color.RED, 0),
    FOX(0.02, Fox.class, Color.BLUE, 0),
    RABBIT(0.08, Rabbit.class, Color.ORANGE, 9);


    private double breedingProbability;

    private Class animalClass;

    private Color color;

    private int foodValue;


    AnimalType(double probability, Class animalClass, Color color, int foodValue){
        this.breedingProbability = probability;
        this.animalClass = animalClass;
        this.color = color;
        this.foodValue = foodValue;
    }


    public  double getBreedingProbability(){
        return breedingProbability;
    }
    public Class getAnimalClass() {
        return animalClass;
    }
    public Color getColor() { return color; }
    public int getFoodValue() {return foodValue; }
}
