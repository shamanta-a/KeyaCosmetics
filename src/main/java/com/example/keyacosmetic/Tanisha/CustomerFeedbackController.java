package org.example.final_project_summer;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.util.ArrayList;
import java.util.List;

public class CustomerFeedbackController {

    @FXML
    private ComboBox<String> feedbackComboBox;

    @FXML
    private TextArea responseField;

    @FXML
    private Label responseConfirmationLabel;

    private List<String> feedbacks = new ArrayList<>();

    @FXML
    private void handleSendResponse() {
        String feedback = feedbackComboBox.getValue();
        String response = responseField.getText();

        if (feedback == null) feedback = "Sample feedback";

        // Stub logic
        feedbacks.add(feedback + " -> Response sent: " + response);
        responseConfirmationLabel.setText("Response sent to: " + feedback);
    }
}