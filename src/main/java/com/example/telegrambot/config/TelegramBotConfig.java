package com.example.telegrambot.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Getter
@PropertySource("application.properties")
public class TelegramBotConfig {
//    @Value("${telegram.bot.token}")
    private String token = "7596121938:AAE80AsvwgpaAI8b0ARJQYEkON1vG5oSFvE";

//    @Value("${telegram.bot.username}")
    private String name = "DeveloperTestingTgBot";
}
