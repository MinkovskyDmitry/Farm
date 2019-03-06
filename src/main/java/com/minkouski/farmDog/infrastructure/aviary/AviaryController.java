package main.java.com.minkouski.farmDog.infrastructure.aviary;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import main.java.com.minkouski.farmDog.animal.BaseAnimal;
import main.java.com.minkouski.farmDog.animal.dog.Dog;
import main.java.com.minkouski.farmDog.employee.Cleaner;
import main.java.com.minkouski.farmDog.utils.Utils;

import java.util.*;


@Builder
@NoArgsConstructor
public class AviaryController {

    @Setter
    @Getter
    private List<Cleaner> cleaners = new ArrayList<>();

    @Setter
    @Getter
    private List<AviaryModel> aviaries = new ArrayList<>();


    public void loadCleaners(){
        cleaners.add(new Cleaner());
        cleaners.add(new Cleaner());
        cleaners.add(new Cleaner());
    }

    public void loadAviaries(){

        List<BaseAnimal> animalsInAviary = new ArrayList<>();

        animalsInAviary.add(Dog.builder().age(2).name("Bars").aviaryId(1).build());
        animalsInAviary.add(Dog.builder().age(1).name("Bars").aviaryId(1).build());
        animalsInAviary.add(Dog.builder().age(9).name("Bars").aviaryId(1).build());

        aviaries.add(new AviaryModel(1,animalsInAviary,false));

        animalsInAviary.clear();

        animalsInAviary.add(Dog.builder().age(2).name("Rikky").aviaryId(2).build());
        animalsInAviary.add(Dog.builder().age(1).name("Rikky").aviaryId(2).build());
        animalsInAviary.add(Dog.builder().age(6).name("Rikky").aviaryId(2).build());

        aviaries.add(new AviaryModel(2,animalsInAviary,false));

    }


    public void CleanAllAviaries(){

        for (AviaryModel aviary : aviaries ) {

            if (aviary.getAnimals().size() == 0 && !aviary.isClean()){
                Cleaner randomCleaner = cleaners.get(new Random().nextInt(cleaners.size()));
                randomCleaner.clean(aviary);
            }
        }
    }

    public List<BaseAnimal> takeOutSpecifiedAnimales(String categoryName){

        List<BaseAnimal> specifiedAnimals = new ArrayList<>();

        for (AviaryModel aviary : aviaries) {
            specifiedAnimals.addAll(Utils.returnSpeciifedGroup(aviary.getAnimals(),Dog.DOG));
        }

        return specifiedAnimals;

    }

    public void moveAnimalsToAviary(List<BaseAnimal> takeOutSpecifiedAnimales){
        //Moving...
    }


}
