package main.java.com.minkouski.farmDog.infrastructure.work;

import main.java.com.minkouski.farmDog.animal.BaseAnimal;
import main.java.com.minkouski.farmDog.animal.TrainAnimal;

import java.util.List;

public interface AnimalWorkStrategy {
    public void sendSpecificAnimalsToWork(List<TrainAnimal> animals);
}
