package factorymethod.after;


public enum CarName {
    SONATA("Sonata"),
    GENESIS("Genesis"),
    GRANDEUR("Grandeur");

    public String name;

    CarName(String name) {
        this.name = name;
    }
}
