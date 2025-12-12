package practice_13_1.Task_5;

public class Main {
    public static void main(String[] args) {
        InventoryService inventoryService = new InventoryService();

        Product car = new Product("Car", 10000.0, "Transport");
        Product bus = new Product("Bus", 50000.0, "Transport");
        Product phone = new Product("Pixel", 1000.0, "Gadgets");

        inventoryService.addProduct(bus);
        inventoryService.addProduct(car);
        inventoryService.addProduct(phone);
        System.out.println(inventoryService.getAll());

        inventoryService.setInventoryOpen(false);
        inventoryService.addProduct(bus);

        //Забираем первый продукт с категорией транспорт
        System.out.println(inventoryService.getProductByCategory("Transport"));

        //Фильтруем map по категории Транспорт, остается только продукт Car
        System.out.println(inventoryService.filterByCategory("Transport"));

        //Фильтруем map по стоимости продукта, в диапазон попадает телефон и машина
        System.out.println(inventoryService.filterByPrice(1000.0, 12000.0));

        //Возвращаем список всех оставшихся продуктов
        System.out.println(inventoryService.getAll());

        //Проверка срабатывания исключения OutOfStockException
        //System.out.println(inventoryService.getProductByCategory("Drinks"));
    }
}
