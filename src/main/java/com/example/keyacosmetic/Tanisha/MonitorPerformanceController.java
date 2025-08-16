package org.example.final_project_summer;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MonitorPerformanceController {

    @FXML
    private Label analyticsDashboardLabel;

    @FXML
    private void handleFetchAnalytics() {
        // Stub logic
        analyticsDashboardLabel.setText("Sales: " + ((int)(100 + Math.random() * 900)) +
                ", Customer Feedback: Positive");
    }
}