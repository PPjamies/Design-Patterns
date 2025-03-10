package prototype.pattern_shallow;

public class Car implements Vehicle {
    private int topSpeed;
    private Engine engine;

    public Car(int topSpeed, Engine engine) {
        this.topSpeed = topSpeed;
        this.engine = engine;
    }

    public Car(Car car) {
        this.topSpeed = car.topSpeed;
        this.engine = car.engine; // shallow copy
    }

    public String getEngineType() {
        return this.engine.type;
    }

    public void setEngineType(String type) {
        this.engine.type = type;
    }

    @Override
    public String alert() {
        return "BEEP!";
    }

    @Override
    public Vehicle clone() {
        return new Car(this);
    }
}
