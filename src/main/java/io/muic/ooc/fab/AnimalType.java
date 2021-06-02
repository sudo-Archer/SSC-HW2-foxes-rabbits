package io.muic.ooc.fab;

public enum AnimalType {
    FOX(0.02),
    RABBIT(0.08);

    private double breedingProbability;

    AnimalType(double probability){
        this.breedingProbability = probability;
    }

    public  double getBreedingProbability(){
        return breedingProbability;
    }

}
