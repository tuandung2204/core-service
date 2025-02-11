package com.example.dbconnection.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="datlich")
public class DatLich {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "ma_phieu_dat_lich")
    private String maPhieuDatLich;
    @Column(name = "ngay_hen")
    private Date ngayHen;
    @Column(name = "gio_hen")
    private Time gioHen;
    @Column(name = "bac_si")
    private String bacSi;
    @Column(name ="so_phong")
    private String soPhong;

}
