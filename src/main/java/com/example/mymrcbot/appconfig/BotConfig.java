package com.example.mymrcbot.appconfig;

import com.example.mymrcbot.MyMrcBot;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "telegrambot")
public class BotConfig {

    private String webHook;
    private String botName;
    private String botToken;

    @Bean
    public MyMrcBot myMrcBot(){
        MyMrcBot bot = new MyMrcBot();
        bot.setBotName(botName);
        bot.setBotToken(botToken);
        bot.setWebHook(webHook);
        return bot;
    }

}
