package org.example.final_project_summer;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;

import java.time.LocalDate;

public class ProductionDeadlineController {

    @FXML
    private DatePicker deliveryDatePicker;

    @FXML
    private Label deadlineWarningLabel;

    @FXML
    public void initialize() {
        // Optional: initialization logic
    }

    @FXML
    public void handleCheckDeadline(ActionEvent actionEvent) {
        LocalDate deliveryDate = deliveryDatePicker.getValue();
        if (deliveryDate == null) deliveryDate = LocalDate.now().plusDays(5);

        // Stub logic
        LocalDate scheduleEnd = LocalDate.now().plusDays(3);

        if (scheduleEnd.isAfter(deliveryDate)) {
            deadlineWarningLabel.setText("Warning: Production may be delayed!");
        } else {
            deadlineWarningLabel.setText("On schedule. No delays expected.");
        }
    }
}
