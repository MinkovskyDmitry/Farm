package main.java.com.minkouski.farmDog.infrastructure.trainingCenter;


import main.java.com.minkouski.farmDog.animal.TrainAnimal;
import main.java.com.minkouski.farmDog.animal.dog.Dog;

import java.util.List;

public class TrainingCenterController {

    TrainingStrategy trainingStrategy;

    public void trainAnimales(List<TrainAnimal> animals,String category){

        switch (category.toString()){
            case (Dog.DOG):
                trainingStrategy = new DogTraining();
        }

        trainingStrategy.trainAnimal(animals);
    }

}
