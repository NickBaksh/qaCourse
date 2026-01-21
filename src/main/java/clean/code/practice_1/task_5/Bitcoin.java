package clean.code.practice_1.task_5;

public class Bitcoin extends PaymentService {

    public Bitcoin(double amount) {
        super(amount);
    }

    @Override
    public void payment() {
        System.out.println("Оплата Bitcoin на сумму " + getAmount());
    }
}
