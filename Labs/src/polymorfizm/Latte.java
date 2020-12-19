package polymorfizm;

public class Latte implements Coffee {
    @Override
    public void getEnergy() {
        System.out.println("Latte gives you the Force");
    }
}
