package com.example.dbconnection.entity.dto.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class NoSqlCredentialReq {
    @JsonProperty("username")
    private String username;
    @JsonProperty("password")
    private String password;
    @JsonProperty("uri")
    private String uri;
    @JsonProperty("database")
    private String database;
}
