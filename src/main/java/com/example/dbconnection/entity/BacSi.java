package com.example.dbconnection.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

    @Entity
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @Table(name = "bacsi")
    public class BacSi {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "id")
        private Integer id;
        @Column (name = "ma_bac_si")
        private String maBacSi;
        @Column  (name ="ho_ten")
        private String hoTen;
        @Column (name ="tuoi")
        private Integer tuoi;
        @Column (name ="so_dien_thoai")
        private String soDienThoai;
        @Column(name ="email")
        private String email;
        @Column (name ="chuyen_khoa")
        private String chuyenKhoa;
    }
