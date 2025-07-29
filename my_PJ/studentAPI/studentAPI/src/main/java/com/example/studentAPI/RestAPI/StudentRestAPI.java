package com.example.studentAPI.RestAPI;

import com.example.studentAPI.Entity.Student;

import com.example.studentAPI.Service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentRestAPI {
    private StudentService studentService;

    public StudentRestAPI(StudentService studentService) {
        this.studentService = studentService;
    }
   @GetMapping("")
    public List<Student> getStudentByNames(@RequestParam String ten) {
        return this.studentService.getStudentsByName(ten);
   }


}
