package decorator;

public class Decorator extends Coffee{

    Coffee coffee;

    Decorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void brewing() {
        coffee.brewing();
    }
}
