package org.example.final_project_summer;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class MaintainQualityController {

    @FXML
    private Label qualityLabel;

    @FXML
    private TextField batchIdField;

    @FXML
    public void initialize() {
        // Optional: initialization logic
    }

    @FXML
    public void handleCheckQuality(ActionEvent actionEvent) {
        String batchId = batchIdField.getText();

        // Stub logic
        Batch batch = new Batch(batchId, Math.random() * 100); // Random quality score
        qualityLabel.setText("Batch " + batch.getBatchId() + " quality score: " + String.format("%.2f", batch.getQualityScore()) + "%");
    }
}
