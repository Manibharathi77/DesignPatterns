package StrategyPattern.Implementation.FlyableImplementation;

import StrategyPattern.SuperClass.Interfaces.Flyable;

public class FlyForShortTime implements Flyable {

    @Override
    public void fly() {
        System.out.println("Fly for short time only..");
    }
}
