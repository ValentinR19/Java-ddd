package org.valrod.mooc.courses.infrastructure.persistence;


import org.junit.jupiter.api.Test;
import org.valrod.mooc.courses.domain.*;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

final class InMemoryCourseRepositoryShould extends CourseModuleInfrastructureTestCase {

    @Test
    void save_a_course() throws Exception {
        Course course = CourseMother.random();
        inMemoryCourseRepository.save(course);
    }

    @Test
    void return_an_existing_course() throws Exception {
        Course course = CourseMother.random();
        inMemoryCourseRepository.save(course);

        assertEquals(Optional.of(course), inMemoryCourseRepository.search(course.getId()));
    }

    @Test
    void not_find_a_non_existing_course() throws Exception {

        assertFalse(inMemoryCourseRepository.search(CourseIdMother.random()).isPresent());

    }
}