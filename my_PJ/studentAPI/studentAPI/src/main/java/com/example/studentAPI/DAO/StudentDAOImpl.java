//package com.example.studentAPI.DAO;
//
//import com.example.studentAPI.Entity.Student;
//import jakarta.persistence.EntityManager;
//import jakarta.transaction.Transactional;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//@Repository
//@Transactional
//public class StudentDAOImpl implements StudentDAO {
//    private EntityManager entityManager;
//    public StudentDAOImpl(EntityManager entityManager) {
//        this.entityManager = entityManager;
//    }
//    @Override
//    public List<Student> getStudents() {
//        String jpql = "SELECT s FROM Student s ";
//        return entityManager.createQuery(jpql, Student.class).getResultList();
//    }
//
//    @Override
//    public Student getStudent(int id) {
//        return entityManager.find(Student.class, id);
//    }
//
//    @Override
//    public Student addStudent(Student student) {
//         entityManager.persist(student);
//         return student;
//    }
//
//    @Override
//    public Student updateStudent(Student student) {
//        entityManager.merge(student);
//        entityManager.flush();
//        return student;
//    }
//
//    @Override
//    public void deleteStudent(int id) {
//        entityManager.remove(entityManager.find(Student.class, id));
//
//
//    }
//}
