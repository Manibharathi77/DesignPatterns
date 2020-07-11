package StrategyPattern.Implementation.FlyableImplementation;

import StrategyPattern.SuperClass.Interfaces.Flyable;

public class ImpossibleToFly implements Flyable {

    @Override
    public void fly() {
       System.out.println("Cannot fly. Dummy bird!!");
    }
}
