package org.valrod.mooc.students.domain;


import org.valrod.shared.domain.Identifier;

public class StudentId extends Identifier {
    public StudentId(String value) {
        super(value);
    }

    private StudentId() {
        super("null");
    }
}
