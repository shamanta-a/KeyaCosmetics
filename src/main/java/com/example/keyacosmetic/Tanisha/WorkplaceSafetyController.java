package org.example.final_project_summer;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.event.ActionEvent;

public class WorkplaceSafetyController {

    @FXML
    private Label complianceLabel;

    @FXML
    private TextArea incidentReportField;

    @FXML
    public void initialize() {
        // Optional: initialization logic
    }

    @FXML
    public void handleValidateChecklist(ActionEvent actionEvent) {
        String report = incidentReportField.getText();
        SafetyIncident incident = new SafetyIncident(report);

        // Stub logic
        complianceLabel.setText("Safety compliance: " + (int)(50 + Math.random() * 50) + "%");
    }
}
