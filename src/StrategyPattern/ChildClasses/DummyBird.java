package StrategyPattern.ChildClasses;

import StrategyPattern.Implementation.FlyableImplementation.ImpossibleToFly;
import StrategyPattern.Implementation.MovableImplementation.MoveByFeet;
import StrategyPattern.SuperClass.Bird;

public class DummyBird extends Bird {

    public DummyBird(){
        flyableInterface = new ImpossibleToFly();
        movableInterface = new MoveByFeet();
    }

    @Override
    public void displayNameOfTheBird() {
        System.out.println("This is a dummy bird.");
    }

    @Override
    public void makeASound(){
        System.out.println("This is a dummy bird. Doesnt make any sound");
    }

}
