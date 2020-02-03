package product_analyzer.domain;


public class Product {
    public String name; // laptop
    public Double price; // 1000
    public Double weight; // 2.0
    public WeightType weightType; // KG

    public Product() {
    }
}

class MyApp {
    public static void main(String[] args) {
        //todo: use that generic class here
        ProductCollection <Phone> phonesGeneric = new ProductCollection<>();
        phonesGeneric.set(1, new Phone("Phone1"));
        phonesGeneric.set(2, new Phone("Phone2"));
        phonesGeneric.set(3, new Phone("Phone3"));
        System.out.println(phonesGeneric);

        ProductCollection <Laptop> laptopsGeneric = new ProductCollection<>();
        laptopsGeneric.set(1, new Laptop("Laptop1"));
        laptopsGeneric.set(2, new Laptop("Laptop2"));
        laptopsGeneric.set(3, new Laptop("Laptop3"));
        System.out.println(laptopsGeneric);

        LaptopCollection laptops = new LaptopCollection();
        laptops.set(1, new Laptop("Laptop #1"));
        laptops.set(2, new Laptop("Laptop #2"));
        laptops.set(3, new Laptop("Laptop #3"));
        System.out.println(laptops);

        PhoneCollection phones = new PhoneCollection();
        phones.set(1, new Phone("Laptop #1"));
        phones.set(2, new Phone("Laptop #2"));
        phones.set(3, new Phone("Laptop #3"));
        System.out.println(phones);
    }
}