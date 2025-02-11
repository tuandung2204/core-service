//package com.example.dbconnection.kafka.service;
//
//import com.example.dbconnection.entity.dto.req.SqlCredentialReq;
//import com.example.dbconnection.entity.dto.res.GeneralResponse;
//import com.example.dbconnection.entity.dto.res.MigrationStatusRes;
//import com.example.dbconnection.exception.ParseEventException;
//import com.example.dbconnection.extra.utils.JsonUtils;
//import com.example.dbconnection.service.MigrationStatusService;
//import lombok.extern.slf4j.Slf4j;
//import org.checkerframework.checker.units.qual.A;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.kafka.support.Acknowledgment;
//import org.springframework.kafka.support.KafkaHeaders;
//import org.springframework.messaging.handler.annotation.Header;
//import org.springframework.stereotype.Service;
//
//@Service
//@Slf4j
//public class KafkaConsumerService {
//    @Autowired
//    private MigrationStatusService migrationStatusService;
//
//    @KafkaListener(topics = "${kafka.subscribe.migration.nosql.to.sql.status}",
//            groupId = "db-connection-service-group",
//            containerFactory = "kafkaListenerContainerFactory")
//    public void subscribeEventMigrationNoSqlToSqlStatus(String event, Acknowledgment acknowledgment,
//                                              @Header(KafkaHeaders.RECEIVED_TOPIC) String topic,
//                                              @Header(KafkaHeaders.RECEIVED_PARTITION) int partition,
//                                              @Header(KafkaHeaders.OFFSET) int offsets) {
//        try {
//            log.info("[subscribeEventMigrationStatus] [partition: {}, offset: {} | topic: {}] Received message: {}",
//                    partition, offsets, topic, event);
//
//            MigrationStatusRes resDto = JsonUtils.unJson(event, MigrationStatusRes.class);
//            log.info("ResDto: {}", resDto);
//
//            // Manually acknowledge the message after processing
//            GeneralResponse generalResponse = migrationStatusService.getMigrationStatus(resDto);
//            acknowledgment.acknowledge();
//
//        } catch (Exception e) {
//            log.error("[subscribeEventMigrationStatus] Error processing message: {}", e.getMessage(), e);
//            acknowledgment.acknowledge();  // Acknowledge even if an error occurs
//        }
//    }
//    @KafkaListener(topics = "${kafka.subscribe.migration.sql.to.nosql.status}",
//            groupId = "db-connection-service-group",
//            containerFactory = "kafkaListenerContainerFactory")
//    public void subscribeEventMigrationSqlToNoSqlStatus(String event, Acknowledgment acknowledgment,
//                                              @Header(KafkaHeaders.RECEIVED_TOPIC) String topic,
//                                              @Header(KafkaHeaders.RECEIVED_PARTITION) int partition,
//                                              @Header(KafkaHeaders.OFFSET) int offsets) {
//        try {
//            log.info("[subscribeEventMigrationStatus] [partition: {}, offset: {} | topic: {}] Received message: {}",
//                    partition, offsets, topic, event);
//
//            MigrationStatusRes resDto = JsonUtils.unJson(event, MigrationStatusRes.class);
//            log.info("ResDto: {}", resDto);
//
//            // Manually acknowledge the message after processing
//            GeneralResponse generalResponse = migrationStatusService.getMigrationStatus(resDto);
//            acknowledgment.acknowledge();
//
//        } catch (Exception e) {
//            log.error("[subscribeEventMigrationStatus] Error processing message: {}", e.getMessage(), e);
//            acknowledgment.acknowledge();  // Acknowledge even if an error occurs
//        }
//    }
//}
//
//
