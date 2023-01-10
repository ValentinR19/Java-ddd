package org.valrod.mooc.students.infrastructure;

import org.springframework.stereotype.Service;
import org.valrod.mooc.students.domain.Student;
import org.valrod.mooc.students.domain.StudentRepository;

import java.util.HashMap;

@Service
public class InMemoryStudentRepository implements StudentRepository {
    private HashMap<String, Student> students = new HashMap<>();
    @Override
    public void save(Student student) {
        this.students.put(String.valueOf(student.getId()),student);
    }
}
