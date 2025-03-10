package prototype.pattern_shallow;

public class Bus implements Vehicle {
    private int doors;
    private Engine engine;

    public Bus(Bus bus) {
        this.doors = bus.doors;
        this.engine = new Engine(bus.engine); // deep copy
    }

    @Override
    public void alert(){
        System.out.println("HONK!");
    }

    @Override
    public Bus clone() {
        return new Bus(this); // uses deep copy constructor
    }
}
