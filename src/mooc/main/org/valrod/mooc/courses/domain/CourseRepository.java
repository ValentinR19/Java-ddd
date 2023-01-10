package org.valrod.mooc.courses.domain;


import org.hibernate.HibernateException;

import java.util.Optional;

public interface CourseRepository {
    void save(Course course) throws HibernateException;

    Optional<Course> search(CourseId id);
}
