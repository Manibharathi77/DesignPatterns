package DecoratorPattern;

public class Coffee extends Beverages {

    @Override
    int cost() {
        return 90;
    }

    @Override
    String description() {
        return "Coffee ";
    }
}
