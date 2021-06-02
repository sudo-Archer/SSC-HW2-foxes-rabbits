package io.muic.ooc.fab;

public enum AnimalType {
    FOX(0.02, Fox.class),
    RABBIT(0.08, Rabbit.class);

    private double breedingProbability;

    private Class animalClass;


    AnimalType(double probability, Class animalClass){
        this.breedingProbability = probability;
        this.animalClass = animalClass;
    }

    public  double getBreedingProbability(){
        return breedingProbability;
    }
    public Class getAnimalClass() {
        return animalClass;
    }
}
