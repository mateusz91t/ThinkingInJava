package com.matt;

import com.matt.games.DiceFactory;
import com.matt.games.Games;
import com.matt.games.HeadsOrTailsFactory;

public class Main19Games {
    public static void main(String[] args){
        Games.playGame(new DiceFactory());
        Games.playGame(new HeadsOrTailsFactory());
    }
}
