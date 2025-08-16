package com.example.keyacosmetic.Shamanta.DeliveryStaff;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

import java.awt.Desktop;
import java.net.URI;
import java.net.URL;
import java.util.ResourceBundle;

public class NavigationAssistanceController implements Initializable {

    @FXML
    private ComboBox<String> deliverySelector;

    @FXML
    private Button getDirectionsBtn;


    public NavigationAssistanceController() {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        ObservableList<String> deliveries = FXCollections.observableArrayList(
                "P001 - Alice Smith - 123 Main St",
                "P002 - Bob Johnson - 456 Oak Ave",
                "P003 - Charlie Lee - 789 Pine Rd"
        );
        deliverySelector.setItems(deliveries);
    }

    @FXML
    private void directionOA() {
        String selectedDelivery = deliverySelector.getValue();

        if (selectedDelivery == null || selectedDelivery.trim().isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Validation Error", "Please select a delivery.");
            return;
        }


        String[] parts = selectedDelivery.split(" - ");
        if (parts.length < 3) {
            showAlert(Alert.AlertType.ERROR, "Error", "Invalid delivery format.");
            return;
        }
        String address = parts[2];

        try {

            String mapUrl = "https://www.google.com/maps/dir/?api=1&destination=" + address.replace(" ", "+");
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().browse(new URI(mapUrl));
            } else {
                showAlert(Alert.AlertType.INFORMATION, "Directions", "Map URL: " + mapUrl);
            }
        } catch (Exception e) {
            e.printStackTrace();
            showAlert(Alert.AlertType.ERROR, "Error", "Unable to open map directions.");
        }
    }

    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }


    public ComboBox<String> getDeliverySelector() { return deliverySelector; }
    public void setDeliverySelector(ComboBox<String> deliverySelector) { this.deliverySelector = deliverySelector; }

    public Button getGetDirectionsBtn() { return getDirectionsBtn; }
    public void setGetDirectionsBtn(Button getDirectionsBtn) { this.getDirectionsBtn = getDirectionsBtn; }
}
