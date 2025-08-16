package org.example.final_project_summer;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.event.ActionEvent;

public class ApproveMarketingController {

    @FXML
    private TextArea marketingTextField;

    @FXML
    private Label approvalStatusLabel;

    @FXML
    public void initialize() {
        // Optional: initialization logic
    }

    @FXML
    public void handleValidateMarketing(ActionEvent actionEvent) {
        String text = marketingTextField.getText();

        // Stub logic
        if (text.isEmpty()) {
            approvalStatusLabel.setText("No marketing text provided.");
        } else {
            approvalStatusLabel.setText("Marketing material approved!");
        }
    }
}
