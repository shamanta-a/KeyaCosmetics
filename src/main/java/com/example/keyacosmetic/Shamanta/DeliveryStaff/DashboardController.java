package com.example.keyacosmetic.Shamanta.DeliveryStaff;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardController {

    @FXML
    private Button btnMyDeliveries, btnPickupPackage, btnDeliveryStatus, btnSignature,
            btnReportIssue, btnNavigation, btnSummaryReport, btnVerifyOtp;


    public DashboardController() {

    }


    private void openScene(String fxmlFile, String title) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            AnchorPane root = loader.load();
            Stage stage = new Stage();
            stage.setTitle(title);
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleMyDeliveries(ActionEvent event) {
        openScene("/com/example/keyacosmetic/Shamanta/DeliveryStaff/MyDeliveries.fxml", "My Deliveries");
    }

    @FXML
    private void handlePickupPackage(ActionEvent event) {
        openScene("/com/example/keyacosmetic/Shamanta/DeliveryStaff/PickupPackage.fxml", "Pickup Package");
    }

    @FXML
    private void handleDeliveryStatus(ActionEvent event) {
        openScene("/com/example/keyacosmetic/Shamanta/DeliveryStaff/DeliveryStatus.fxml", "Change Delivery Status");
    }

    @FXML
    private void handleSignature(ActionEvent event) {
        openScene("/com/example/keyacosmetic/Shamanta/DeliveryStaff/CaptureSignature.fxml", "Capture Signature");
    }

    @FXML
    private void handleReportIssue(ActionEvent event) {
        openScene("/com/example/keyacosmetic/Shamanta/DeliveryStaff/ReportIssue.fxml", "Report Delivery Issue");
    }

    @FXML
    private void handleNavigation(ActionEvent event) {
        openScene("/com/example/keyacosmetic/Shamanta/DeliveryStaff/NavigationAssistance.fxml", "Navigation Assistance");
    }

    @FXML
    private void handleSummaryReport(ActionEvent event) {
        openScene("/com/example/keyacosmetic/Shamanta/DeliveryStaff/DailySummaryReport.fxml", "Daily Summary Report");
    }

    @FXML
    private void handleVerifyOtp(ActionEvent event) {
        openScene("/com/example/keyacosmetic/Shamanta/DeliveryStaff/VerifyOtp.fxml", "Verify Delivery with OTP");
    }


    public Button getBtnMyDeliveries() { return btnMyDeliveries; }
    public void setBtnMyDeliveries(Button btnMyDeliveries) { this.btnMyDeliveries = btnMyDeliveries; }

    public Button getBtnPickupPackage() { return btnPickupPackage; }
    public void setBtnPickupPackage(Button btnPickupPackage) { this.btnPickupPackage = btnPickupPackage; }

    public Button getBtnDeliveryStatus() { return btnDeliveryStatus; }
    public void setBtnDeliveryStatus(Button btnDeliveryStatus) { this.btnDeliveryStatus = btnDeliveryStatus; }

    public Button getBtnSignature() { return btnSignature; }
    public void setBtnSignature(Button btnSignature) { this.btnSignature = btnSignature; }

    public Button getBtnReportIssue() { return btnReportIssue; }
    public void setBtnReportIssue(Button btnReportIssue) { this.btnReportIssue = btnReportIssue; }

    public Button getBtnNavigation() { return btnNavigation; }
    public void setBtnNavigation(Button btnNavigation) { this.btnNavigation = btnNavigation; }

    public Button getBtnSummaryReport() { return btnSummaryReport; }
    public void setBtnSummaryReport(Button btnSummaryReport) { this.btnSummaryReport = btnSummaryReport; }

    public Button getBtnVerifyOtp() { return btnVerifyOtp; }
    public void setBtnVerifyOtp(Button btnVerifyOtp) { this.btnVerifyOtp = btnVerifyOtp; }
}
