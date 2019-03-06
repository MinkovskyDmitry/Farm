package main.java.com.minkouski.farmDog.infrastructure.trainingCenter;

import main.java.com.minkouski.farmDog.animal.TrainAnimal;

import java.util.List;

public interface TrainingStrategy {
    public void trainAnimal(List<TrainAnimal> animals);
}
