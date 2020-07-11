package DecoratorPattern.PizzaExample;

public class makePizza {

    public static void main(String[] args) {

        Pizza thickCrust = new ThickCrust();
        thickCrust = new Cheese(thickCrust);
        thickCrust = new Paneer(thickCrust);
        System.out.println(thickCrust.description() + " " + thickCrust.cost());

    }
}
