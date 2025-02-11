package com.example.dbconnection.service;

import com.example.dbconnection.entity.TelegramBotEntity;
import com.example.dbconnection.entity.dto.req.TelegramBotReq;
import com.example.dbconnection.entity.dto.res.TelegramBotRes;

public interface TelegramBotService {
    TelegramBotEntity addTelegramBot(TelegramBotReq telegramBot);

    TelegramBotRes getTelegramBot(TelegramBotReq telegramBot);
}
