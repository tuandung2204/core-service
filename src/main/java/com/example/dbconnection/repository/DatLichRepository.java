package com.example.dbconnection.repository;

import com.example.dbconnection.entity.DatLich;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DatLichRepository extends JpaRepository<DatLich, Integer> {
    DatLich findByMaPhieuDatLich(String maPhieuDatLich);
}
