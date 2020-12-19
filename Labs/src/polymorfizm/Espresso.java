package polymorfizm;

public class Espresso implements Coffee {
    @Override
    public void getEnergy() {
        System.out.println("Espresso gives you the Force");
    }
}
