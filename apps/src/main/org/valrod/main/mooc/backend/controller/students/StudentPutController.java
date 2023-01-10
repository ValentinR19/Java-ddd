package org.valrod.main.mooc.backend.controller.students;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.valrod.mooc.students.application.create.CreateStudentRequest;
import org.valrod.mooc.students.application.create.StudentCreator;

@RestController
public class StudentPutController {
    private StudentCreator creator;

    public StudentPutController(StudentCreator creator) {
        this.creator = creator;
    }

    @PutMapping("/students/{id}")
    public ResponseEntity<?> create(@PathVariable String id, @RequestBody Request request){
        creator.create(new CreateStudentRequest(id,request.getName(), request.getSurname(),request.getEmail()));
        return new ResponseEntity(HttpStatus.CREATED);
    }
}

    final class Request {
        private String name;
        private String surname;
        private String email;

        public Request(String name, String surname, String email) {
            this.name = name;
            this.surname = surname;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public String getSurname() {
            return surname;
        }

        public String getEmail() {
            return email;
        }
    }
