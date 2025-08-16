package com.example.keyacosmetic.Shamanta.QualityControlOfficer;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class UploadSOPController implements Initializable {

    @FXML
    private TextField versionNoteField;

    @FXML
    private Button chooseSOPFileBtn;

    @FXML
    private Button uploadCompareBtn;

    private File selectedFile;


    public UploadSOPController() {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void handleChooseSOPFile() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Choose SOP File");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("PDF Files", "*.pdf"),
                new FileChooser.ExtensionFilter("Word Documents", "*.docx")
        );

        Stage stage = (Stage) chooseSOPFileBtn.getScene().getWindow();
        selectedFile = fileChooser.showOpenDialog(stage);

        if (selectedFile != null) {
            versionNoteField.setText("Selected: " + selectedFile.getName());
        }
    }

    @FXML
    private void handleUploadSOP() {
        String versionNote = versionNoteField.getText();


        if (selectedFile == null) {
            showAlert(Alert.AlertType.WARNING, "Validation Error", "Please choose a SOP file before uploading.");
            return;
        }

        if (!selectedFile.getName().endsWith(".pdf") && !selectedFile.getName().endsWith(".docx")) {
            showAlert(Alert.AlertType.WARNING, "Validation Error", "Only PDF or DOCX files are allowed.");
            return;
        }

        if (versionNote == null || versionNote.trim().isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Validation Error", "Please enter a version note.");
            return;
        }


        showAlert(Alert.AlertType.INFORMATION, "Upload Successful",
                "SOP file uploaded successfully!\nFile: " + selectedFile.getName() + "\nVersion Note: " + versionNote);


        versionNoteField.clear();
        selectedFile = null;
    }

    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    
    public TextField getVersionNoteField() { return versionNoteField; }
    public void setVersionNoteField(TextField versionNoteField) { this.versionNoteField = versionNoteField; }

    public Button getChooseSOPFileBtn() { return chooseSOPFileBtn; }
    public void setChooseSOPFileBtn(Button chooseSOPFileBtn) { this.chooseSOPFileBtn = chooseSOPFileBtn; }

    public Button getUploadCompareBtn() { return uploadCompareBtn; }
    public void setUploadCompareBtn(Button uploadCompareBtn) { this.uploadCompareBtn = uploadCompareBtn; }
}
