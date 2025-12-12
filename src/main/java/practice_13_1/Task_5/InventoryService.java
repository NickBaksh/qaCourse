package practice_13_1.Task_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InventoryService {
    private final Map<String, List<Product>> warehouse = new ConcurrentHashMap<>();

    private boolean isInventoryOpen = true;

    public void setInventoryOpen(boolean open) {
        this.isInventoryOpen = open;
    }

    public synchronized void addProduct(Product product) {
        if (!isInventoryOpen) {
            throw new RuntimeException("Склад закрыт!");
        }

        warehouse.computeIfAbsent(product.category, r -> new ArrayList<>()).add(product);
    }

    public Product getProductByCategory(String category) {
        List<Product> productList = warehouse.get(category);
        if (productList == null || productList.isEmpty()) {
            throw new OutOfStockException("Товар закончился на складе!");
        }

        return productList.removeFirst();
    }

    public List<Product> filterByCategory(String category) {
        return warehouse.values().stream()
                .flatMap(List::stream)
                .filter(product -> product.getCategory().equalsIgnoreCase(category))
                .toList();
    }

    public List<Product> filterByPrice(double minPrice, double maxPrice) {
        return warehouse.values().stream()
                .flatMap(List::stream)
                .filter(product -> product.getPrice() >= minPrice && product.getPrice() <= maxPrice)
                .toList();
    }

    public Map<String, List<Product>> getAll() {
        return warehouse;
    }
}
