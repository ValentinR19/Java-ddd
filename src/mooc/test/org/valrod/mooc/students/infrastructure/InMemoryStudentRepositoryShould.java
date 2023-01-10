package org.valrod.mooc.students.infrastructure;

import org.junit.jupiter.api.Test;
import org.valrod.mooc.students.domain.Student;
import org.valrod.mooc.students.domain.StudentMother;

final class InMemoryStudentRepositoryShould  {
    @Test
    void save_a_valid_student() throws Exception {
        InMemoryStudentRepository repository = new InMemoryStudentRepository();
        Student student = StudentMother.random();
        repository.save(student);
    }

}