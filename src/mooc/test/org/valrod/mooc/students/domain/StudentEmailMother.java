package org.valrod.mooc.students.domain;

import org.valrod.shared.domain.WordMother;

public final class StudentEmailMother {
    //Modificar y validar que sea un email
    public static StudentEmail create (String value){
        return new StudentEmail(value);
    }
    public static StudentEmail random(){
        return create(WordMother.random());
    }
}
