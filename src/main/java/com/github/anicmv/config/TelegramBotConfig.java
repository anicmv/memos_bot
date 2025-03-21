package com.github.anicmv.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author anicmv
 * @date 2024/7/23 14:30
 * @description telegram 配置
 */
@Getter
@Setter
@Configuration
@ConfigurationProperties(prefix = "bot")
public class TelegramBotConfig {
    private String token;
}