package com.example.studentAPI.Service;

import com.example.studentAPI.Entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getStudents();
    public Student getStudent(int id);
    public Student addStudent(Student student);
    public Student updateStudent(Student student);
    public void deleteStudent(int id);
    public List<Student> getStudentsByName(String ten);
}
