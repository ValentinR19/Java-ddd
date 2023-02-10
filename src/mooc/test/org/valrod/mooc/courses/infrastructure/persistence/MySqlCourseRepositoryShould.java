package org.valrod.mooc.courses.infrastructure.persistence;

import org.junit.jupiter.api.Test;
import org.valrod.mooc.courses.domain.Course;
import org.valrod.mooc.courses.domain.CourseIdMother;
import org.valrod.mooc.courses.domain.CourseMother;

import javax.transaction.Transactional;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

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
    void not_find_a_non_existing_course_assert_false()  {


        assertTrue(mySqlCourseRepository.search(CourseIdMother.random()).isEmpty());
    }
    @Test
    void not_find_a_non_existing_course()  {


        assertNotEquals(Optional.of(new Course()),(mySqlCourseRepository.search(CourseIdMother.random())));
    }

}