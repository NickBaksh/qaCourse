package clean.code.practice_1.task_4;

public class OrderManager {
    private final EmailConfirmationSender emailConfirmationSender;
    private final InvoiceGenerator invoiceGenerator;
    private final OrderProcessor orderProcessor;

    public OrderManager(EmailConfirmationSender emailConfirmationSender,
                        InvoiceGenerator invoiceGenerator,
                        OrderProcessor orderProcessor) {
        this.emailConfirmationSender = emailConfirmationSender;
        this.invoiceGenerator = invoiceGenerator;
        this.orderProcessor = orderProcessor;
    }

    public void manageOrder() {
        orderProcessor.processOrder();
        invoiceGenerator.generateInvoice();
        emailConfirmationSender.sendEmailConfirmation();
    }
}
