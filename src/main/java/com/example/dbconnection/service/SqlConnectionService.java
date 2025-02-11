package com.example.dbconnection.service;

import com.example.dbconnection.entity.SqlCredentialEntity;
import com.example.dbconnection.entity.dto.req.SqlCredentialReq;

public interface SqlConnectionService {
    SqlCredentialEntity addSqlCredential(SqlCredentialReq req);
    Boolean validateSqlCredential(SqlCredentialReq req);
}
