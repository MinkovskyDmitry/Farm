package main.java.com.minkouski.farmDog.infrastructure.work;


import main.java.com.minkouski.farmDog.animal.BaseAnimal;
import main.java.com.minkouski.farmDog.animal.TrainAnimal;
import main.java.com.minkouski.farmDog.animal.dog.Dog;

import java.util.List;

public class AnimalWorkController {

    AnimalWorkStrategy animalWorkStrategy;

    public void sendAnimalsToWork(List<TrainAnimal> animals, String category){

        switch (category){
            case (Dog.DOG):
                animalWorkStrategy = new DogWork();
                break;
        }

        animalWorkStrategy.sendSpecificAnimalsToWork(animals);
    }

}
