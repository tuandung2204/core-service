package com.example.dbconnection.service;

import com.example.dbconnection.entity.NoSqlCredentialEntity;
import com.example.dbconnection.entity.dto.req.NoSqlCredentialReq;

public interface NoSqlConnectionService {
   NoSqlCredentialEntity addNoSqlCredential(NoSqlCredentialReq credentialReq);

   Boolean validateNoSqlCredential(NoSqlCredentialReq credentialReq);
}
