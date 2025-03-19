package com.github.anicmv.service;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.Update;

import java.util.function.BiConsumer;

/**
 * @author anicmv
 * @date 2024/7/23 20:50
 * @description telegram bot 命令
 */
@FunctionalInterface
public interface BotCommand extends BiConsumer<TelegramBot, Update> {
}
