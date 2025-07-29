package com.example.vanbinh.Dao;

import com.example.vanbinh.entity.SinhVien;

import java.util.List;

public interface SinhVienDAO {
    public  void save(SinhVien sinhVien);
    public SinhVien findById(int id);
    public List<SinhVien> findSinhVien();
    public List<SinhVien> getByName(String name);
    public int update(SinhVien sinhVien);
    public int updateSinhVienByTen(String ten);
    public void delete(SinhVien sinhVien);
    public void deleteByTen(String ten);

}
