package com.nastajus.Controller;

import com.nastajus.Entity.Student;
import com.nastajus.Service.StudentService;

import java.util.Collection;

//#4 class
public class StudentController {

    //the controller offloads the requests through the service

    //we need to get all the students from student service
    private StudentService studentService;

    public Collection<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

}
