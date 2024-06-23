package Strategies;

import Models.Level;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(Level level) {

        BotPlayingStrategy botPlayingStrategy = new EasyBotPlayingStrategy();
        switch (level) {
            case EASY -> botPlayingStrategy = new EasyBotPlayingStrategy();
            case MEDIUM -> throw new IllegalArgumentException();
        }
        return botPlayingStrategy;
    }
}
