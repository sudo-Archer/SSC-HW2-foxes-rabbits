package io.muic.ooc.fab;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Fox extends Animal {
    // Characteristics shared by all foxes (class variables).

    // The age at which a fox can start to breed.
    private static final int BREEDING_AGE = 15;
    // The age to which a fox can live.
    private static final int MAX_AGE = 150;
    // The likelihood of a fox breeding.
    private static final double BREEDING_PROBABILITY = 0.08;
    // The maximum number of births.
    private static final int MAX_LITTER_SIZE = 2;
    // The food value of a single rabbit. In effect, this is the
    // number of steps a fox can go before it has to eat again.
    private static final int RABBIT_FOOD_VALUE = AnimalType.RABBIT.getFoodValue();
    // Random generator
    private static final Random RANDOM = new Random();
    // AnimalTypes what it can eat
    private static final Class[] EDIBLE = {Rabbit.class};

    // The fox's food level, which is increased by eating rabbits.
    private int foodLevel;

    private final int MAX_FOOD_LEVEL = 10;

    /**
     * Create a fox. A fox can be created as a new born (age zero and not
     * hungry) or with a random age and food level.
     *
     * @param randomAge If true, the fox will have random age and hunger level.
     * @param field The field currently occupied.
     * @param location The location within the field.
     */
    @Override
    public void initialize(boolean randomAge, Field field, Location location) {
        super.initialize(randomAge, field, location);
        foodLevel = RANDOM.nextInt(MAX_FOOD_LEVEL);
    }

    /**
     * This is what the fox does most of the time: it hunts for rabbits. In the
     * process, it might breed, die of hunger, or die of old age.
     *
     * @param newAnimals A list to return newly born foxes.
     */

    /**
     * Make this fox more hungry. This could result in the fox's death.
     */


    /**
     * Look for rabbits adjacent to the current location. Only the first live
     * rabbit is eaten.
     *
     * @return Where food was found, or null if it wasn't.
     */







    @Override
    public int getMaxAge() {
        return MAX_AGE;
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
    protected int getBreedingAge() {
        return BREEDING_AGE;
    }


    @Override
    protected boolean isEdible(Object animal) {
        for(int i=0; i<EDIBLE.length; i++){
            if (EDIBLE[i].isInstance(animal)){
                return true;
            }
        }
        return false;
    }
    @Override
    protected int getMaxFoodLevel() {
        return MAX_FOOD_LEVEL;
    }

    @Override
    protected int getFoodLevel() {
        return foodLevel;
    }

    @Override
    protected void setFoodLevel(int n) {
        foodLevel = n;
    }
}
