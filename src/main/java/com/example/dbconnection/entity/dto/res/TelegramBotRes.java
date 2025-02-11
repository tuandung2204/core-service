package com.example.dbconnection.entity.dto.res;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TelegramBotRes {
    @JsonProperty("bot_name")
    private String botUsername;
    @JsonProperty("bot_token")
    private String botToken;
}
