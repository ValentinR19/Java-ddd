package org.valrod.mooc.courses.application.create;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.valrod.mooc.courses.domain.Course;
import org.valrod.mooc.courses.domain.CourseMother;

final class CourseCreatorShould extends CourseModuleUnitTestCase {
    private CourseCreator creator;

    @BeforeEach
    protected void setUp() {

        super.setUp();

        creator = new CourseCreator(repository);
    }

    @Test
    void create_a_valid_course() throws Exception {

        CreateCourseRequest request = CreateCourseRequestMother.random();

        Course course = CourseMother.fromRequest(request);

        creator.create(request);

        shouldHaveSaved(course);

    }

}