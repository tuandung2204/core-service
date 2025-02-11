//package com.example.dbconnection.service.Impl;
//
//import com.example.dbconnection.entity.dto.req.CredentialReq;
//import com.example.dbconnection.entity.dto.res.GeneralResponse;
//import com.example.dbconnection.enums.CodeResponseEnum;
//import com.example.dbconnection.kafka.service.KafkaProducerService;
//import com.example.dbconnection.service.SendCredentialsToKafkaService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.concurrent.ExecutionException;
//import java.util.concurrent.TimeoutException;
//
//@Service
//@Slf4j
//public class SendCredentialsToKafkaImpl implements SendCredentialsToKafkaService {
//    @Autowired
//    private KafkaProducerService kafkaProducerService;
//    @Override
//    public GeneralResponse sendCredentialsToNoSqlToSql(CredentialReq credentialReq) throws ExecutionException, InterruptedException, TimeoutException {
//
//        if (credentialReq == null) {
//            log.error("Credential request is null");
//            return new GeneralResponse(CodeResponseEnum.FORBIDDEN.code, "Credential request is empty","request is null",null);
//        }
//
//        kafkaProducerService.sendNoSqlToSqlCredentials(credentialReq);
//
//        return new GeneralResponse(CodeResponseEnum.SUCCESS.code, "","successfully sent",null);
//
//    }
//
//    @Override
//    public GeneralResponse sendCredentialsToSqlToNoSql(CredentialReq credentialReq) throws ExecutionException, InterruptedException, TimeoutException {
//        if (credentialReq == null) {
//            log.error("Credential request is null");
//            return new GeneralResponse(CodeResponseEnum.FORBIDDEN.code, "Credential request is empty","request is null",null);
//        }
//
//        kafkaProducerService.sendSqlToNoSqlCredentials(credentialReq);
//
//        return new GeneralResponse(CodeResponseEnum.SUCCESS.code, "","successfully sent",null);
//    }
//}
