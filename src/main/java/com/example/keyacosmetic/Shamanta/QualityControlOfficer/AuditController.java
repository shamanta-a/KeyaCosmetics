package com.example.keyacosmetic.Shamanta.QualityControlOfficer;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

import java.net.URL;
import java.util.ResourceBundle;

public class AuditController implements Initializable {

    // FXML components
    @FXML
    private Button scanLocationBtn;

    @FXML
    private TextArea checklistArea;

    @FXML
    private Button submitAuditBtn;

    // Constructor
    public AuditController() {
        // Any necessary initialization can go here
    }

    // Initialize method called after FXML is loaded
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Optional: Setup any initial state or listeners
        checklistArea.setWrapText(true); // example: wrap text in the checklist area
    }

    // Method to handle scanning location (QR/GPS)
    @FXML
    private void ScanOA() {
        // Placeholder logic: implement QR/GPS scanning
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Scan Location");
        alert.setHeaderText(null);
        alert.setContentText("Scanning location... (QR/GPS logic to be implemented)");
        alert.showAndWait();
    }

    // Method to handle submitting the audit
    @FXML
    private void submitOA() {
        String checklistText = checklistArea.getText();

        // Validation: ensure checklist is not empty
        if (checklistText == null || checklistText.trim().isEmpty()) {
            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Validation Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill in the audit checklist before submitting.");
            alert.showAndWait();
            return;
        }

        // Placeholder: Save audit data logic here
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Audit Submitted");
        alert.setHeaderText(null);
        alert.setContentText("Audit checklist submitted successfully!");
        alert.showAndWait();

        // Optionally clear checklist after submission
        checklistArea.clear();
    }

    // Getters and Setters (if needed)
    public Button getScanLocationBtn() {
        return scanLocationBtn;
    }

    public void setScanLocationBtn(Button scanLocationBtn) {
        this.scanLocationBtn = scanLocationBtn;
    }

    public TextArea getChecklistArea() {
        return checklistArea;
    }

    public void setChecklistArea(TextArea checklistArea) {
        this.checklistArea = checklistArea;
    }

    public Button getSubmitAuditBtn() {
        return submitAuditBtn;
    }

    public void setSubmitAuditBtn(Button submitAuditBtn) {
        this.submitAuditBtn = submitAuditBtn;
    }
}
