package com.example.mymrcbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.bots.TelegramWebhookBot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;

@SpringBootApplication
public class MymrcbotApplication {

    public static void main(String[] args) {
        SpringApplication.run(MymrcbotApplication.class, args);
    }

}
