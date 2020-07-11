package DecoratorPattern;

public class Cream extends AddOns {

    Beverages beverages;

    public Cream(Beverages beverages){
        this.beverages = beverages;
    }

    @Override
    int cost() {
        return this.beverages.cost() + 20;
    }

    @Override
    String description() {
        return (this.beverages.description() +"with "+ "Cream ");
    }
}
