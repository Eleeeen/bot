package com.example.mymrcbot.controller;

import com.example.mymrcbot.MyMrcBot;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;

@RestController
public class WebHookController {
    private final MyMrcBot bot;

    public WebHookController (MyMrcBot bot){
        this.bot = bot;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public BotApiMethod<?> onUpdateReceived(@RequestBody Update update){
        return bot.onWebhookUpdateReceived(update);
    }
}

