package io.muic.ooc.fab;

import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.put;

public class AnimalFactory {

    private static Map<AnimalType, Class> animalClassMap= new HashMap<>();{{
        AnimalType[] animalTypes = AnimalType.values();
        for (int i=0; i< animalTypes.length; i++){
            put(animalTypes[i], animalTypes[i].getAnimalClass());
        }
    }};

    public static Animal createAnimal(AnimalType animalType, Field field, Location location){
        Class animalClass = animalClassMap.get(animalType);
        if (animalClass != null){
            try {
                Animal animal = (Animal) animalClass.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }


        }
        switch (animalType) {
            case RABBIT:
                return new Rabbit(true, field, location);
            case FOX:
                return new Fox(true, field, location);
            default:
                throw new IllegalArgumentException("Unknown animalType");
        }
    }

}
