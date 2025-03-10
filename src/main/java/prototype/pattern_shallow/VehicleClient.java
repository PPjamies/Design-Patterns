package prototype.pattern_shallow;

public class VehicleClient {
    private Vehicle vehicle;

    public VehicleClient(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle.clone();
    }
}