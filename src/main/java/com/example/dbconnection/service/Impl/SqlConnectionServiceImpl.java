//package com.example.dbconnection.service.Impl;
//
//
//import com.example.dbconnection.entity.SqlCredentialEntity;
//import com.example.dbconnection.entity.dto.req.SqlCredentialReq;
//import com.example.dbconnection.refactor.utils.securityUtils.RsaUtils;
//import com.example.dbconnection.repository.SqlCredentialRepo;
//import com.example.dbconnection.service.SqlConnectionService;
//import jakarta.annotation.PostConstruct;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//@Service
//@Slf4j
//public class SqlConnectionServiceImpl implements SqlConnectionService {
//
//    @Autowired
//    private SqlCredentialRepo credentialRepo;
//    @Autowired
//    private RsaUtils rsaUtils;
//
//    @Override
//    public SqlCredentialEntity addSqlCredential(SqlCredentialReq req) {
//        log.info("[addSqlCredential] with {}", req);
//        SqlCredentialEntity entity = null;
//        try {
//            entity = SqlCredentialEntity.builder()
//                    .jdbcUrl(req.getUrl())
//                    .username(req.getUsername())
//                    .password(req.getPassword())
//                    .build();
//            credentialRepo.save(entity);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//
//        return entity;
//    }
//
//    @Override
//    public Boolean validateSqlCredential(SqlCredentialReq req) {
//        log.info("[validateSqlCredential] with input {}", req);
//        try {
//            String jdbcUrl = req.getUrl();
//            try (Connection connection = DriverManager.getConnection(jdbcUrl, req.getUsername(), req.getPassword())) {
//                log.info("[validateSqlCredential] connection established");
//                // Connection successful if no exception is thrown
//                addSqlCredential(req);
//                return true;
//            }
//
//        } catch (SQLException e) {
//            // Connection failed if exception is thrown
//            log.error("[validateSqlCredential] error", e);
//            log.info("invalid credential!");
//            return false;
//        }
//    }
//
//
//}
