package main.java.com.minkouski.farmDog.infrastructure.canteen;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import main.java.com.minkouski.farmDog.animal.BaseAnimal;
import main.java.com.minkouski.farmDog.animal.dog.Dog;
import main.java.com.minkouski.farmDog.utils.Utils;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class Canteen {

    @Getter
    @Setter
    List<BaseAnimal> animals = new ArrayList<>();

    public void moveToCanteen(List<BaseAnimal> animalsToFeed){
        animals.addAll(animalsToFeed);
    }

    public void feedAll(){

        for (BaseAnimal animal: animals ){

            switch (animal.getClass().getName()){
                case (Dog.DOG):
                    feedDog(animal);

            }
            animal.treat();
        }
    }

    public List<BaseAnimal> returnSpecifiedGroup(String filter){
        return Utils.returnSpeciifedGroup(animals, filter);
    }

    private void feedDog(BaseAnimal dog){
        Dog hungryDog = (Dog) dog;

        switch (Utils.convertToDogCategory(hungryDog.getAge())){
            case PUPPY:
                dog.feed(100);
                break;

            case ADULT:
                dog.feed(300);
                break;

            case ELDERLY:
                dog.feed(700);
                break;
        }

    }

}
