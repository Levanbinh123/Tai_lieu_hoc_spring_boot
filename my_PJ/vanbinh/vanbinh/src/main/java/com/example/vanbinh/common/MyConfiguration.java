package com.example.vanbinh.common;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.vanbinh.Dao.SinhVienDAO;
import com.example.vanbinh.Dao.impl.SinhVienDAOImpl;
import com.example.vanbinh.entity.SinhVien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.Scanner;

@Configuration
public class MyConfiguration {
    @Autowired
    private SinhVienDAOImpl sinhVienDAO;
    @Bean
    public CommandLineRunner runner() {
        return args -> {

            while(true){

                printMenu();
                Scanner scanner = new Scanner(System.in);
                int input = scanner.nextInt();
                if(input == 1){
                    themSinhVien();
                }else if(input == 2){
                    timSinhVien();
                }
                else if(input == 3){
                    layTatCaSinhVien();
                }
                else if(input == 4){

                    laySinhVienByFirstName();
                }
                else if(input == 5){

                    updateById();
                }
                else if(input == 6){

                    updateByName();
                }
                else if(input == 7){

                    deleteSinhVienById();
                }

            }

        };
    }

    private void deleteSinhVienById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap maSinhVien    :");
        Integer id=scanner.nextInt();
        SinhVien sinhVien = sinhVienDAO.findById(id);
        sinhVienDAO.delete(sinhVien);
        System.out.println("sinhVien deleted");

    }

    private int updateByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ten    :");
        String firstName=scanner.nextLine();
        int rows=sinhVienDAO.updateSinhVienByTen(firstName);
        return rows;
    }

    private void updateById() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ma sinh vien    :");
        int id=scanner.nextInt();
        SinhVien sinhVien=sinhVienDAO.findById(id);
        if(sinhVien != null){
            System.out.println("nhap email    :");
            String email=scanner.next();
            sinhVien.setEmail(email);
            sinhVienDAO.update(sinhVien);
        }

    }

    private void laySinhVienByFirstName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ten :");
        String firstName = scanner.nextLine();
        List<SinhVien> sinhViens=sinhVienDAO.getByName(firstName);
        if(sinhViens.size()<0){
            System.out.println("not found ");

        }else {
            sinhViens.forEach(sinhVien -> {
                System.out.println(sinhVien);
            });
        }
    }


    private void layTatCaSinhVien() {
        List<SinhVien> sinhViens=sinhVienDAO.findSinhVien();
        sinhViens.forEach(sinhVien -> {
            System.out.println(sinhVien);
        });
    }

    private void timSinhVien() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap id");
        Integer id = scanner.nextInt();
        System.out.println(sinhVienDAO.findById(id));
    }

    public void themSinhVien(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap ho dem");
        String hodem = scanner.next();
        System.out.println("nhap ten");
        String ten = scanner.next();
        System.out.println("nhap ho email");
        String email = scanner.next();
        SinhVien sinhVien = new SinhVien(hodem, ten, email);
        sinhVienDAO.save(sinhVien);
    }
    public void printMenu(){
        System.out.println("1.  them Sinh Vien+\n"+
                "2. tim sinh Vien\n"+
                "3.lay tat ca sinh vien\n"+
                "4.lay tat ca sinh vien bang ten\n"+
                "5.cap nhat by name\n"+
                "6.cap nhat\n "+
                "7. xoa sinh vien");
    }
}
