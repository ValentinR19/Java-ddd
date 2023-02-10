package org.valrod.mooc.students.domain;

import org.valrod.mooc.students.application.create.CreateStudentRequest;

public class StudentMother {
    public static Student create(StudentId id, StudentName name, StudentSurname surname , StudentEmail email){
        return new Student(id,name,surname,email);
    }
    public static Student fromRequest(CreateStudentRequest request){
        return create(
                StudentIdMother.create(request.getId()),
                StudentNameMother.create(request.getName()),
                StudentSurnameMother.create(request.getSurname()),
                StudentEmailMother.create(request.getEmail()));
    }
    public static Student random(){
        return create(
                StudentIdMother.random(),
                StudentNameMother.random(),
                StudentSurnameMother.random(),
                StudentEmailMother.random()
        );
    }

}
