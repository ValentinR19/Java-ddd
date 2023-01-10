package org.valrod.mooc.courses.insfrastructure.persistence;

import org.junit.jupiter.api.Test;
import org.valrod.mooc.courses.domain.Course;
import org.valrod.mooc.courses.domain.CourseIdMother;
import org.valrod.mooc.courses.domain.CourseMother;

import javax.transaction.Transactional;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
@Transactional
class MySqlCourseRepositoryShould extends CourseModuleInfrastructureTestCase{

    @Test
    void save_a_course()  {
        Course course = CourseMother.random();
        mySqlCourseRepository.save(course);
    }

    @Test
    void return_an_existing_course()  {
        Course course = CourseMother.random();
        mySqlCourseRepository.save(course);

        assertEquals(Optional.of(course), mySqlCourseRepository.search(course.getId()));
    }

    @Test
    void not_find_a_non_existing_course()  {

        assertFalse(mySqlCourseRepository.search(CourseIdMother.random()).isPresent());

    }

}