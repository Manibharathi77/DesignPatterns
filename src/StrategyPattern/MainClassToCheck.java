package StrategyPattern;

import StrategyPattern.ChildClasses.DummyBird;
import StrategyPattern.ChildClasses.EagleBird;
import StrategyPattern.ChildClasses.PenguinBird;
import StrategyPattern.Implementation.FlyableImplementation.NoFly;
import StrategyPattern.Implementation.MovableImplementation.MoveByFeet;
import StrategyPattern.SuperClass.Bird;

public class MainClassToCheck {

    /**
     * Description for the Strategy Pattern.
     *
     * For any case, where multiple classes are going to extend a particular super class,
     * Step1 -> Find the constant and non-constant methods.
     * Step2 -> Make the non-constant methods as Interface.
     * Step3 -> Provide implementation for those interface using the multiple classes. Based on our need.
     * Step4 -> Now use those methods while creating the child class appropriately.
     *
     * If not using strategy pattern.
     *
     * Need to implement the flyable and movable to each and every child classes.
     * Now, no matter how many classes are created, we can simply reuse the implemented methods.
     * Example: All the birds can fly will extend the canFly class.
     */

    static void testBird(Bird bird){
        bird.performFly();
        bird.performMove();
        bird.displayNameOfTheBird();
        bird.makeASound();
    }

    public static void main(String[] args) {

//        PenguinBird penguinBird = new PenguinBird();
////        penguinBird.setFlyableInterface(new NoFly());
////        penguinBird.setMovableInterface(new MoveByFeet());
//        penguinBird.performFly();
//        penguinBird.performMove();
//        penguinBird.makeASound();
//        penguinBird.displayNameOfTheBird();
//
//        System.out.println();
//
//        Bird eagleBird = new EagleBird();
//        eagleBird.performFly();
//        eagleBird.performMove();
//        eagleBird.makeASound();
//        eagleBird.displayNameOfTheBird();

        Bird dummyBird = new DummyBird();

        dummyBird.performFly();
        dummyBird.performMove();
        dummyBird.makeASound();
        dummyBird.displayNameOfTheBird();

    }
}
