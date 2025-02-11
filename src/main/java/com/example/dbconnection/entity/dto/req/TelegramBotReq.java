package com.example.dbconnection.entity.dto.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import lombok.Data;

@Data
public class TelegramBotReq {
    @JsonProperty("bot_name")
    private String botUsername;
    @JsonProperty("bot_token")
    private String botToken;
}
