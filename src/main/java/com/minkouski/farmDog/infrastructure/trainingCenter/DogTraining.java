package main.java.com.minkouski.farmDog.infrastructure.trainingCenter;

import main.java.com.minkouski.farmDog.animal.TrainAnimal;

import java.util.List;

public class DogTraining implements TrainingStrategy {

    @Override
    public void trainAnimal(List<TrainAnimal> animals){
        for (TrainAnimal dog: animals ) {
            dog.train();
        }
    }
}
