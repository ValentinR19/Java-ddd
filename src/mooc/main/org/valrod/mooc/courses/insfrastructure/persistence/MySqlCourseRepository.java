package org.valrod.mooc.courses.insfrastructure.persistence;


import org.hibernate.SessionFactory;
import org.valrod.mooc.courses.domain.Course;
import org.valrod.mooc.courses.domain.CourseId;
import org.valrod.mooc.courses.domain.CourseRepository;
import org.valrod.shared.domain.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class MySqlCourseRepository implements CourseRepository {

    private final SessionFactory sessionFactory ;

    public MySqlCourseRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(Course course)  {
        sessionFactory.getCurrentSession().save(course);
    }

    @Override
    public Optional<Course> search(CourseId id) {
        return Optional.ofNullable(sessionFactory.getCurrentSession().byId(Course.class).getReference(id));
    }


}
