package clean.code.practice_1.task_2;

public class DiscountCalculator {
    public double calculateDiscount(double price, boolean isLoyalCustomer, boolean isFirstPurchase, boolean hasCoupon) {
        if (isLoyalCustomer && isFirstPurchase) {
            return price * 0.90;
        }
        else if (isLoyalCustomer) {
            return price * 0.95;
        } else if (hasCoupon) {
            return price * 0.93;
        } else {
            return price * 0.98;
        }
    }
}
