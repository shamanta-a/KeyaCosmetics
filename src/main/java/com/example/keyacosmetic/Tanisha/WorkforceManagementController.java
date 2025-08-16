package org.example.final_project_summer;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class WorkforceManagementController {

    @FXML
    private Label shiftSummaryLabel;

    @FXML
    private TextField workerIdField;

    @FXML
    private TextField shiftField;

    @FXML
    public void initialize() {
        // Optional: initialization logic
    }

    @FXML
    public void handleAssignShift(ActionEvent actionEvent) {
        String workerId = workerIdField.getText();
        String shift = shiftField.getText();
        Worker worker = new Worker(workerId, "General");

        // Stub logic
        shiftSummaryLabel.setText("Assigned worker " + worker.getId() + " to shift " + shift);
    }
}
