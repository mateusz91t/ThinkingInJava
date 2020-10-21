package com.matt.chapters.ch9.games;

public class HeadsOrTailsFactory implements GameFactory {
    @Override
    public void play() {
        System.out.println(this.getClass().getSimpleName() + ".play()");
    }

    @Override
    public Game getGame() {
        return new HeadsOrTails();
    }
}

class HeadsOrTails implements Game{

    @Override
    public void play() {
        System.out.println(this.getClass().getSimpleName() + ".play()");
    }
}