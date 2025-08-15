package com.example.keyacosmetic.Shamanta.DeliveryStaff;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

import java.net.URL;
import java.util.ResourceBundle;

public class DeliveryStatusController implements Initializable {

    @FXML
    private ComboBox<String> deliveryDropdown;

    @FXML
    private ComboBox<String> statusDropdown;

    @FXML
    private Button updateStatusBtn;

    // Constructor
    public DeliveryStatusController() {
        // Initialization if needed
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Placeholder: Load deliveries (replace with actual data)
        ObservableList<String> deliveries = FXCollections.observableArrayList("P001 - Alice Smith", "P002 - Bob Johnson", "P003 - Charlie Lee");
        deliveryDropdown.setItems(deliveries);

        // Delivery status options
        ObservableList<String> statuses = FXCollections.observableArrayList("Pending", "Picked Up", "In Transit", "Delivered", "Failed");
        statusDropdown.setItems(statuses);
    }

    @FXML
    private void updatestatusOA() {
        String selectedDelivery = deliveryDropdown.getValue();
        String selectedStatus = statusDropdown.getValue();

        // Validation
        if (selectedDelivery == null || selectedDelivery.trim().isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Validation Error", "Please select a delivery.");
            return;
        }

        if (selectedStatus == null || selectedStatus.trim().isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Validation Error", "Please select a status.");
            return;
        }

        // Placeholder: implement logic to update status in database/system
        showAlert(Alert.AlertType.INFORMATION, "Status Updated",
                "Delivery: " + selectedDelivery + "\nUpdated Status: " + selectedStatus);

        // Optionally reset dropdowns
        deliveryDropdown.getSelectionModel().clearSelection();
        statusDropdown.getSelectionModel().clearSelection();
    }

    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    // Getters and Setters
    public ComboBox<String> getDeliveryDropdown() { return deliveryDropdown; }
    public void setDeliveryDropdown(ComboBox<String> deliveryDropdown) { this.deliveryDropdown = deliveryDropdown; }

    public ComboBox<String> getStatusDropdown() { return statusDropdown; }
    public void setStatusDropdown(ComboBox<String> statusDropdown) { this.statusDropdown = statusDropdown; }

    public Button getUpdateStatusBtn() { return updateStatusBtn; }
    public void setUpdateStatusBtn(Button updateStatusBtn) { this.updateStatusBtn = updateStatusBtn; }
}
