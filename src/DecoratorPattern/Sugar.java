package DecoratorPattern;

public class Sugar extends AddOns {

    Beverages beverages;

    public Sugar(Beverages beverages){
        this.beverages = beverages;
    }

    @Override
    int cost() {
        return this.beverages.cost() + 10;
    }

    @Override
    String  description() {
        return (this.beverages.description() + "with "+ "Sugar ");
    }
}
