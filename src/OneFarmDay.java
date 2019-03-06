import main.java.com.minkouski.farmDog.animal.BaseAnimal;
import main.java.com.minkouski.farmDog.animal.TrainAnimal;
import main.java.com.minkouski.farmDog.animal.dog.Dog;
import main.java.com.minkouski.farmDog.animal.dog.DogAge;
import main.java.com.minkouski.farmDog.infrastructure.aviary.AviaryController;
import main.java.com.minkouski.farmDog.infrastructure.canteen.Canteen;
import main.java.com.minkouski.farmDog.infrastructure.hospital.Hospital;
import main.java.com.minkouski.farmDog.infrastructure.trainingCenter.TrainingCenterController;
import main.java.com.minkouski.farmDog.infrastructure.work.AnimalWorkController;
import main.java.com.minkouski.farmDog.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class OneFarmDay {

    private static AviaryController aviaryController = new AviaryController();
    private static Canteen canteen = new Canteen();
    private static Hospital hospital = new Hospital();
    private static TrainingCenterController trainingCenterController = new TrainingCenterController();
    private static AnimalWorkController animalWorkController = new AnimalWorkController();

    public static void main(String[] args) {

        aviaryController.loadAviaries();
        aviaryController.loadCleaners();

        List<BaseAnimal> dogs = aviaryController.takeOutSpecifiedAnimales(Dog.DOG);

        canteen.moveToCanteen(dogs);
        canteen.feedAll();
        dogs = canteen.returnSpecifiedGroup(Dog.DOG);

        hospital.moveToHospital(dogs);
        hospital.treatAll();
        dogs = hospital.returnSpecifiedGroup(Dog.DOG);

        aviaryController.CleanAllAviaries();



        List<TrainAnimal> dogsForTrain = new ArrayList<>();
        dogs.stream().filter(animal -> Utils.convertToDogCategory(((Dog) animal).getAge()) == DogAge.PUPPY)
                                                     .forEach(animal -> dogsForTrain.add((TrainAnimal) animal));
        dogs.removeIf(animal -> Utils.convertToDogCategory(((Dog) animal).getAge()) == DogAge.PUPPY);
        trainingCenterController.trainAnimales(dogsForTrain,Dog.DOG);


        List<TrainAnimal> dogsForWork = new ArrayList<>();
        dogs.stream().filter(animal -> Utils.convertToDogCategory(((Dog) animal).getAge()) == DogAge.ADULT)
                .forEach(animal -> dogsForWork.add((TrainAnimal) animal));
        dogs.removeIf(animal -> Utils.convertToDogCategory(((Dog) animal).getAge()) == DogAge.ADULT);
        animalWorkController.sendAnimalsToWork(dogsForWork,Dog.DOG);

        dogs.addAll(dogsForWork);
        dogs.addAll(dogsForTrain);

        aviaryController.moveAnimalsToAviary(dogs);
    }
}
