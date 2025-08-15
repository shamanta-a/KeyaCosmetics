package com.example.keyacosmetic.Shamanta.DeliveryStaff;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class DeliveryVerificationController implements Initializable {

    @FXML
    private TextField otpField;

    @FXML
    private Button verifyOtpBtn;

    // Placeholder OTP for demonstration purposes
    private final String VALID_OTP = "123456";

    // Constructor
    public DeliveryVerificationController() {
        // Any initialization if needed
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        otpField.clear();
    }

    @FXML
    private void VerifyOA() {
        String enteredOtp = otpField.getText();

        // Validation
        if (enteredOtp == null || enteredOtp.trim().isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Validation Error", "Please enter the OTP.");
            return;
        }

        // Placeholder: actual OTP verification logic should be implemented here
        if (enteredOtp.equals(VALID_OTP)) {
            showAlert(Alert.AlertType.INFORMATION, "Verification Successful", "OTP verified successfully!");
        } else {
            showAlert(Alert.AlertType.ERROR, "Verification Failed", "Invalid OTP. Please try again.");
        }

        // Optionally clear the OTP field after verification
        otpField.clear();
    }

    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    // Getters and Setters
    public TextField getOtpField() { return otpField; }
    public void setOtpField(TextField otpField) { this.otpField = otpField; }

    public Button getVerifyOtpBtn() { return verifyOtpBtn; }
    public void setVerifyOtpBtn(Button verifyOtpBtn) { this.verifyOtpBtn = verifyOtpBtn; }
}
