package com.nastajus.Service;

import com.nastajus.Dao.StudentDao;
import com.nastajus.Entity.Student;

import java.util.Collection;

//#3 class
public class StudentService {

    //the service that uses the database

    //where all the business logic will happen

    //we need a way to access the DAO
    private StudentDao studentDao;

    public Collection<Student> getAllStudents(){
        //return this.students.values();    //invalid
        return studentDao.getAllStudents(); //valid
    }

}
