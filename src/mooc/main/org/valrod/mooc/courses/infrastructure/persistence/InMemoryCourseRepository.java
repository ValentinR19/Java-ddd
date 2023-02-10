package org.valrod.mooc.courses.infrastructure.persistence;

import org.valrod.mooc.courses.domain.Course;
import org.valrod.mooc.courses.domain.CourseId;
import org.valrod.mooc.courses.domain.CourseRepository;

import java.util.HashMap;
import java.util.Optional;

public class InMemoryCourseRepository implements CourseRepository {
    private HashMap<String, Course> courses = new HashMap<>();

    @Override
    public void save(Course course) {
        this.courses.put(course.getId().value(), course);
    }

    @Override
    public Optional<Course> search(CourseId id) {
        return Optional.ofNullable(courses.get(id.value()));
    }
}
