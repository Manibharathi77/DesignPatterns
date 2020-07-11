package DecoratorPattern.PizzaExample;

public class ThickCrust extends Pizza {

    @Override
    String description() {
        return "Pizza with ThickCrust";
    }

    @Override
    int cost() {
        return 100;
    }
}
