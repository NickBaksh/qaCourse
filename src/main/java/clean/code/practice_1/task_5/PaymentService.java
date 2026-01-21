package clean.code.practice_1.task_5;

public abstract class PaymentService {
    private double amount;

    public PaymentService(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public abstract void payment();
}
