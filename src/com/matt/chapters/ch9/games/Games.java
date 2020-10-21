package com.matt.chapters.ch9.games;

interface Game {
    void play();
}

interface GameFactory extends Game {
    Game getGame();
}

public class Games {
    public static void playGame(GameFactory factory) {
        Game g = factory.getGame();
        g.play();
    }
}