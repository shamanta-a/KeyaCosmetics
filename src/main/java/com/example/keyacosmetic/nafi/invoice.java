public class invoice {
    private String invoiceId;
    private String orderId;
    private double amount;
    private double tax;
    private double discount;
    private String generatedDate;

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getGeneratedDate() {
        return generatedDate;
    }

    public void setGeneratedDate(String generatedDate) {
        this.generatedDate = generatedDate;
    }

    public invoice(String invoiceId, String orderId, double amount, double tax, double discount, String generatedDate) {
        this.invoiceId = invoiceId;
        this.orderId = orderId;
        this.amount = amount;
        this.tax = tax;
        this.discount = discount;
        this.generatedDate = generatedDate;


    }
}
