package decorator;

public class CoffeeTest {

    public static void main(String[] args) {
        Coffee etiopiaCoffee = new EtiopiaCoffee();
        etiopiaCoffee.brewing();
        System.out.println();

        Coffee whippingCreamLatte = new WhippingCream(new Latte(new EtiopiaCoffee()));
        whippingCreamLatte.brewing();
        System.out.println();
    }
}
