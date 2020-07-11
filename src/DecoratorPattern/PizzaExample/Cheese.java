package DecoratorPattern.PizzaExample;

public class Cheese extends AddOnsItems {

    Pizza pizza;

    public Cheese(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    String description() {
        return this.pizza.description() + " with cheese";
    }

    @Override
    int cost() {
        return this.pizza.cost() + 30;
    }
}
