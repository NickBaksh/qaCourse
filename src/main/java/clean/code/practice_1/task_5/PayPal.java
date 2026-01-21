package clean.code.practice_1.task_5;

public class PayPal extends PaymentService {

    public PayPal(double amount) {
        super(amount);
    }

    @Override
    public void payment() {
        System.out.println("Оплата через PayPal на сумму " + getAmount());
    }
}
