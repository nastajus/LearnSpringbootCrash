package com.nastajus.Service;

import com.nastajus.Dao.StudentDao;
import com.nastajus.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    //the service that uses the database

    //where all the business logic will happen

    //we need a way to access the DAO
    @Autowired
    private StudentDao studentDao;

    public Collection<Student> getAllStudents(){
        //return this.students.values();    //invalid
        return studentDao.getAllStudents(); //valid
    }

}
