package com.example.vanbinh.Rest;

import com.example.vanbinh.entity.SinhVien;
import com.example.vanbinh.entity1.Student;
import com.example.vanbinh.error.ErrorResponse;
import com.example.vanbinh.exception.SinhVienException;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/sinhvien")
public class SinhVienController {
    public List<Student> getSinhVien;
    @PostConstruct
    public void createSinhVien() {
        getSinhVien = new ArrayList<>();
        getSinhVien.add(new Student(1,"binh",11));
        getSinhVien.add(new Student(2,"binh1",111));
        getSinhVien.add(new Student(3,"binh2",112));
    }
    @GetMapping()
    public List<Student> getSinhVien() {return getSinhVien;}
    @GetMapping("/{id1}")
    public Student getSinhVien( @PathVariable int id1) {

        for(Student student : getSinhVien) {
            if(student.getId() == id1) {
                return student;
            }
            else {
                throw new SinhVienException("loi khong tim thay");
            }
        }
        return null;
    }


}
