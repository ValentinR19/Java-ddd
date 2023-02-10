package org.valrod.mooc.steps.infrastructure;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.valrod.mooc.steps.domain.Step;
import org.valrod.mooc.steps.domain.StepIdMother;
import org.valrod.mooc.steps.domain.challenge.ChallengeStepMother;
import org.valrod.mooc.steps.domain.video.VideoStepMother;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MySqlStepRepositoryShould extends StepModuleInfrastructureTestCase {
    @Test
    void save_a_video_step() {
        for (Step step : steps()) {
            repository.save(step);

        }
    }

    @Test
    void return_an_existing_challenge_step() {
        for (Step step : steps()) {
            repository.save(step);
            Assertions.assertEquals(Optional.of(step), repository.search(step.getId()));
        }
    }

    @Test
    void not_return_a_non_existing_course() {

        Assertions.assertFalse(repository.search(StepIdMother.random()).isPresent());
    }

    private List<? extends Step> steps() {
        return Arrays.asList(VideoStepMother.random(), ChallengeStepMother.random());
    }

}
