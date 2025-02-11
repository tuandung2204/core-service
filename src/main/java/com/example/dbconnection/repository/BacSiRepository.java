package com.example.dbconnection.repository;

import com.example.dbconnection.entity.BacSi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BacSiRepository extends JpaRepository<BacSi,Integer> {
    BacSi findByMaBacSi(String maBacSi);
}