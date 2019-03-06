package main.java.com.minkouski.farmDog.employee;

import lombok.AllArgsConstructor;
import main.java.com.minkouski.farmDog.infrastructure.aviary.AviaryModel;

@AllArgsConstructor
public class Cleaner extends Employee {

    public void clean(AviaryModel aviary){
        aviary.setClean(true);
    }

}
