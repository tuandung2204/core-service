package com.example.dbconnection.entity.dto.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CredentialReq {
    @JsonProperty("username")
    private String username;
    @JsonProperty("password")
    private String password;
    @JsonProperty("uri")
    private String uri;
    @JsonProperty("collection")
    private String collection;


    @JsonProperty("database")
    private String database;
    @JsonProperty("sqlUsername")
    private String sqlUsername;
    @JsonProperty("sqlPassword")
    private String sqlPassword;
    @JsonProperty("url")
    private String url;

}
