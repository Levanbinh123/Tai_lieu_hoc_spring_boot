package com.example.studentAPI.DAO;

import com.example.studentAPI.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryRestResource
public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findByName(String name);
    List<Student> findByEmail(String email);
    @Query("SELECT s FROM Student s where s.email<>?1")
    List<Student> findByEmail1(String email);
}
