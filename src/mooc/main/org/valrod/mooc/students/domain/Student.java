package org.valrod.mooc.students.domain;

import java.util.Objects;

public class Student {
    private final StudentId id;

    private final StudentName name;

    private final StudentSurname surname;

    private final StudentEmail email;

    public Student(StudentId id, StudentName name, StudentSurname surname, StudentEmail email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
    }
    public Student(){
        this.id = null;
        this.name = null;
        this.surname = null;
        this.email = null;
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
