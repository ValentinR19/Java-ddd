package org.valrod.mooc.courses.application.create;

import org.valrod.mooc.courses.domain.*;
import org.valrod.shared.domain.Service;


@Service
public class CourseCreator {

    private CourseRepository repository;

    public CourseCreator(CourseRepository repository) {
        this.repository = repository;
    }

    public void create(CreateCourseRequest request) {
        Course course = new Course(
                new CourseId(request.getId()),
                new CourseName(request.getName()),
                new CourseDuration(request.getDuration())
        );
        repository.save(course);
    }
}
