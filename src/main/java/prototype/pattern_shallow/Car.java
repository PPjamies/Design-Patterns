package prototype.pattern_shallow;

public class Car implements Vehicle {
    private int topSpeed;
    private Engine engine;

    public Car(Car car) {
        this.topSpeed = car.topSpeed;
        this.engine = car.engine; // shallow copy
    }

    @Override
    public void alert() {
        System.out.println("BEEP!");
    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }
}
