package org.valrod.mooc.students.domain;

import org.valrod.shared.domain.StringValueObject;

public class StudentEmail extends StringValueObject {

    public StudentEmail(String value) {
        super(value);
    }
    private StudentEmail(){
        super("null");
    }
}
