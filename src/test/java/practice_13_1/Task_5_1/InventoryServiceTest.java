package practice_13_1.Task_5_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import practice_13_1.Task_5.InventoryService;
import practice_13_1.Task_5.OutOfStockException;
import practice_13_1.Task_5.Product;

import java.util.List;

public class InventoryServiceTest {

    private InventoryService inventoryService;

    @BeforeEach
    void setUp() {
        inventoryService = new InventoryService();
    }


    //Проверка добавления товара с включенным флагом isInventoryOpen
    //Проверка исключения при добавлении товара с выключенным флагом isInventoryOpen
    //Проверка получения первого товара по категории
    //Проверка исключения при попытке получить закончившийся товар
    //Проверка фильтрации по категории
    //Проверка фильтрации по стоимости

    @Test
    @DisplayName("Проверка добавления товара с включенным флагом isInventoryOpen")
    public void shouldAddNewProduct() {
        Product product = new Product("Iphone", 1000, "Gadget");

        inventoryService.setInventoryOpen(true);
        inventoryService.addProduct(product);

        Assertions.assertEquals(1, inventoryService.getAll().size());
        Assertions.assertEquals(product, inventoryService.getAll().get("Gadget").get(0));
    }

    @Test
    @DisplayName("Проверка исключения при добавлении товара с выключенным флагом isInventoryOpen")
    public void shouldReturnExceptionForClosedWarehouse() {
        Product phone = new Product("Iphone", 1000, "Gadget");

        inventoryService.setInventoryOpen(false);
        Assertions.assertThrows(RuntimeException.class, () -> inventoryService.addProduct(phone));
        Assertions.assertEquals(0, inventoryService.getAll().size());
    }

    @Test
    @DisplayName("Проверка получения первого продукта по категории")
    public void shouldReturnFirstProductByCategory() {
        Product phone = new Product("Iphone", 1000, "Gadget");
        Product laptop = new Product("MacBook", 2000, "Gadget");

        inventoryService.addProduct(phone);
        inventoryService.addProduct(laptop);

        //Проверяем, что гаджеты добавлены и сохранены в порядке добавления
        Assertions.assertTrue(inventoryService.getAll().get("Gadget").contains(phone));
        Assertions.assertTrue(inventoryService.getAll().get("Gadget").contains(laptop));
        Assertions.assertEquals(phone, inventoryService.getAll().get("Gadget").get(0));
        Assertions.assertEquals(laptop, inventoryService.getAll().get("Gadget").get(1));

        Product firstGadget = inventoryService.getProductByCategory("Gadget");

        //Метод getProductByCategory() забирает первый продукт по категории, поэтому остается 1 гаджет
        Assertions.assertEquals(1, inventoryService.getAll().get("Gadget").size());

        Assertions.assertEquals(phone, firstGadget);
    }

    @Test
    @DisplayName("Проверка исключения OutOfStockException при выборе товара в категории без товаров")
    public void shouldReturnExceptionForOutOfStockProductByCategory() {
        Assertions.assertThrows(OutOfStockException.class, () -> inventoryService.getProductByCategory("Gadget"));
    }

    @Test
    @DisplayName("Проверка фильтра по категории товара")
    public void shouldReturnProductsByCategory() {
        Product phone = new Product("Iphone", 1000, "Gadget");
        Product car = new Product("Tesla", 10000, "Car");

        inventoryService.addProduct(phone);
        inventoryService.addProduct(car);

        List<Product> productsByCategory = inventoryService.filterByCategory("Car");
        Assertions.assertEquals(1, productsByCategory.size());
        Assertions.assertTrue(productsByCategory.contains(car));

        Assertions.assertEquals(0, inventoryService.filterByCategory("Lamps").size());
    }

    @Test
    @DisplayName("Проверка фильтра по стоимости товара")
    public void shouldReturnFilteredProductsByPrice() {
        Product phone = new Product("Iphone", 1000, "Gadget");
        Product car = new Product("Tesla", 10000, "Car");

        inventoryService.addProduct(phone);
        inventoryService.addProduct(car);

        List<Product> productsByPrice = inventoryService.filterByPrice(999, 1001);
        Assertions.assertTrue(productsByPrice.contains(phone));
    }
}
