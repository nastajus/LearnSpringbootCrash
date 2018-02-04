package com.nastajus.Dao;

import com.nastajus.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//@Component
@Repository
public class StudentDao {

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

    public Student getStudentById(int id){
        return this.students.get(id);
    }

    public void removeStudentById(int id) {
        this.students.remove(id);
    }
}
