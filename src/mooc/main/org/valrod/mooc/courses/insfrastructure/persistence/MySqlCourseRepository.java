package org.valrod.mooc.courses.insfrastructure.persistence;


import org.hibernate.SessionFactory;
import org.valrod.mooc.courses.domain.Course;
import org.valrod.mooc.courses.domain.CourseId;
import org.valrod.mooc.courses.domain.CourseRepository;
import org.valrod.shared.domain.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class MySqlRepository  implements CourseRepository {

    private SessionFactory sessionFactory ;

    public MySqlRepository(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional
    @Override
    public void save(Course course)  {
        sessionFactory.getCurrentSession().save(course);
    }

    @Override
    public Optional<Course> search(CourseId id) {
        return Optional.ofNullable(sessionFactory.getCurrentSession().find(Course.class,id));
    }


}
