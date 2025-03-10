package prototype.pattern_shallow;

public class Bus implements Vehicle {
    private int doors;
    private Engine engine;

    public Bus(int doors, Engine engine) {
        this.doors = doors;
        this.engine = engine;
    }

    public Bus(Bus bus) {
        this.doors = bus.doors;
        this.engine = new Engine(bus.engine); // deep copy
    }

    public String getEngineType() {
        return this.engine.type;
    }

    public void setEngineType(String engineType) {
        this.engine.type = engineType;
    }

    @Override
    public String alert(){
        return "HONK!";
    }

    @Override
    public Bus clone() {
        return new Bus(this);
    }
}
