package clean.code.practice_2.task_7;

public class Order {
    private String productName;
    private String discountType;
    private String paymentType;


    public Order(Builder builder) {
        this.productName = builder.productName;
        this.discountType = builder.discountType;
        this.paymentType = builder.paymentType;
    }

    @Override
    public String toString() {
        return STR."Order: product name \{productName}, discount type: \{discountType}, payment type: \{paymentType}";
    }

    public static class Builder {
        private String productName;
        private String discountType;
        private String paymentType;

        public Builder setProductName(String productName) {
            this.productName = productName;
            return this;
        }

        public Builder setDiscountType(String discountType) {
            this.discountType = discountType;
            return this;
        }

        public Builder setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
