package DecoratorPattern;

public abstract class Beverages {

    /**
     * A super class which can be extended by multiple sub classes.
     * Those sub classes, can be associated with multiple sub classes.
     * Then choose decorator pattern.
     * +++++
     * Name the methods that will be part of all the classes.
     */

    abstract int cost();
    abstract String description();

}
