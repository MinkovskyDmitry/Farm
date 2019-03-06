package main.java.com.minkouski.farmDog.utils;

import main.java.com.minkouski.farmDog.animal.BaseAnimal;
import main.java.com.minkouski.farmDog.animal.dog.DogAge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Utils {
    public static List<BaseAnimal> returnSpeciifedGroup(List<BaseAnimal> sourceScope, String filter){

        List<BaseAnimal> specifiedAnimals = new ArrayList<>();
        Iterator animalIterator = sourceScope.iterator();

        while (animalIterator.hasNext()){
            BaseAnimal animal = (BaseAnimal) animalIterator.next();

            if (animal.getClass().getName() == filter){
                specifiedAnimals.add(animal);
                animalIterator.remove();
            }
        }
        return sourceScope;
    }

    public static DogAge convertToDogCategory(int age){
        if (age <=2 ){
            return DogAge.PUPPY;
        } else if (age < 8){
            return DogAge.ADULT;
        } else return DogAge.ELDERLY;
    }

}
