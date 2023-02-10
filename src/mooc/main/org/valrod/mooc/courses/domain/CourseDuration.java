package org.valrod.mooc.courses.domain;

import org.valrod.shared.domain.StringValueObject;

public class CourseDuration extends StringValueObject {
    public CourseDuration(String value) {
        super(value);
    }

    private CourseDuration() {
        super("");

    }
}
