package org.valrod.mooc.courses.domain;

import org.valrod.shared.domain.UuidMother;

public final class CourseIdMother {

    public static CourseId create (String value){
        return new CourseId(value);
    }
    public static CourseId random(){
        return create(UuidMother.random());
    }

}