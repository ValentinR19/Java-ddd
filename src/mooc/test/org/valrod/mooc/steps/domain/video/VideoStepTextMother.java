package org.valrod.mooc.steps.domain.video;

import org.valrod.shared.domain.WordMother;

public class VideoStepTextMother {
    public static VideoStepText create(String value) {
        return new VideoStepText(value);
    }

    public static VideoStepText random() {
        return create(WordMother.random());
    }
}
