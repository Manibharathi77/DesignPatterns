package DecoratorPattern.PizzaExample;

public class Paneer extends AddOnsItems {

    Pizza pizza;

    public Paneer(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    String description() {
        return this.pizza.description() + " with paneer";
    }

    @Override
    int cost() {
        return this.pizza.cost() + 45;
    }
}
