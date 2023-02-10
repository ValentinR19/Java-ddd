package org.valrod.mooc.steps.domain.video;

import org.valrod.mooc.steps.domain.*;
import org.valrod.shared.domain.VideoUrl;
import org.valrod.shared.domain.VideoUrlMother;

public class VideoStepMother  {
    public static VideoStep create(StepId id, StepTitle title, VideoUrl videoUrl, VideoStepText text) {
        return new VideoStep(id, title, videoUrl, text);
    }

    public static VideoStep random() {
        return create(
                StepIdMother.random(),
                StepTitleMother.random(),
                VideoUrlMother.random(),
                VideoStepTextMother.random()
        );
    }
}
