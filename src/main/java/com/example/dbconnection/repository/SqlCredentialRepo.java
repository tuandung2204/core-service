package com.example.dbconnection.repository;

import com.example.dbconnection.entity.SqlCredentialEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SqlCredentialRepo extends JpaRepository<SqlCredentialEntity, Long> {
}
