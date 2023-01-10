package org.valrod.mooc.students.application.create;

import org.junit.jupiter.api.Test;
import org.valrod.mooc.students.domain.Student;
import org.valrod.mooc.students.domain.StudentMother;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;

final class StudentCreatorShould extends StudentModuleUnitTest{
    private StudentCreator creator;

    @Override
    protected void setUp() {
        super.setUp();
        creator = new StudentCreator(repository);
    }

    @Test
    void save_a_valid_student()throws Exception{

        CreateStudentRequest request = CreateStudentRequestMother.random();

        Student student = StudentMother.fromRequest(request);

        creator.create(request);

        verify(repository,atLeastOnce()).save(student);
    }
}