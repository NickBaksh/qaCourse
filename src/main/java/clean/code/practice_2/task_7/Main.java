package clean.code.practice_2.task_7;

public class Main {
    public static void main(String[] args) {

        Order flexOrder = new Order.Builder()
                .setDiscountType("fix = $100")
                .setProductName("Laptop")
                .setPaymentType("Card")
                .build();

        System.out.println(flexOrder);
    }
}
