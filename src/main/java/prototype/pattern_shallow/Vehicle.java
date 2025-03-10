package prototype.pattern_shallow;

public interface Vehicle {
    String alert();
    String getEngineType();
    void setEngineType(String engineType);
    Vehicle clone();
}
