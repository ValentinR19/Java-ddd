package org.valrod.mooc.students.infrastructure.persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.valrod.mooc.MoocContextInfrastructureTestCase;
import org.valrod.mooc.students.domain.StudentRepository;

public class StudentModuleInfrastructureTestCase extends MoocContextInfrastructureTestCase {
    @Autowired
    StudentRepository repository;
}
