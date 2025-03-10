package prototype.pattern_deep;

public class Car extends Vehicle {
    private int topSpeed;

    public Car(Car car) {
        super(car);
        this.topSpeed = car.topSpeed;
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
