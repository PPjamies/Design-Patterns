package prototype.pattern_shallow;

public class Engine {
    String type;

    public Engine(String type) {
        this.type = type;
    }

    public Engine(Engine engine) {
        this.type = engine.type;
    }
}
