package org.valrod.mooc.courses.infrastructure.persistence;


import org.hibernate.SessionFactory;
import org.valrod.mooc.courses.domain.Course;
import org.valrod.mooc.courses.domain.CourseId;
import org.valrod.mooc.courses.domain.CourseRepository;
import org.valrod.shared.domain.Service;
import org.valrod.shared.infrastructure.hibernate.HibernateRepository;

import java.util.Optional;

@Service
public class MySqlCourseRepository extends HibernateRepository<Course> implements CourseRepository {


    public MySqlCourseRepository(SessionFactory sessionFactory) {
        super(sessionFactory, Course.class);
    }

    @Override
    public void save(Course course)  {
        persist(course);
    }

    @Override
    public Optional<Course> search(CourseId id) {
        return byId(id);
    }


}
