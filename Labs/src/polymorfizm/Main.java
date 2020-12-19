package polymorfizm;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        Coffee coffee = coffeeMachine.makeCoffee(CoffeeType.CAPPUCCINO);
        //Coffee coffee1 = coffeeMachine.makeCoffee(CoffeeType.LATTE);
        //Coffee coffee2 = coffeeMachine.makeCoffee(CoffeeType.ESPRESSO);

        CoffeeLover coffeeLover = new CoffeeLover();

        coffeeLover.drinkCoffee(coffee);
        //coffeeLover.drinkCoffee(coffee1);
        //coffeeLover.drinkCoffee(coffee2);
    }
}
