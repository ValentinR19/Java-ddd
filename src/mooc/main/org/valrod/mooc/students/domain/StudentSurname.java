package org.valrod.mooc.students.domain;

import org.valrod.shared.domain.StringValueObject;

public class StudentSurname extends StringValueObject {

    public StudentSurname(String value) {
        super(value);
    }
    private StudentSurname(){
        super("null");
    }
}
