package org.valrod.mooc.steps.domain.challenge;

import org.valrod.mooc.steps.domain.StepId;
import org.valrod.mooc.steps.domain.StepIdMother;
import org.valrod.mooc.steps.domain.StepTitle;
import org.valrod.mooc.steps.domain.StepTitleMother;

public class ChallengeStepMother {
    public static ChallengeStep create(StepId id, StepTitle title, ChallengeStepStatement statement) {
        return new ChallengeStep(id, title, statement);
    }

    public static ChallengeStep random() {
        return create(StepIdMother.random(), StepTitleMother.random(), ChallengeStepStatementMother.random());
    }
}
