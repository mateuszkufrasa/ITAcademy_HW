package product_analyzer.domain;

public class Laptop extends Product implements CanDescribe, WithPrice {
    public boolean hasSsd;

    public Laptop(String name) {
        super(name);
    }
}
