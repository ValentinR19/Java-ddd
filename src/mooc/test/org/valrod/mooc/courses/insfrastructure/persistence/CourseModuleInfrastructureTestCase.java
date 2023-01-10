package org.valrod.mooc.courses.insfrastructure.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.valrod.mooc.MoocContextInfrastructureTestCase;
import org.valrod.mooc.courses.domain.CourseRepository;

public class CourseModuleInfrastructureTestCase extends MoocContextInfrastructureTestCase {

    protected InMemoryCourseRepository inMemoryCourseRepository = new InMemoryCourseRepository();

    @Autowired
    protected CourseRepository mySqlCourseRepository;
}
