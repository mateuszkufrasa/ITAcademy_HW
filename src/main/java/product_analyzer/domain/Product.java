package product_analyzer.domain;

interface CanDescribe {
    String describe();
}

interface WithPrice {
    Double getPrice();
}

interface Label {
    String toLabel();
}

public class Product implements CanDescribe, WithPrice, Label { //todo: implement Label
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

class Laptop extends Product implements CanDescribe, WithPrice {
    public boolean hasSsd;

    public Laptop(String name) {
        super(name);
    }
}

class App {
    public static void main(String[] args) {
        Thread secondThread = new AnotherEngine();
        secondThread.setName("engine-2");
        secondThread.start();
        Thread thirdThread = new AnotherEngine();
        thirdThread.setName("engine-3");
        thirdThread.start();

        waitFor5Sec();

        //todo: create a Label variable and assign new instance of Product, then use this variable to print to a console
        Product laptop = new Product("ASUS1");
        laptop.price = 1000.0;
        laptop.weight = 2.2;
        laptop.weightType = WeightType.KG;
        Label label1 = laptop;

        System.out.println(laptop.toLabel());
    }

    static class AnotherEngine extends Thread {

        @Override
        public void run() {
            AnotherEngine.printHello();
        }

        public static void printHello() {
            for (int i = 0; i < 10; i++) {
                System.out.println("> Hello #" + i);
                waitFor1Sec();
            }
        }
    }

    private static void waitFor1Sec() {
        try {
            Thread.sleep(1_000);
        } catch (InterruptedException e) {
        }
    }
    private static void waitFor5Sec() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
    }



}


class LaptopCollection {
    private Laptop laptop1;
    private Laptop laptop2;
    private Laptop laptop3;

    public void set(int index, Laptop laptop) {
        if (index == 1) {
            this.laptop1 = laptop;
        } else if (index == 2) {
            this.laptop2 = laptop;
        } else if (index == 3) {
            this.laptop3 = laptop;
        } else {
            throw new RuntimeException("not supported index [" + index + "]");
        }
    }

    public Laptop get(int index) {
        if (index == 1) {
            return this.laptop1;
        } else if (index == 2) {
            return this.laptop2;
        } else if (index == 3) {
            return this.laptop3;
        } else {
            throw new RuntimeException("not supported index [" + index + "]");
        }
    }

    @Override
    public String toString() {
        return "LaptopCollection{" +
                "laptop1=" + laptop1.name +
                ", laptop2=" + laptop2.name +
                ", laptop3=" + laptop3.name +
                '}';
    }
}
//
//class PhoneCollection {
//    private Phone phone1;
//    private Phone phone2;
//    private Phone phone3;
//
//    public void set(int index, Phone phone) {
//        if (index == 1) {
//            this.phone1 = phone;
//        } else if (index == 2) {
//            this.phone2 = phone;
//        } else if (index == 3) {
//            this.phone3 = phone;
//        } else {
//            throw new RuntimeException("not supported index [" + index + "]");
//        }
//    }
//
//    public Phone get(int index) {
//        if (index == 1) {
//            return this.phone1;
//        } else if (index == 2) {
//            return this.phone2;
//        } else if (index == 3) {
//            return this.phone3;
//        } else {
//            throw new RuntimeException("not supported index [" + index + "]");
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "PhoneCollection{" +
//                "phone1=" + phone1.name +
//                ", phone2=" + phone1.name +
//                ", phone3=" + phone1.name +
//                '}';
//    }
//}
//
////todo: create a generic version of PhoneCollection and LaptopCollection
//
//class MyApp2 {
//    public static void main(String[] args) {
//        //todo: use that generic class here
//
//        LaptopCollection laptops = new LaptopCollection();
//        laptops.set(1, new Laptop("Laptop #1"));
//        laptops.set(2, new Laptop("Laptop #2"));
//        laptops.set(3, new Laptop("Laptop #3"));
//        System.out.println(laptops);
//
//        PhoneCollection phones = new PhoneCollection();
//        phones.set(1, new Phone("Laptop #1"));
//        phones.set(2, new Phone("Laptop #2"));
//        phones.set(3, new Phone("Laptop #3"));
//        System.out.println(phones);
//
//    }
//}