//package com.example.dbconnection.kafka.service;
//
//
//import com.example.dbconnection.entity.dto.req.CredentialReq;
//import com.example.dbconnection.extra.helper.ConfigValue;
//import com.example.dbconnection.extra.utils.JsonUtils;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.kafka.support.SendResult;
//import org.springframework.stereotype.Service;
//
//import java.util.concurrent.CompletableFuture;
//import java.util.concurrent.ExecutionException;
//import java.util.concurrent.TimeUnit;
//import java.util.concurrent.TimeoutException;
//
//@Service
//@Slf4j
//public class KafkaProducerService {
//
//    @Autowired
//    private KafkaTemplate<String, String> kafkaTemplate;
//    @Autowired
//    private ConfigValue configValue;
//
//    public void sendNoSqlToSqlCredentials(CredentialReq credentialReq) throws InterruptedException, ExecutionException, TimeoutException {
//
//        log.info("[sendNoSqlToSqlCredentials] send credential request {}", credentialReq);
//
//        String topic = configValue.getNoSqlCredentialTopicName();
//        String data = JsonUtils.marshalJsonAsPrettyString(credentialReq);
//        sendMsgDefault(topic, data, "[sendCredentials]");
//    }
//
//    public void sendSqlToNoSqlCredentials(CredentialReq credentialReq) throws InterruptedException, ExecutionException, TimeoutException {
//
//        log.info("[sendNoSqlToSqlCredentials] send credential request {}", credentialReq);
//
//        String topic = configValue.getSqlCredentialTopicName();
//        String data = JsonUtils.marshalJsonAsPrettyString(credentialReq);
//        sendMsgDefault(topic, data, "[sendCredentials]");
//    }
//
//    private void sendMsgDefault(String topic, String data, String functionName)
//            throws InterruptedException, ExecutionException, TimeoutException {
//        CompletableFuture<SendResult<String, String>> future = this.kafkaTemplate.send(topic, data);
//        try {
//            future.whenComplete((result, ex) -> {
//                if (ex == null) {
//                    log.info(functionName + " [On success] Publish event send: " + data + " ***** topic: " + topic + " ***** with offset: " + result.getRecordMetadata().offset());
//                } else {
//                    log.error(functionName + " [On failed] Unable to publish event send inner: " + data, ex);
//                }
//            });
//        } catch (Exception ex) {
//            log.error(functionName + " [On failed] Unable to publish event send outer: " + data, ex);
//
//        }
//
//        SendResult<String, String> result = future.get(60, TimeUnit.SECONDS);
//        if (result == null)
//            log.error("send request failed");
//    }
//
//}
