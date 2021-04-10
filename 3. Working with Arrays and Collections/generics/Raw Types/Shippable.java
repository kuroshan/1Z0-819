public interface Shippable<T> {
    void ship(T t);
}

class Robot {}

class ShippableRobotCrate implements Shippable<Robot> {
    public void ship(Robot t) {}
}

class ShippableAbstractCrate<U> implements Shippable<U> {
    public void ship(U t) {}
}