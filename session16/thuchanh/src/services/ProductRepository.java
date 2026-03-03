package src.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import src.interfaces.IRepository;
import src.models.Product;;

public class ProductRepository implements IRepository<Product> {
    private final List<Product> products = new ArrayList<>();
    private final Map<String, Product> map = new HashMap<>();

    @Override
    public boolean add(Product item) {
        if (map.containsKey(item.getId())) {
            return false;
        }
        products.add(item);
        map.put(item.getId(), item);
        return true;
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product findById(String id) {
        Product product = map.get(id);
        return product;
    }

    @Override
    public boolean removeById(String id) {
        if (!map.containsKey(id)) {
            return false;
        }
        Product product = map.get(id);
        products.remove(product);
        map.remove(id);
        return true;
    }
}