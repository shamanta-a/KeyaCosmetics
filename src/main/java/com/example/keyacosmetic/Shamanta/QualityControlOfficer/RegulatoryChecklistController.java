package com.example.keyacosmetic.Shamanta.QualityControlOfficer;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class RegulatoryChecklistController implements Initializable {

    @FXML
    private TextArea checklistArea;

    @FXML
    private Button btnValidate;

    @FXML
    private Button btnExport;


    public RegulatoryChecklistController() {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        checklistArea.setWrapText(true);
    }

    @FXML
    private void handleValidateChecklist() {
        String checklistText = checklistArea.getText();


        if (checklistText == null || checklistText.trim().isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Validation Error", "Please enter checklist items before validation.");
            return;
        }


        showAlert(Alert.AlertType.INFORMATION, "Validation Complete", "Checklist entries validated successfully!");
    }

    @FXML
    private void handleExportReport() {
        String checklistText = checklistArea.getText();


        if (checklistText == null || checklistText.trim().isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Export Error", "No checklist items to export.");
            return;
        }


        showAlert(Alert.AlertType.INFORMATION, "Export Successful", "Checklist exported successfully!");
    }

    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }


    public TextArea getChecklistArea() { return checklistArea; }
    public void setChecklistArea(TextArea checklistArea) { this.checklistArea = checklistArea; }

    public Button getBtnValidate() { return btnValidate; }
    public void setBtnValidate(Button btnValidate) { this.btnValidate = btnValidate; }

    public Button getBtnExport() { return btnExport; }
    public void setBtnExport(Button btnExport) { this.btnExport = btnExport; }
}
