package com.nastajus.Dao;

import com.nastajus.Entity.Student;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//#2 class
public class StudentDao {

    //get student by id
    //delete student by id
    //update

    //fake data for now
    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>(){
            {
                put(1, new Student(1, "Ian", "Computer Science"));
                put(2, new Student(2, "Daria", "Business"));
                put(3, new Student(3, "Token", "Music"));
            }
        };
    }

    public Collection<Student> getAllStudents(){
        return this.students.values();
    }

}
