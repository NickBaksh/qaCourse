package practice_13_1.Task_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class InventoryServiceTest {

    private InventoryService inventoryService;

    @BeforeEach
    void setUp() {
        inventoryService = new InventoryService();
    }

    @Test
    @DisplayName("Проверка добавления продукта в сервис")
    public void shouldReturnAddedProduct() {
        Product phone = new Product("Phone", 1500.5, "Gadget");
        inventoryService.addProduct(phone);

        Assertions.assertEquals(phone, inventoryService.getAll().get("Gadget").get(0));
        Assertions.assertEquals(1, inventoryService.getAll().get("Gadget").size());
    }

    @Test
    @DisplayName("Проверка первого продукта по категории")
    public void shouldReturnProductByCategory() {
        Product phone = new Product("Phone", 1500.5, "Gadget");
        inventoryService.addProduct(phone);

        Product p = inventoryService.getProductByCategory("Gadget");

        Assertions.assertTrue(p.equals(phone));
        Assertions.assertTrue(inventoryService.getAll().get("Gadget").isEmpty());
    }

    @Test
    @DisplayName("Исключение при отсутствии товара")
    public void shouldReturnException() {

        Assertions.assertThrows(OutOfStockException.class, () -> inventoryService.getProductByCategory("Gadget"));
    }

    @Test
    @DisplayName("Фильтрация по категории")
    public void shouldReturnFilteredByCategory() {
        Product phone = new Product("Phone", 1500.5, "Gadget");
        inventoryService.addProduct(phone);

        List<Product> gadgets = inventoryService.filterByCategory("Gadget");

        Assertions.assertTrue(gadgets.contains(phone));
        Assertions.assertEquals(1, gadgets.size());
    }

    @Test
    @DisplayName("Фильтрация по цене")
    public void shouldReturnFilteredByPrice() {
        Product phone = new Product("Phone", 1500.5, "Gadget");
        Product laptop = new Product("Laptop", 700, "Gadget");
        Product pc = new Product("PC", 2400, "Gadget");
        inventoryService.addProduct(phone);
        inventoryService.addProduct(laptop);
        inventoryService.addProduct(pc);

        List<Product> filteredByPrice = inventoryService.filterByPrice(699, 800);
        Assertions.assertEquals(1, filteredByPrice.size());
        Assertions.assertTrue(filteredByPrice.contains(laptop));
    }
}
