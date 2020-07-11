package StrategyPattern.Implementation.MovableImplementation;

import StrategyPattern.SuperClass.Interfaces.Movable;

public class MoveByFeet implements Movable {


    @Override
    public void moveToAnotherPlace() {
        System.out.println("Move to another place by feet. Cant Fly");
    }
}
