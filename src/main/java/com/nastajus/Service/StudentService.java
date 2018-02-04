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
        return this.studentDao.getAllStudents(); //valid
    }

    // can do an actual check if students exists here.
    //      if yes, return it
    //      if not, return HTTP request code ~"data not available"~ or whatever
    public Student getStudentById(int id){
        return this.studentDao.getStudentById(id);
    }

    //we *COULD'VE* returned something like an HTTP code indicating *SUCCESSFUL* deletion, however it just does VOID.
    public void removeStudentById(int id) {
        this.studentDao.removeStudentById(id);
    }

    public void updateStudent(Student student){
        this.studentDao.updateStudent(student);
    }

    public void insertStudent(Student student) {
        this.studentDao.insertStudentToDb(student);
    }
}
