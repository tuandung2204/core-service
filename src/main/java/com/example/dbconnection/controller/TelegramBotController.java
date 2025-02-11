//package com.example.dbconnection.controller;
//
//import com.example.dbconnection.entity.TelegramBotEntity;
//import com.example.dbconnection.entity.dto.req.TelegramBotReq;
//import com.example.dbconnection.entity.dto.res.TelegramBotRes;
//import com.example.dbconnection.service.TelegramBotService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/bot")
//public class TelegramBotController {
//    @Autowired
//    private TelegramBotService telegramBotService;
//
//    @PostMapping("/add")
//    public TelegramBotEntity addBot(@RequestBody TelegramBotReq telegramBotEntity) {
//        return telegramBotService.addTelegramBot(telegramBotEntity);
//
//    }
//
//    @GetMapping("/get")
//    public TelegramBotRes getBot(@RequestParam TelegramBotReq telegramBotEntity) {
//        return telegramBotService.getTelegramBot(telegramBotEntity);
//    }
//}
