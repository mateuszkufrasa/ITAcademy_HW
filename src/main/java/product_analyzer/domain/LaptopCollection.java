package product_analyzer.domain;

public class LaptopCollection {
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
