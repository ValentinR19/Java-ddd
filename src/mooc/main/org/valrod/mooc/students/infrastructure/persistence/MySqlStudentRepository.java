package org.valrod.mooc.students.infrastructure.persistence;

import org.hibernate.SessionFactory;
import org.valrod.mooc.students.domain.Student;
import org.valrod.mooc.students.domain.StudentId;
import org.valrod.mooc.students.domain.StudentRepository;
import org.valrod.shared.domain.Service;
import org.valrod.shared.infrastructure.hibernate.HibernateRepository;

import java.util.Optional;
@Service
public class MySqlStudentRepository extends HibernateRepository<Student> implements StudentRepository {
    public MySqlStudentRepository(SessionFactory sessionFactory) {
        super(sessionFactory, Student.class);
    }

    @Override
    public void save(Student student) {
        persist(student);
    }

    @Override
    public Optional<Student> search(StudentId id) {
        return byId(id);
    }
}
