package com.matt.games;

class Dice implements Game {

    @Override
    public void play() {
        System.out.println(this.getClass().getSimpleName() + ".play()");
    }
}

public class DiceFactory implements GameFactory {

    @Override
    public void play() {
        System.out.println(this.getClass().getSimpleName() + ".play()");
    }

    @Override
    public Game getGame() {
        return new Dice();
    }
}