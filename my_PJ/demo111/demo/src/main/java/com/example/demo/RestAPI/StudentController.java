package com.example.demo.RestAPI;

import com.example.demo.entity.Student;
import com.example.demo.exception.GlobalExceptionhandler;
import com.example.demo.exception.SinhVienException;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    public List<Student> danhSach;
    @PostConstruct
    public void createDanhSach() {
        danhSach = new ArrayList<>();
        danhSach.add(new Student(1,"binh",1));
        danhSach.add(new Student(2,"binh1",2));
        danhSach.add(new Student(3,"binh2",3));
        danhSach.add(new Student(4,"binh3",4));
    }
    @GetMapping("")
    public List<Student> danhSachSinhVien() {
        return danhSach;
    }
    @GetMapping("/{id}")
    public Student getDanhSachSinhVienById(@PathVariable int id) {
        Student result = null;
        for(Student student : danhSach) {
            if(student.getId() == id ) {
                return student;
            }
        }
        if(result == null) {
            throw new SinhVienException("khong tim thay id : "+id);
        }
        return null;
    }
    @GetMapping("danhSachSanhVien/{index}")
    public Student getDanhSachSinhVienByIndex(@PathVariable int index) {
        Student student = danhSach.get(index);
        return student;

    }


}
