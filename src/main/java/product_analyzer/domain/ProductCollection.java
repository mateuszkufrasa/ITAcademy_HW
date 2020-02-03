package product_analyzer.domain;

//todo: create a generic version of PhoneCollection and LaptopCollection
public class ProductCollection <T extends Product> {
    private T product1;
    private T product2;
    private T product3;

    public void set(int index, T product) {
        if (index == 1) {
            this.product1 = product;
        } else if (index == 2) {
            this.product2 = product;
        } else if (index == 3) {
            this.product3 = product;
        } else {
            throw new RuntimeException("not supported index [" + index + "]");
        }
    }
    public T get(int index) {
        if (index == 1) {
            return this.product1;
        } else if (index == 2) {
            return this.product2;
        } else if (index == 3) {
            return this.product3;
        } else {
            throw new RuntimeException("not supported index [" + index + "]");
        }
    }

    @Override
    public String toString() {
        //I have no idea what methods should be used in order to construct
        // appropriate name of a collection (i.e LaptopCollection or PhoneCollection)
        return "\n***CREATED USING GENERIC CLASS***\n" + product1.getClass().getSimpleName() + "Collection {" +
                product1.getClass().getSimpleName() + "#1 = " + product1.name +
                ", " + product2.getClass().getSimpleName() + "#2 = " + product2.name +
                ", " + product3.getClass().getSimpleName() + "#3 = " + product3.name + '}';
    }
}
