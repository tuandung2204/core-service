package com.example.dbconnection.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class SpannerEntity {
    @Id
    private Long id;

    @Column(name = "project_id")
    private String projectId;

    @Column(name = "instance_id")
    private String instanceId;

    @Column(name = "database_id")
    private String databaseId;
}
