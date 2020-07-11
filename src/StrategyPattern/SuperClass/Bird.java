package StrategyPattern.SuperClass;

import StrategyPattern.SuperClass.Interfaces.Flyable;
import StrategyPattern.SuperClass.Interfaces.Movable;

public abstract class Bird {

    /**
     * Name all the methods and provide implementation for methods that are only
     * going to be consistent with all the child classes to this super class.
     */

    /**
     * for all the changing methods, like below, I have made them as interface and then given an "HAS-A" relationship here.
     * "Always code to interface, not implementation"
     */
//    public abstract void fly();
//    public abstract void move();
//    public abstract void eat();


    /**
     * The below instances of the interface has their implementation in many classes.
     * So, the classes extending this super class, only have to just use the right implementation.
      */

    public Flyable flyableInterface;
    public Movable movableInterface;
    public abstract void displayNameOfTheBird();


    public void performFly(){
        flyableInterface.fly();
    }

    public void performMove(){
        movableInterface.moveToAnotherPlace();
    }

    /**
     * The below method is constant, non changing. So the child classes can simply use this method.
     */

    public void makeASound(){
        System.out.println("Printed from the super class's nonChangingMethod - Make a sound");
    }

    /** Getters and Setters
     *
     */


    public void setFlyableInterface(Flyable flyableInterface) {
        this.flyableInterface = flyableInterface;
    }


    public void setMovableInterface(Movable movableInterface) {
        this.movableInterface = movableInterface;
    }

}
