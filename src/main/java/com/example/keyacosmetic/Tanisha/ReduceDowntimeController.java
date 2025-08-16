package org.example.final_project_summer;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;

public class ReduceDowntimeController {

    @FXML
    private ComboBox<?> equipmentComboBox; // Replace ? with actual type if known

    @FXML
    private Label nextMaintenanceLabel;

    @FXML
    public void initialize() {
        // Optional: initialization logic
    }

    @FXML
    public void handleFetchMaintenance(ActionEvent actionEvent) {
        // TODO: add maintenance fetching logic
    }
}
