package com.example.dbconnection.service;

import com.example.dbconnection.entity.dto.req.SqlCredentialReq;

public interface SpannerConnectionService {
    Boolean validateSqlCredential(SqlCredentialReq req);
}
