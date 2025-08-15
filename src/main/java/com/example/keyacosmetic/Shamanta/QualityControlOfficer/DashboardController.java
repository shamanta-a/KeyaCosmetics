package com.example.keyacosmetic.Shamanta.QualityControlOfficer;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {

    // FXML buttons
    @FXML
    private Button btnComplianceCheck;

    @FXML
    private Button btnUploadTestResults;

    @FXML
    private Button btnDefectAnalysis;

    @FXML
    private Button btnUploadSOP;

    @FXML
    private Button btnRateSupplier;

    @FXML
    private Button btnScheduleTraining;

    @FXML
    private Button btnAudit;

    @FXML
    private Button btnRegulatoryChecklist;

    // Constructor
    public DashboardController() {
        // Any initialization logic if needed
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Optional: add button hover effects, disable buttons initially, etc.
    }


    @FXML
    private void handleComplianceCheck() {
        showInfo("Compliance Check", "Starting compliance check workflow...");
        // TODO: Navigate to compliance check screen
    }

    @FXML
    private void handleUploadTestResults() {
        showInfo("Upload Test Results", "Opening test result upload workflow...");
        // TODO: Navigate to test result upload screen
    }

    @FXML
    private void handleDefectAnalysis() {
        showInfo("Defect Analysis", "Opening defect analysis workflow...");
        // TODO: Navigate to defect analysis screen
    }

    @FXML
    private void handleUploadSOP() {
        showInfo("Upload SOP Document", "Opening SOP document upload workflow...");
        // TODO: Navigate to SOP upload screen
    }

    @FXML
    private void handleRateSupplier() {
        showInfo("Rate Supplier", "Opening supplier rating workflow...");
        // TODO: Navigate to supplier rating screen
    }

    @FXML
    private void handleScheduleTraining() {
        showInfo("Schedule Training", "Opening training schedule workflow...");
        // TODO: Navigate to training schedule screen
    }

    @FXML
    private void handleAudit() {
        showInfo("Start Audit", "Opening audit workflow...");
        // TODO: Navigate to AuditController screen
    }

    @FXML
    private void handleRegulatoryChecklist() {
        showInfo("Regulatory Checklist", "Opening regulatory checklist workflow...");
        // TODO: Navigate to regulatory checklist screen
    }

    // Utility method to show information alerts
    private void showInfo(String title, String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    // Getters and Setters
    public Button getBtnComplianceCheck() { return btnComplianceCheck; }
    public void setBtnComplianceCheck(Button btnComplianceCheck) { this.btnComplianceCheck = btnComplianceCheck; }

    public Button getBtnUploadTestResults() { return btnUploadTestResults; }
    public void setBtnUploadTestResults(Button btnUploadTestResults) { this.btnUploadTestResults = btnUploadTestResults; }

    public Button getBtnDefectAnalysis() { return btnDefectAnalysis; }
    public void setBtnDefectAnalysis(Button btnDefectAnalysis) { this.btnDefectAnalysis = btnDefectAnalysis; }

    public Button getBtnUploadSOP() { return btnUploadSOP; }
    public void setBtnUploadSOP(Button btnUploadSOP) { this.btnUploadSOP = btnUploadSOP; }

    public Button getBtnRateSupplier() { return btnRateSupplier; }
    public void setBtnRateSupplier(Button btnRateSupplier) { this.btnRateSupplier = btnRateSupplier; }

    public Button getBtnScheduleTraining() { return btnScheduleTraining; }
    public void setBtnScheduleTraining(Button btnScheduleTraining) { this.btnScheduleTraining = btnScheduleTraining; }

    public Button getBtnAudit() { return btnAudit; }
    public void setBtnAudit(Button btnAudit) { this.btnAudit = btnAudit; }

    public Button getBtnRegulatoryChecklist() { return btnRegulatoryChecklist; }
    public void setBtnRegulatoryChecklist(Button btnRegulatoryChecklist) { this.btnRegulatoryChecklist = btnRegulatoryChecklist; }
}
