//package com.example.dbconnection.controller;
//
//
//import com.example.dbconnection.entity.NoSqlCredentialEntity;
//import com.example.dbconnection.entity.SqlCredentialEntity;
//import com.example.dbconnection.entity.dto.req.NoSqlCredentialReq;
//import com.example.dbconnection.entity.dto.req.SqlCredentialReq;
//import com.example.dbconnection.entity.dto.res.GeneralResponse;
//import com.example.dbconnection.entity.dto.res.MigrationStatusRes;
//import com.example.dbconnection.service.MigrationStatusService;
//import com.example.dbconnection.service.NoSqlConnectionService;
//import com.example.dbconnection.service.SqlConnectionService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RequestMapping("database")
//@Slf4j
//@RestController
//public class DatabaseConnectionController {
//    @Autowired
//    private NoSqlConnectionService noSqlConnectionService;
//    @Autowired
//    private SqlConnectionService sqlConnectionService;
//    @Autowired
//    private MigrationStatusService migrationStatusService;
//
//    @PostMapping("noSql/add")
//    public ResponseEntity<NoSqlCredentialEntity> addNoSqlCredential(@RequestBody NoSqlCredentialReq credentialReq) {
//        NoSqlCredentialEntity newCredential = noSqlConnectionService.addNoSqlCredential(credentialReq);
//        return new ResponseEntity<>(newCredential, HttpStatus.CREATED);
//    }
//
//    @PostMapping("noSql/validate")
//    public Boolean validateNoSqlCredential(@RequestBody NoSqlCredentialReq credentialReq) {
//        Boolean isValid = noSqlConnectionService.validateNoSqlCredential(credentialReq);
//        return isValid;
//    }
//
//
//    @PostMapping("sql/add")
//    public ResponseEntity<SqlCredentialEntity> addSqlCredential(@RequestBody SqlCredentialReq credentialReq) {
//        SqlCredentialEntity newCredential = sqlConnectionService.addSqlCredential(credentialReq);
//        return new ResponseEntity<>(newCredential, HttpStatus.CREATED);
//    }
//
//    @PostMapping("sql/validate")
//    public Boolean validateSqlCredential(@RequestBody SqlCredentialReq credentialReq) {
//        Boolean isValid = sqlConnectionService.validateSqlCredential(credentialReq);
//        return isValid;
//    }
//
//    @PostMapping("/status")
//    public GeneralResponse getStatus(@RequestBody MigrationStatusRes migrationStatusRes) {
//        return migrationStatusService.getMigrationStatus(migrationStatusRes);
//    }
//
//
//
//}
