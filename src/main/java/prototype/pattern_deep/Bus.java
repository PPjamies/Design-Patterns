package prototype.pattern_deep;

public class Bus extends Vehicle {
    private int doors;

    public Bus(Bus bus) {
        super(bus);
        this.doors = bus.doors;
    }

    @Override
    public void alert() {
        System.out.println("HONK!");
    }

    @Override
    public Bus clone() {
        return new Bus(this);
    }
}
