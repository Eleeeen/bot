package polymorfizm;

public class CoffeeMachine {
    public Coffee makeCoffee(CoffeeType coffeeType) {
        switch (coffeeType) {
            case LATTE: {
                return new Latte();
            }
            case CAPPUCCINO: {
                return new Cappuccino();
            }
            case ESPRESSO: {
                return new Espresso();
            }
            default: {
                System.out.println("Invalid coffee type");
                return null;
            }
        }
    }
}
