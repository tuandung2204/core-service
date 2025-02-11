package com.example.dbconnection.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "benhnhan")
public class BenhNhan {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "ma_benh_nhan")
    private String maBenhNhan;
    @Column(name = "ho_ten")
    private String hoTen;
    @Column(name = "tuoi")
    private Integer tuoi;
    @Column(name = "dia_chi")
    private String diaChi;
    @Column(name = "so_dien_thoai")
    private String sdt;
    @Column(name = "email")
    private String email;
}
