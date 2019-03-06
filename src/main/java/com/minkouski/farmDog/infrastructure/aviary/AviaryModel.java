package main.java.com.minkouski.farmDog.infrastructure.aviary;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import main.java.com.minkouski.farmDog.animal.BaseAnimal;

import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@Builder
public class AviaryModel {

    @Getter
    @Setter
    private int aviaryId;

    @Getter
    @Setter
    private List<BaseAnimal> animals = new ArrayList<>();

    @Getter
    @Setter
    private boolean isClean;
}
