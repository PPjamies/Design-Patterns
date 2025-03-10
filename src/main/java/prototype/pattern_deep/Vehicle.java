package prototype.pattern_deep;

public abstract class Vehicle {
    private String brand;
    private String model;

    public Vehicle(Vehicle vehicle) {
        this.brand = vehicle.brand;
        this.model = vehicle.model;
    }

    public abstract void alert();

    public abstract Vehicle clone();
}
