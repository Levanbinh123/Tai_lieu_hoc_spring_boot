package com.example.vanbinh.Dao.impl;

import com.example.vanbinh.Dao.SinhVienDAO;
import com.example.vanbinh.entity.SinhVien;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class SinhVienDAOImpl implements SinhVienDAO {
    @Autowired
    private EntityManager entityManager;
    @Override
    public void save(SinhVien sinhVien) {
        entityManager.persist(sinhVien);

    }

    @Override
    public SinhVien findById(int id) {
        return entityManager.find(SinhVien.class, id);
    }

    @Override
    public List<SinhVien> findSinhVien() {
        String hql = "Select s from SinhVien s";
        return entityManager.createQuery(hql, SinhVien.class).getResultList();
    }

    @Override
    public List<SinhVien> getByName(String first_name) {
        String jbql="Select s from SinhVien s where s.first_name=:first_name ";
        return entityManager.createQuery(jbql,SinhVien.class).setParameter("first_name",first_name).getResultList();
    }

    @Override
    public int update(SinhVien sinhVien) {
        entityManager.merge(sinhVien);
        return 1;

    }

    @Override
    public int updateSinhVienByTen(String first_name) {
        String jpql="UPDATE SinhVien s SET s.first_name=:first_name ";
        Query query=entityManager.createQuery(jpql,SinhVien.class);
        query.setParameter("first_name",first_name);
       return query.executeUpdate();

    }

    @Override
    public void delete(SinhVien sinhVien) {
        entityManager.remove(sinhVien);

    }

    @Override
    public void deleteByTen(String ten) {
        String jpql="DELETE from SinhVien s where s.=:ten";
    }

}
