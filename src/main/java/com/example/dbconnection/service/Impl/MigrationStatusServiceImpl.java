//package com.example.dbconnection.service.Impl;
//
//import com.example.dbconnection.entity.dto.res.GeneralResponse;
//import com.example.dbconnection.entity.dto.res.MigrationStatusRes;
//import com.example.dbconnection.service.MigrationStatusService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//@Service
//@Slf4j
//public class MigrationStatusServiceImpl implements MigrationStatusService {
//    @Override
//    public GeneralResponse getMigrationStatus(MigrationStatusRes migrationStatusRes) {
//        log.info("getMigrationStatus {}", migrationStatusRes);
//        if (migrationStatusRes.getMessageStatus().contains("done")) {
//            return new GeneralResponse(200, "", "successfully migrate with " + migrationStatusRes.getTotalMigratedDocuments(), migrationStatusRes.getMessageStatus());
//        } else
//            return new GeneralResponse(500, "", "migrate failed " + migrationStatusRes.getMessageStatus(), migrationStatusRes.getMessageStatus());
//
//    }
//}
