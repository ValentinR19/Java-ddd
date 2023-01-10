package org.valrod.mooc.students.domain;

import org.valrod.mooc.courses.domain.StudentSurname;

import java.util.Objects;

public class Student {
    private StudentId id;

    private StudentName name;

    private StudentSurname surname;

    private StudentEmail email;

    public Student(StudentId id, StudentName name, StudentSurname surname, StudentEmail email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public StudentId getId() {
        return id;
    }

    public StudentName getName() {
        return name;
    }

    public StudentSurname getSurname() {
        return surname;
    }

    public StudentEmail getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id.equals(student.id) && name.equals(student.name) && surname.equals(student.surname) && email.equals(student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, email);
    }
}
