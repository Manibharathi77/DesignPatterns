package StrategyPattern.ChildClasses;

import StrategyPattern.Implementation.FlyableImplementation.CanFly;
import StrategyPattern.Implementation.MovableImplementation.MoveByAir;
import StrategyPattern.SuperClass.Bird;

public class EagleBird extends Bird {

    public EagleBird(){
        flyableInterface = new CanFly();
        movableInterface = new MoveByAir();
    }

    @Override
    public void displayNameOfTheBird() {
        System.out.println("The name of the bird is Eagle");
    }
}
