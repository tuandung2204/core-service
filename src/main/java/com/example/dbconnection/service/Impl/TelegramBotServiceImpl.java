//package com.example.dbconnection.service.Impl;
//
//import com.example.dbconnection.entity.TelegramBotEntity;
//import com.example.dbconnection.entity.dto.req.TelegramBotReq;
//import com.example.dbconnection.entity.dto.res.TelegramBotRes;
//import com.example.dbconnection.repository.TelegramBotRepo;
//import com.example.dbconnection.service.TelegramBotService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//@Service
//@Slf4j
//public class TelegramBotServiceImpl implements TelegramBotService {
//    private String telegramApiUrl = "https://api.telegram.org/bot";
//    @Autowired
//    TelegramBotRepo telegramBotRepo;
//
//    private final RestTemplate restTemplate = new RestTemplate();
//    @Override
//    public TelegramBotEntity addTelegramBot(TelegramBotReq telegramBot) {
//        log.info("[addTelegramBot] {}", telegramBot);
//        if (isBotCredentialsValid(telegramBot.getBotToken(),telegramBot.getBotUsername())) {
//            log.info("[addTelegramBot] {}", telegramBot);
//            TelegramBotEntity telegramBotEntity = TelegramBotEntity.builder()
//                    .botToken(telegramBot.getBotToken())
//                    .botUsername(telegramBot.getBotUsername())
//                    .build();
//            telegramBotRepo.save(telegramBotEntity);
//            return telegramBotEntity;
//        }
//       return null;
//    }
//
//    @Override
//    public TelegramBotRes getTelegramBot(TelegramBotReq telegramBot) {
//        log.info("[getTelegramBot] {}", telegramBot);
//        if (telegramBot == null) {
//            log.info("[getTelegramBot] is null");
//            return null;
//        }
//        TelegramBotEntity telegramBotEntity = telegramBotRepo.getBot(telegramBot.getBotUsername(),telegramBot.getBotToken());
//        TelegramBotRes telegramBotRes = new TelegramBotRes();
//        telegramBotRes.setBotToken(telegramBot.getBotToken());
//        telegramBotRes.setBotUsername(telegramBotEntity.getBotUsername());
//        return telegramBotRes;
//    }
//
//    public boolean isBotCredentialsValid(String botToken, String botUsername) {
//        try {
//            // Make a call to Telegram's 'getMe' API to check if the bot is valid
//            String url = telegramApiUrl + botToken + "/getMe";
//            ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
//            log.info("[isBotCredentialsValid] Telegram API response: {}", response.getBody());
//
//            if (response.getStatusCode().is2xxSuccessful()) {
//                // Check if the bot's username matches the provided bot username
//                String responseBody = response.getBody();
//                // Parse the response to extract bot username
//                // Assuming the response has a field "result" with the bot's username
//                // You can use a JSON parser (like Jackson) to parse it
//                // This is a basic check
//                if (responseBody.contains(botUsername)) {
//                    return true;
//                } else {
//                    log.error("[isBotCredentialsValid] Bot username mismatch");
//                }
//            } else {
//                log.error("[isBotCredentialsValid] Invalid response from Telegram API: {}", response.getStatusCode());
//            }
//        } catch (Exception e) {
//            log.error("[isBotCredentialsValid] Error while checking bot credentials: {}", e.getMessage());
//        }
//        return false;
//    }
//}
