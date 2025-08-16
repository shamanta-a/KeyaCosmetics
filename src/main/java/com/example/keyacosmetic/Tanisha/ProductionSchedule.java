package org.example.final_project_summer;

import java.time.LocalDate;

public class ProductionSchedule {
    private Product product;
    private int quantity;
    private LocalDate scheduledDate;

    public ProductionSchedule(Product product, int quantity, LocalDate scheduledDate) {
        this.product = product;
        this.quantity = quantity;
        this.scheduledDate = scheduledDate;
    }

    public Product getProduct() { return product; }
    public int getQuantity() { return quantity; }
    public LocalDate getScheduledDate() { return scheduledDate; }
}

