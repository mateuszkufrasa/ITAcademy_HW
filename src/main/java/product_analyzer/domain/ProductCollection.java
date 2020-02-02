package product_analyzer.domain;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection<T extends Product> {
    private final List<T> products = new ArrayList<>();

    public boolean add(T product) {
        return this.products.add(product);
    }

    public boolean remove(T product) {
        return this.products.remove(product);
    }
}
