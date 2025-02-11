package com.example.dbconnection.repository;

import com.example.dbconnection.entity.BenhNhan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BenhNhanRepository extends JpaRepository<BenhNhan, Integer> {
    BenhNhan findByMaBenhNhan(String maBenhNhan);
}
