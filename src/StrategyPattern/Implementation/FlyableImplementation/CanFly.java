package StrategyPattern.Implementation.FlyableImplementation;

import StrategyPattern.SuperClass.Interfaces.Flyable;

public class CanFly implements Flyable {

    @Override
    public void fly() {
       System.out.println("Can fly. Really high!!");
    }
}
