package product_analyzer.domain;

public class Product {
    public String name; // laptop
    public Double price; // 1000
    public Double weight; // 2.0
    public WeightType weightType; // KG

    public Product() {
    }

    public void describe() {
        System.out.println(name);
    }
}

class Laptop extends Product {
    public Boolean isIntelInside;

    public Laptop() {
    }
}

class Phone extends Product {
    public String brand; // apple

    public Phone() {
    }
}

class MyApp {
    public static void main(String[] args) {
        Product product1 = new Product(); // instance1
        product1.name = "laptop";
        product1.describe();

        Product product2 = new Product(); // instance2
        product2.name = "phone";
        product2.describe();

        Laptop laptop = new Laptop();
        laptop.name = "lenovo x1";
        laptop.describe();
    }
}