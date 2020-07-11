package StrategyPattern.Implementation.FlyableImplementation;

import StrategyPattern.SuperClass.Interfaces.Flyable;

public class NoFly implements Flyable {

    @Override
    public void fly() {
        System.out.println("Cannot fly. Just flaps the wings...");
    }
}

