package factorymethod.after;

public class Car {

    protected String type;
    protected String owner;

    public Car(String type, String owner) {
        this.type = type;
        this.owner = owner;
    }

    public String toString() {
        return owner + "님의 차는 " + type + "입니다.";
    }
}
