package com.example.demo.Dao;

import com.example.demo.entity.SinhVien;

import java.util.List;

public interface SinhVienDao {
    public void save(SinhVien sinhVien);


    public SinhVien getById(int id);


    public List<SinhVien> getAll();


    public List<SinhVien> getByTen(String ten);

    public SinhVien update(SinhVien sinhVien);

    public int updateAllTen(String ten);

    public void delete(Long id);


    public void deleteByTen(String ten);
}
