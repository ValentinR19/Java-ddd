package org.valrod.mooc.steps.domain;

import org.valrod.shared.domain.WordMother;

public class StepTitleMother {
    public static StepTitle create(String value) {
        return new StepTitle(value);
    }

    public static StepTitle random() {
        return create(WordMother.random());
    }
}
