package clean.code.practice_1.task_5;

public class CreditCard extends PaymentService {

    public CreditCard(double amount) {
        super(amount);
    }

    @Override
    public void payment() {
        System.out.println("Оплата кредитной картой на сумму " + getAmount());
    }
}
