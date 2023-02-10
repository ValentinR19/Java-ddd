package org.valrod.mooc.steps.domain;

import org.valrod.shared.domain.UuidMother;

public class StepIdMother {
    public static StepId create(String value) {
        return new StepId(value);
    }

    public static StepId random() {
        return create(UuidMother.random());
    }
}
