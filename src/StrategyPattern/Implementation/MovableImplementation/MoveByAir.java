package StrategyPattern.Implementation.MovableImplementation;

import StrategyPattern.SuperClass.Interfaces.Movable;

public class MoveByAir implements Movable {

    @Override
    public void moveToAnotherPlace() {
        System.out.println("move to another place by flying. Can walk too.");
    }
}
