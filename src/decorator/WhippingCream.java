package decorator;

public class WhippingCream extends Decorator{

    WhippingCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.print("Adding Whipping Cream.");
    }
}
