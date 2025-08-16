package org.example.final_project_summer;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.time.LocalDate;

public class ScheduleProductionController {

    @FXML
    private Label scheduleLabel;

    @FXML
    private TextField productIdField;

    @FXML
    private Label scheduleProduction;

    @FXML
    private TextField quantityField;

    @FXML
    public void initialize() {
        // Optional: initialization logic
    }

    @FXML
    public void handleCheckAvailability(ActionEvent actionEvent) {
        String productId = productIdField.getText();
        String quantityText = quantityField.getText();
        int quantity = quantityText.isEmpty() ? 0 : Integer.parseInt(quantityText);

        // Stub logic
        Product product = new Product(productId, "Sample Product");
        ProductionSchedule schedule = new ProductionSchedule(product, quantity, LocalDate.now().plusDays(1));

        scheduleLabel.setText("Scheduled " + schedule.getQuantity() + " units of " + product.getName() +
                " on " + schedule.getScheduledDate());
    }
}
