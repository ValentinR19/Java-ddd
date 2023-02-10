package org.valrod.mooc.students.infrastructure.persistence;

import org.valrod.mooc.students.domain.Student;
import org.valrod.mooc.students.domain.StudentId;
import org.valrod.mooc.students.domain.StudentRepository;

import java.util.HashMap;
import java.util.Optional;


public class InMemoryStudentRepository implements StudentRepository {
    private HashMap<String, Student> students = new HashMap<>();
    @Override
    public void save(Student student) {
        this.students.put(String.valueOf(student.getId()),student);
    }

    @Override
    public Optional<Student> search(StudentId id) {
        return Optional.ofNullable(students.get(id.value()));
    }
}
