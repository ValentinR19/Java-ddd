package org.valrod.mooc.students.application.create;

import org.valrod.mooc.students.domain.StudentSurname;
import org.valrod.mooc.students.domain.*;

public class CreateStudentRequestMother {

    public static CreateStudentRequest create (StudentId id, StudentName name, StudentSurname surname, StudentEmail email) {
        return new CreateStudentRequest(id.value(), name.value(), surname.value(), email.toString());
    }
    public static CreateStudentRequest random(){
        return create(StudentIdMother.random(), StudentNameMother.random(),StudentSurnameMother.random(),StudentEmailMother.random());
    }
}
