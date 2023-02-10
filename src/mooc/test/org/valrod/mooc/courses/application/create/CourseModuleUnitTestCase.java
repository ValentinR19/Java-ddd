package org.valrod.mooc.courses.application.create;

import org.junit.jupiter.api.BeforeEach;
import org.valrod.mooc.courses.domain.Course;
import org.valrod.mooc.courses.domain.CourseRepository;
import org.valrod.shared.application.UnitTestCase;

import static org.mockito.Mockito.*;

public class CourseModuleUnitTestCase extends UnitTestCase {
    protected CourseRepository repository;

    @BeforeEach
    protected void setUp(){
        repository = mock(CourseRepository.class);
    }


    protected void shouldHaveSaved(Course course){
        verify(repository,atLeastOnce()).save(course);
    }
}
