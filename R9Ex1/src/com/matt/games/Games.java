package com.matt.games;

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