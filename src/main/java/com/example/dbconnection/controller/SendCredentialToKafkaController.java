//package com.example.dbconnection.controller;
//
//import com.example.dbconnection.entity.dto.req.CredentialReq;
//import com.example.dbconnection.entity.dto.res.GeneralResponse;
//import com.example.dbconnection.service.SendCredentialsToKafkaService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.concurrent.ExecutionException;
//import java.util.concurrent.TimeoutException;
//
//@RestController
//@RequestMapping("/kafka")
//public class SendCredentialToKafkaController {
//
//    @Autowired
//    private SendCredentialsToKafkaService sendCredentialsToKafkaService;
//
//
//    @PostMapping("/noSqltoSql")
//    public GeneralResponse sendCredentialsToNoSqlToSql(@RequestBody CredentialReq credentialReq) throws ExecutionException, InterruptedException, TimeoutException {
//
//        return sendCredentialsToKafkaService.sendCredentialsToNoSqlToSql(credentialReq);
//    }
//
//    @PostMapping("/sqltoNoSql")
//    public GeneralResponse sendCredentialsToSqlToNoSql(@RequestBody CredentialReq credentialReq) throws ExecutionException, InterruptedException, TimeoutException {
//
//        return sendCredentialsToKafkaService.sendCredentialsToSqlToNoSql(credentialReq);
//    }
//
//}
