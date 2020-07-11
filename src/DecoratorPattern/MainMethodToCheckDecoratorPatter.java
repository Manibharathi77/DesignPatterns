package DecoratorPattern;

public class MainMethodToCheckDecoratorPatter {

    /**
     * Only the main beverages can be instantiated independently.
     * Rest all add on must have at least one beverage to add upon.
     * Similar example: Gun will all additional gadgets,
     * Or humans with additional cloths and accessories,
     * or Mobile with varying features and specifications.
     */

    /**
     *  Gist:: Whenever you are creating a class, that can operate on its own. Then fine.
     *  But if that class will have additional class, contributing or added upon, then use the decorator patter.
     * Adding adjectives to the noun.
     */
    public static void main(String[] args) {

        Beverages coffee = new Coffee();
        coffee = new Sugar(coffee);
        coffee = new Sugar(coffee);
        System.out.println(coffee.description() + " " + coffee.cost());

        Beverages coldCoffee = new ColdCoffee();
        Cream cream = new Cream(coldCoffee);
        coldCoffee = new Cream(cream);
        coldCoffee = new Sugar(coldCoffee);
        System.out.println(coldCoffee.description() + " " + coldCoffee.cost());
    }
}
