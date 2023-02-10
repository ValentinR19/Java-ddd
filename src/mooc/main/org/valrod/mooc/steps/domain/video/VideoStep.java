package org.valrod.mooc.steps.domain.video;

import org.valrod.mooc.steps.domain.Step;
import org.valrod.mooc.steps.domain.StepId;
import org.valrod.mooc.steps.domain.StepTitle;
import org.valrod.shared.domain.VideoUrl;

public class VideoStep extends Step {
    private final VideoUrl videoUrl;
    private final VideoStepText text;

    public VideoStep(StepId id, StepTitle title, VideoUrl videoUrl, VideoStepText text) {
        super(id, title);

        this.videoUrl = videoUrl;
        this.text = text;
    }

    public VideoStep() {
        super(null, null);

        this.videoUrl = null;
        this.text = null;

    }
}
