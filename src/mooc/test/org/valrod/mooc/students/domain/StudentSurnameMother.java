package org.valrod.mooc.students.domain;

import org.valrod.shared.domain.WordMother;

public final class StudentSurnameMother  {
    public static StudentSurname create (String value){
        return new StudentSurname(value);
    }
    public static StudentSurname random(){
        return create(WordMother.random());
    }
}
