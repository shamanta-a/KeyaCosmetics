package com.example.keyacosmetic.Shamanta.DeliveryStaff;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class SummaryReportController implements Initializable {

    @FXML
    private Button generateReportBtn;

    @FXML
    private TextArea summaryOutput;


    public SummaryReportController() {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        summaryOutput.setEditable(false);
        summaryOutput.clear();
    }

    @FXML
    private void ReportOA() {

        String summary = "Daily Delivery Summary Report\n";
        summary += "---------------------------------\n";
        summary += "Total Deliveries Assigned: 10\n";
        summary += "Successfully Delivered: 8\n";
        summary += "Failed/Problematic Deliveries: 2\n";
        summary += "Pickups Completed: 10\n";
        summary += "Signatures Captured: 8\n";
        summary += "Navigation Assistance Used: 5 times\n";

        summaryOutput.setText(summary);


        showAlert(Alert.AlertType.INFORMATION, "Report Generated", "Daily summary report generated successfully!");
    }

    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }


    public Button getGenerateReportBtn() { return generateReportBtn; }
    public void setGenerateReportBtn(Button generateReportBtn) { this.generateReportBtn = generateReportBtn; }

    public TextArea getSummaryOutput() { return summaryOutput; }
    public void setSummaryOutput(TextArea summaryOutput) { this.summaryOutput = summaryOutput; }
}
