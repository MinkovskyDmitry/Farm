package main.java.com.minkouski.farmDog.animal.dog;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import main.java.com.minkouski.farmDog.animal.TrainAnimal;

@Builder
@AllArgsConstructor
public class Dog implements TrainAnimal {

    public final static String DOG = "main.java.com.minkouski.farmDog.animal.dog.Dog";

    @Getter
    @Setter
    private int aviaryId;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private boolean isHungry = true;

    @Getter
    @Setter
    private boolean isHealthy = false;

    @Getter
    @Setter
    private int age;

    public Dog(){}

    @Override
    public void train(){
        System.out.println("Dog " + name + " is trained");
    }

    @Override
    public void feed(int grammOfFood){
        System.out.println("Dog " + name + " is ate");
        isHungry = false;
    }

    @Override
    public void treat(){
        System.out.println("Dog " + name + " is treated");
        isHealthy = true;
    }





}
