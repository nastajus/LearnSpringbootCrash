package com.nastajus.Controller;

import com.nastajus.Entity.Student;
import com.nastajus.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

//@Controller
@RestController
@RequestMapping("/students")
public class StudentController {

    //the controller offloads the requests through the service

    @Autowired
    private StudentService studentService; // = new StudentService(); // without any spring dependency injection

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable("id") int id){ // we need a way to actually *GET* the id from the url. This annotation does that.
        return studentService.getStudentById(id);
    }

    //to actually remove something from the database
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteStudentById(@PathVariable("id") int id) {
        studentService.removeStudentById(id);
    }

}
