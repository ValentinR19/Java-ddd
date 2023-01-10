package org.valrod.mooc.courses.domain;

import org.valrod.shared.domain.IntegerMother;
import org.valrod.shared.domain.RandomElementPicker;

public class CourseDurationMother {
    public static CourseDuration create (String value){
        return new CourseDuration(value);
    }
    public static CourseDuration random(){
        return create(
                String.format(
                        "%s %s",
                        IntegerMother.random(),
                        RandomElementPicker.from("years","months","days","hours","minutes","seconds"))
        );
    }
}
