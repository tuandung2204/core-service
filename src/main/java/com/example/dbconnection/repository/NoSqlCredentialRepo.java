package com.example.dbconnection.repository;


import com.example.dbconnection.entity.NoSqlCredentialEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface NoSqlCredentialRepo extends JpaRepository<NoSqlCredentialEntity, Long> {
}
