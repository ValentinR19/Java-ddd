package org.valrod.mooc.courses.domain;

import org.valrod.shared.domain.StringValueObject;

public class CourseName extends StringValueObject {
    public CourseName(String value) {
        super(value);
    }
    private CourseName(){
        super("");
    }

}
