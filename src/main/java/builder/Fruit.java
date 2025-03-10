package builder;

public class Fruit {
    private String type;
    private String color;
    private double weight;

    private Fruit(){}

    public static Builder Builder() {
        return new Builder();
    }

    public static final class Builder {
        private String type;
        private String color;
        private double weight;

        private Builder() {}

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder weight(double weight) {
            this.weight = weight;
            return this;
        }

        public Fruit build() {
            Fruit fruit = new Fruit();
            fruit.type = this.type;
            fruit.weight = this.weight;
            fruit.color = this.color;
            return fruit;
        }
    }
}

