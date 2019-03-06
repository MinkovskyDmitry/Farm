package main.java.com.minkouski.farmDog.infrastructure.work;

import main.java.com.minkouski.farmDog.animal.BaseAnimal;

import java.util.List;
import java.util.Random;

public class DogWork implements AnimalWorkStrategy {

    @Override
    public void sendSpecificAnimalsToWork(List<BaseAnimal> animals){
        for (BaseAnimal animal : animals ) {
            switch (new Random().nextInt(2)) {
                case (0):
                    moveToHospital(animal);
                    break;
                case (1):
                    moveToPolicy(animal);
                    break;
            }
        }
    }

    private void moveToHospital(BaseAnimal animal){}
    private void moveToPolicy(BaseAnimal animal){}
}
