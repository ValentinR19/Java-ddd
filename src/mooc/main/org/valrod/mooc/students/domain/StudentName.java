package org.valrod.mooc.students.domain;

import org.valrod.shared.domain.StringValueObject;

public class StudentName extends StringValueObject {
    public StudentName(String value) {
        super(value);
    }
    private StudentName(){
        super("null");
    }
}
