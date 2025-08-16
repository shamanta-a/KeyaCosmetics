package org.example.final_project_summer;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class ReduceReturnsController {

    @FXML
    private TextField returnRequestField;

    @FXML
    private Label repeatReturnFlagLabel;

    private List<String> repeatReturns = new ArrayList<>();

    @FXML
    private void handleReviewReturn() {
        String request = returnRequestField.getText();

        if (!request.isEmpty()) repeatReturns.add(request);

        // Stub logic
        repeatReturnFlagLabel.setText("Repeat returns flagged: " + repeatReturns.size());
    }
}

