public class returnRequest {
        private String returnId;
        private String orderId;
        private String customerName;
        private String reason;
        private String status;

    public String getReturnId() {
        return returnId;
    }

    public void setReturnId(String returnId) {
        this.returnId = returnId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;}

    public returnRequest(String returnId, String orderId, String customerName, String reason, String status) {
        this.returnId = returnId;
        this.orderId = orderId;
        this.customerName = customerName;
        this.reason = reason;
        this.status = status;


    }
}
