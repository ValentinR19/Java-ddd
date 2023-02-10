package org.valrod.mooc.students.infrastructure.persistence;

import org.junit.jupiter.api.Test;
import org.valrod.mooc.students.domain.Student;
import org.valrod.mooc.students.domain.StudentIdMother;
import org.valrod.mooc.students.domain.StudentMother;

import javax.transaction.Transactional;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@Transactional
class MySqlStudentRepositoryShould extends StudentModuleInfrastructureTestCase{

    @Test
    void save_a_valid_student()  {
        Student student = StudentMother.random();
        repository.save(student);
    }
    @Test
    void return_an_existing_course()  {
        Student student = StudentMother.random();
        repository.save(student);

        assertEquals(Optional.of(student), repository.search(student.getId()));
    }


    @Test
    void not_find_a_non_existing_course_assert_false()  {


        assertFalse(repository.search(StudentIdMother.random()).isPresent());
    }
    @Test
    void not_find_a_non_existing_course()  {


        assertNotEquals(Optional.of(new Student()),(repository.search(StudentIdMother.random())));
    }

}
