package com.example.keyacosmetic.Shamanta.DeliveryStaff;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class PickupPackageController implements Initializable {

    @FXML
    private TextField packageIdTF;

    @FXML
    private Button pickupBtn;


    public PickupPackageController() {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        pickupBtn.setOnAction(event -> markAsPickedUp());
    }

    private void markAsPickedUp() {
        String packageId = packageIdTF.getText();


        if (packageId == null || packageId.trim().isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Validation Error", "Please enter or scan the package ID.");
            return;
        }


        showAlert(Alert.AlertType.INFORMATION, "Success", "Package ID " + packageId + " marked as picked up.");


        packageIdTF.clear();
    }

    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }


    public TextField getPackageIdTF() { return packageIdTF; }
    public void setPackageIdTF(TextField packageIdTF) { this.packageIdTF = packageIdTF; }

    public Button getPickupBtn() { return pickupBtn; }
    public void setPickupBtn(Button pickupBtn) { this.pickupBtn = pickupBtn; }
}
