package com.example.keyacosmetic.Shamanta.QualityControlOfficer;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.time.LocalDate;

public class TestResultController {

    @FXML
    private TextField batchIdField;

    @FXML
    private TextField testTypeField;

    @FXML
    private DatePicker testDate;

    @FXML
    private Button chooseFileBtn;

    @FXML
    private Button uploadBtn;

    @FXML
    private Label statusLabel; // Optional: You can add a label to show status messages

    private File selectedFile;

    // Constructor
    public TestResultController() {
        // Initialization if needed
    }

    // Initialize method
    @FXML
    public void initialize() {
        chooseFileBtn.setOnAction(event -> handleFileChoose());
        uploadBtn.setOnAction(event -> handleUpload());
    }

    // Getters
    public String getBatchId() {
        return batchIdField.getText();
    }

    public String getTestType() {
        return testTypeField.getText();
    }

    public LocalDate getTestDate() {
        return testDate.getValue();
    }

    public File getSelectedFile() {
        return selectedFile;
    }


    private boolean validateInputs() {
        if (getBatchId().isEmpty()) {
            statusLabel.setText("Batch ID is required.");
            return false;
        }

        if (getTestType().isEmpty()) {
            statusLabel.setText("Test Type is required.");
            return false;
        }

        if (getTestDate() == null) {
            statusLabel.setText("Test Date is required.");
            return false;
        }

        if (getTestDate().isAfter(LocalDate.now())) {
            statusLabel.setText("Test Date cannot be in the future.");
            return false;
        }

        if (selectedFile == null) {
            statusLabel.setText("Please choose a file to upload.");
            return false;
        }

        return true;
    }


    @FXML
    private void handleFileChoose() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Test Result File");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("PDF Files", "*.pdf"),
                new FileChooser.ExtensionFilter("Excel Files", "*.xlsx"),
                new FileChooser.ExtensionFilter("Word Files", "*.docx")
        );

        Stage stage = (Stage) chooseFileBtn.getScene().getWindow();
        selectedFile = fileChooser.showOpenDialog(stage);

        if (selectedFile != null) {
            statusLabel.setText("Selected file: " + selectedFile.getName());
        }
    }

    @FXML
    private void handleUpload() {
        if (validateInputs()) {

            statusLabel.setText("File uploaded successfully! Batch ID: " + getBatchId() +
                    ", Test Type: " + getTestType() +
                    ", Date: " + getTestDate() +
                    ", File: " + selectedFile.getName());
            clearForm();
        }
    }

    private void clearForm() {
        batchIdField.clear();
        testTypeField.clear();
        testDate.setValue(null);
        selectedFile = null;
        statusLabel.setText("No file selected.");
    }
}
