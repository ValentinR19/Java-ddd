package org.valrod.mooc.steps.domain.challenge;

import org.valrod.mooc.steps.domain.Step;
import org.valrod.mooc.steps.domain.StepId;
import org.valrod.mooc.steps.domain.StepTitle;

public class ChallengeStep extends Step {
    private final ChallengeStepStatement statement;

    public ChallengeStep(StepId id, StepTitle title, ChallengeStepStatement statement) {
        super(id, title);
        this.statement = statement;
    }

    public ChallengeStep() {
        super(null,null);
        this.statement = null;
    }


}
