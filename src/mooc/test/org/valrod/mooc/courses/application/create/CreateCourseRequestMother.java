package org.valrod.mooc.courses.application.create;

import org.valrod.mooc.courses.domain.*;

public class CreateCourseRequestMother {
    public static CreateCourseRequest create (CourseId id, CourseName name, CourseDuration duration) {
        return new CreateCourseRequest(id.value(), name.value(), duration.value());
    }
    public static CreateCourseRequest random(){
        return create(CourseIdMother.random(), CourseNameMother.random(),CourseDurationMother.random());
    }
}
