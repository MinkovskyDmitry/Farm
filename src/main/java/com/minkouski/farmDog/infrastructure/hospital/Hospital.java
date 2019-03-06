package main.java.com.minkouski.farmDog.infrastructure.hospital;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import main.java.com.minkouski.farmDog.animal.BaseAnimal;
import main.java.com.minkouski.farmDog.animal.dog.Dog;
import main.java.com.minkouski.farmDog.utils.Utils;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class Hospital {

    @Getter
    @Setter
    List<BaseAnimal> animals = new ArrayList<>();

    public void moveToHospital(List<BaseAnimal> animalsToTreatment){
        animals.addAll(animalsToTreatment);
    }

    public void treatAll(){
        for (BaseAnimal animal: animals )  animal.treat();
    }

    public List<BaseAnimal> returnSpecifiedGroup(String filter){
        return Utils.returnSpeciifedGroup(animals, filter);
    }

}
