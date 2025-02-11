package com.example.dbconnection.entity.dto.res;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MigrationStatusRes {
    @JsonProperty("status")
    private String messageStatus;
    @JsonProperty("total_migrated_documents")
    private Long totalMigratedDocuments;
}
