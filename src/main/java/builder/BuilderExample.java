package builder;

public class BuilderExample {
    public static void main(String[] args) {

        Fruit apple = Fruit.Builder()
                .type("apple")
                .color("green")
                .weight(1.2)
                .build();
    }
}
