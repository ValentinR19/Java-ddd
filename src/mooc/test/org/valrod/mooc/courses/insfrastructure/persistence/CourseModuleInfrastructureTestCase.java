package org.valrod.mooc.courses.insfrastructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.valrod.shared.infrastructure.InfrastructureTestCase;

public class CourseModuleInfrastructureTestCase extends InfrastructureTestCase {
    @Autowired
    protected InMemoryCourseRepository repository;
}
