package com.example.dbconnection.repository;

import com.example.dbconnection.entity.TelegramBotEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TelegramBotRepo extends JpaRepository<TelegramBotEntity,Long> {
        @Query("SELECT t FROM TelegramBotEntity t WHERE t.botUsername LIKE :botUsername AND t.botToken LIKE :botToken")
        TelegramBotEntity getBot(@Param("botUsername") String botUsername, @Param("botToken") String botToken);

}
