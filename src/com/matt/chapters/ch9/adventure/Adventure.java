package com.matt.chapters.ch9.adventure;

public class Adventure {
    public static void t(CanFight x) {
        x.fight();
    }

    public static void u(CanFly x) {
        x.fly();
    }

    public static void v(CanSwim x) {
        x.swim();
    }

    public static void w(ActionCharacter x) {
        x.fight();
    }

    public static void s(CanClimb x) {
        x.climb();
    }
}

interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

interface CanClimb {
    void climb();
}

abstract class ActionCharacter {
    public void fight() {
    }
}

class Hero extends ActionCharacter implements CanFight, CanFly, CanSwim, CanClimb {

    @Override
    public void swim() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void climb() {

    }
}