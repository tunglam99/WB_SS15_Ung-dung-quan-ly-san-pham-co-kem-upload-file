package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService{

    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"iphoneX",100,"ngon","apple","67057453_2275740549191051_3067038486830776320_o.jpg"));
        products.put(2,new Product(2,"SamSungS10",100,"ngon","samsung","67058300_2275741365857636_8674445001331048448_o.jpg"));
        products.put(3,new Product(3,"Experia",50,"ngon","Sony","67058751_2275740619191044_5989563032232001536_o.jpg"));
        products.put(4,new Product(4,"iphone6",10,"ngon","apple","67128031_2275740705857702_5882823152077111296_o.jpg"));
    }

    @Override
    public List<Product> findAll() {
        return new  ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);

    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> productList = findAll();
        List<Product> resultSearch = new ArrayList<>();
        for (Product product: productList) {
            if (product.getName().contains(name)){
                resultSearch.add(product);
            }
        }
        return resultSearch;
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }
}
