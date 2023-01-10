package org.valrod.mooc.students.application.create;

import org.junit.jupiter.api.BeforeEach;
import org.valrod.mooc.students.domain.Student;
import org.valrod.mooc.students.domain.StudentRepository;
import org.valrod.shared.application.UnitTestCase;

import static org.mockito.Mockito.*;

public class StudentModuleUnitTest extends UnitTestCase {
    protected StudentRepository repository;

    @BeforeEach
    protected void setUp(){
        repository = mock(StudentRepository.class);
    }
    protected void shouldHaveSaved(Student student){
        verify(repository,atLeastOnce()).save(student);
    }
}
