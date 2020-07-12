package DecoratorPattern;

public class ColdCoffee extends Beverages {


    @Override
    int cost() {
        return 120;
    }

    @Override
    String description() {
        return "Cold Coffee ";
    }
}
