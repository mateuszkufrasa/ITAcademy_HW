package product_analyzer.domain;

public class Product implements CanDescribe, WithPrice, Label {
    public String name; // laptop
    public Double price; // 1000
    public Double weight; // 2.0
    public WeightType weightType; // KG

    public Product(String name) {
        this.name = name;
    }

    @Override
    public String describe() {
        return "Product with name [" + name + "]";
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public String toLabel() {
        return this.name + "   " + this.price + "   " + this.weight + "   " + this.weightType;
    }
}

