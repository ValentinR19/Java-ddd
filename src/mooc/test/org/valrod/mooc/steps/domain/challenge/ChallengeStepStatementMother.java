package org.valrod.mooc.steps.domain.challenge;

import org.valrod.shared.domain.WordMother;

public class ChallengeStepStatementMother {
    public static ChallengeStepStatement create(String value) {
        return new ChallengeStepStatement(value);
    }

    public static ChallengeStepStatement random() {
        return create(WordMother.random());
    }
}
