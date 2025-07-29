package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="sinhvien")
public class SinhVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="masv")
    private int id;
    @Column(name="tensv")
    private String ten;
    @Column(name="email")
    private String email;
    public SinhVien() {
    }

    public SinhVien(String ten, String email) {
        this.ten = ten;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "id=" + id +
                ", ten='" + ten + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
