package com.example.dbconnection.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tele_credential")
public class TelegramBotEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = false, nullable = false, name = "bot_name")
    private String botUsername;
    @Column(unique = false, nullable = false, name = "bot_token")
    private String botToken;


}
