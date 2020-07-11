package DecoratorPattern.PizzaExample;

public class ThinCrust extends Pizza {

    @Override
    String description() {
        return "Pizza with Thin Crust";
    }

    @Override
    int cost() {
        return 90;
    }
}
