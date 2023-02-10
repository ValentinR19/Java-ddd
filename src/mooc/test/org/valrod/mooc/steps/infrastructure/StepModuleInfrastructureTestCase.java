package org.valrod.mooc.steps.infrastructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.valrod.mooc.MoocContextInfrastructureTestCase;
import org.valrod.mooc.steps.domain.StepRepository;

public class StepModuleInfrastructureTestCase extends MoocContextInfrastructureTestCase {
    @Autowired
    protected StepRepository repository;
}
