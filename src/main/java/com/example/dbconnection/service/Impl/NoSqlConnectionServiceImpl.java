//package com.example.dbconnection.service.Impl;
//
//import com.example.dbconnection.entity.NoSqlCredentialEntity;
//import com.example.dbconnection.entity.dto.req.NoSqlCredentialReq;
//import com.example.dbconnection.kafka.service.KafkaConsumerService;
//import com.example.dbconnection.refactor.utils.securityUtils.RsaUtils;
//import com.example.dbconnection.repository.NoSqlCredentialRepo;
//import com.example.dbconnection.service.NoSqlConnectionService;
//import com.mongodb.client.MongoClient;
//import com.mongodb.client.MongoClients;
//import jakarta.annotation.PostConstruct;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//@Slf4j
//public class NoSqlConnectionServiceImpl implements NoSqlConnectionService {
//    @Autowired
//    private KafkaConsumerService kafkaConsumerService;
//    @Autowired
//    private NoSqlCredentialRepo noSqlCredentialRepo;
//    @Autowired
//    private RsaUtils rsaUtils;
//
//    @Override
//    public NoSqlCredentialEntity addNoSqlCredential(NoSqlCredentialReq credentialReq) {
//        log.info("[addNoSqlCredential] with {}", credentialReq);
//        NoSqlCredentialEntity credentialEntity = null;
//        try {
//            credentialEntity = NoSqlCredentialEntity.builder()
//                    .username(credentialReq.getUsername())
//                    .password(credentialReq.getPassword())
//                    .database(credentialReq.getDatabase())
//                    .uri(credentialReq.getUri())
//                    .build();
//            noSqlCredentialRepo.save(credentialEntity);
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//
//        return credentialEntity;
//    }
//
//    @Override
//    public Boolean validateNoSqlCredential(NoSqlCredentialReq credentialReq) {
//        log.info("[validateNoSqlCredential] with input {}", credentialReq);
//
//        String formattedUri = String.format(credentialReq.getUri(), credentialReq.getUsername(), credentialReq.getPassword());
//
//        try (MongoClient mongoClient = MongoClients.create(formattedUri)) {
//
//            mongoClient.getDatabase(credentialReq.getDatabase()).listCollectionNames().first();
//            log.info("valid credential!");
//            addNoSqlCredential(credentialReq);
//            return true;
//
//        } catch (Exception e) {
//            log.error("[validateNoSqlCredential] error", e);
//            log.info("invalid credential!");
//            return false;
//        }
//    }
//
//
//}
