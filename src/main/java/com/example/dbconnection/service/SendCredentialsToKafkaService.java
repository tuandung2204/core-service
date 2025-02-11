package com.example.dbconnection.service;

import com.example.dbconnection.entity.dto.req.CredentialReq;
import com.example.dbconnection.entity.dto.res.GeneralResponse;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public interface SendCredentialsToKafkaService {
    public GeneralResponse sendCredentialsToNoSqlToSql(CredentialReq credentialReq) throws ExecutionException, InterruptedException, TimeoutException;

    public GeneralResponse sendCredentialsToSqlToNoSql(CredentialReq credentialReq) throws ExecutionException, InterruptedException, TimeoutException;
}
