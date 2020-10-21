package com.matt.chapters.ch9;

import com.matt.chapters.ch9.games.DiceFactory;
import com.matt.chapters.ch9.games.Games;
import com.matt.chapters.ch9.games.HeadsOrTailsFactory;

public class Main19Games {
    public static void main(String[] args){
        Games.playGame(new DiceFactory());
        Games.playGame(new HeadsOrTailsFactory());
    }
}
