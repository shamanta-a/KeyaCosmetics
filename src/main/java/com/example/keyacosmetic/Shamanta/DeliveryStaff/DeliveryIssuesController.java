package com.example.keyacosmetic.Shamanta.DeliveryStaff;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class DeliveryIssuesController implements Initializable {

    @FXML
    private TextArea issueField;

    @FXML
    private Button attachPhotoBtn;

    @FXML
    private Button submitReportBtn;

    private File attachedPhoto;


    public DeliveryIssuesController() {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        issueField.setWrapText(true);
    }

    @FXML
    private void attachphotoOA() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Attach Photo");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg")
        );

        Stage stage = (Stage) attachPhotoBtn.getScene().getWindow();
        attachedPhoto = fileChooser.showOpenDialog(stage);

        if (attachedPhoto != null) {
            showAlert(Alert.AlertType.INFORMATION, "Photo Attached", "Attached photo: " + attachedPhoto.getName());
        }
    }

    @FXML
    private void submitreportOA() {
        String issueText = issueField.getText();


        if (issueText == null || issueText.trim().isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Validation Error", "Please describe the issue before submitting.");
            return;
        }


        String photoInfo = (attachedPhoto != null) ? attachedPhoto.getName() : "No photo attached";
        showAlert(Alert.AlertType.INFORMATION, "Report Submitted",
                "Issue submitted successfully!\nIssue: " + issueText + "\nPhoto: " + photoInfo);


        issueField.clear();
        attachedPhoto = null;
    }

    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }


    public TextArea getIssueField() { return issueField; }
    public void setIssueField(TextArea issueField) { this.issueField = issueField; }

    public Button getAttachPhotoBtn() { return attachPhotoBtn; }
    public void setAttachPhotoBtn(Button attachPhotoBtn) { this.attachPhotoBtn = attachPhotoBtn; }

    public Button getSubmitReportBtn() { return submitReportBtn; }
    public void setSubmitReportBtn(Button submitReportBtn) { this.submitReportBtn = submitReportBtn; }

    public File getAttachedPhoto() { return attachedPhoto; }
    public void setAttachedPhoto(File attachedPhoto) { this.attachedPhoto = attachedPhoto; }
}
