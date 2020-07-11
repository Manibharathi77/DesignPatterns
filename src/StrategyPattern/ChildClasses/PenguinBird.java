package StrategyPattern.ChildClasses;

import StrategyPattern.Implementation.FlyableImplementation.NoFly;
import StrategyPattern.Implementation.MovableImplementation.MoveByFeet;
import StrategyPattern.SuperClass.Bird;

public class PenguinBird extends Bird {

    public PenguinBird(){
        flyableInterface = new NoFly();
        movableInterface = new MoveByFeet();
        }

    @Override
    public void displayNameOfTheBird() {
        System.out.println("The name of the bird is Penguin");
    }
}

