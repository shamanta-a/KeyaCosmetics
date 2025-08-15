import javafx.beans.property.StringProperty;

public class order {
    private final StringProperty orderId;
    private final StringProperty customerName;
    private final StringProperty orderDate;
    private final StringProperty status;

    public String getOrderId() {
        return orderId.get();
    }

    public StringProperty orderIdProperty() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName.get();
    }

    public StringProperty customerNameProperty() {
        return customerName;
    }

    public String getOrderDate() {
        return orderDate.get();
    }

    public StringProperty orderDateProperty() {
        return orderDate;
    }

    public String getStatus() {
        return status.get();
    }

    public StringProperty statusProperty() {
        return status;
    }

    @Override
    public String toString() {
        return "order{" +
                "orderId=" + orderId +
                ", customerName=" + customerName +
                ", orderDate=" + orderDate +
                ", status=" + status +
                '}';
    }

    public order(StringProperty orderDate, StringProperty status, StringProperty orderId, StringProperty customerName) {
        this.orderDate = orderDate;
        this.status = status;
        this.orderId = orderId;
        this.customerName = customerName;



    }
}
