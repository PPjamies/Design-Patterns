package prototype.pattern_shallow;

public class PrototypeExample {
    public static void main(String[] args) {

        // shallow copy
        Vehicle car = new Car(10, new Engine("engine-a"));
        System.out.println("Engine type: " + car.getEngineType());

        VehicleClient client = new VehicleClient(car);
        System.out.println("Created Vehicle client: car");

        Vehicle car2 = client.getVehicle();
        System.out.println("Cloned car into car2.");

        assert(car.getEngineType().equals("engine-a"));
        assert(car2.getEngineType().equals("engine-a"));
        System.out.println("Both cars have the same engine: engine-a");

        car2.setEngineType("engine-b");
        System.out.println("Updated car2 engine to engine-b");

        assert(car.getEngineType().equals("engine-b"));
        assert(car2.getEngineType().equals("engine-b"));

        System.out.println("Both cars have the same engine: engine-b because of shallow copying");

        // Deep copy
        Vehicle bus = new Bus(10, new Engine("engine-a"));
        System.out.println("Engine type: " + bus.getEngineType());

        client = new VehicleClient(bus);
        System.out.println("Created Vehicle client: bus");

        Vehicle bus2 = client.getVehicle();
        System.out.println("Cloned bus into bus2");

        assert(bus.getEngineType().equals("engine-a"));
        assert(bus2.getEngineType().equals("engine-a"));
        System.out.println("Both busses have the same engine: engine-a");

        car2.setEngineType("engine-b");
        System.out.println("Updated car2 engine to engine-b");

        assert(car.getEngineType().equals("engine-a"));
        assert(car2.getEngineType().equals("engine-b"));

        System.out.println("Both cars have different engines because of deep copying");
    }
}
