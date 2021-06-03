package io.muic.ooc.fab;

import java.util.List;
import java.util.Random;

public class Rabbit extends Animal {
    // Characteristics shared by all rabbits (class variables).

    // The age at which a rabbit can start to breed.
    private static final int BREEDING_AGE = 5;
    // The age to which a rabbit can live.
    private static final int MAX_AGE = 40;
    // The likelihood of a rabbit breeding.
    private static final double BREEDING_PROBABILITY = 0.12;
    // The maximum number of births.
    private static final int MAX_LITTER_SIZE = 4;
    // A shared random number generator to control breeding.
    private static final Random RANDOM = new Random();


    @Override
    protected void incrementHunger() {
    }

    @Override
    protected double getBreedingProbability() {
        return BREEDING_PROBABILITY;
    }

    @Override
    protected int getMaxLitterSize() {
        return MAX_LITTER_SIZE;
    }

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    protected int getBreedingAge() {
        return BREEDING_AGE;
    }



    @Override
    protected Location moveToNewLocation() {
        return field.freeAdjacentLocation(location);
    }

    @Override
    protected boolean isEdible(Object animal) {
        return false;
    }

    @Override
    protected int getMaxFoodLevel() {
        return 0;
    }

    @Override
    protected int getFoodLevel() {
        return 0;
    }

    @Override
    protected void setFoodLevel(int n) {

    }
}
