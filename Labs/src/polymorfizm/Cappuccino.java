package polymorfizm;

public class Cappuccino implements Coffee {
    @Override
    public void getEnergy() {
        System.out.println("Cappuccino gives you the Force");
    }
}
