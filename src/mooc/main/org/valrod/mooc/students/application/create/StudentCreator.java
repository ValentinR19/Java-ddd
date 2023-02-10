package org.valrod.mooc.students.application.create;

import org.valrod.mooc.students.domain.StudentSurname;
import org.valrod.mooc.students.domain.*;
import org.valrod.shared.domain.Service;

@Service
public class StudentCreator {

    private final StudentRepository repository;

    public StudentCreator(StudentRepository repository) {
        this.repository = repository;
    }

    public void create(CreateStudentRequest request) {
        Student student = new Student(
                new StudentId(request.getId()),
                new StudentName(request.getName()),
                new StudentSurname(request.getSurname()),
                new StudentEmail(request.getEmail())
        );
        repository.save(student);
    }


}
