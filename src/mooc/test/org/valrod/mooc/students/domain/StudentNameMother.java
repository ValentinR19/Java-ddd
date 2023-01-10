package org.valrod.mooc.students.domain;

import org.valrod.shared.domain.WordMother;

public final class StudentNameMother {
    public static StudentName create (String value){
        return new StudentName(value);
    }
    public static StudentName random(){
        return create(WordMother.random());
    }
}
