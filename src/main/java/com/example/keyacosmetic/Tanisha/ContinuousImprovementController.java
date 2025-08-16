package org.example.final_project_summer;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.event.ActionEvent;

import java.util.ArrayList;
import java.util.List;

public class ContinuousImprovementController {

    @FXML
    private Label suggestionsDashboardLabel;

    @FXML
    private TextArea suggestionField;

    private List<String> suggestions = new ArrayList<>(); // <-- added

    @FXML
    public void initialize() {
        // Optional: initialization logic
    }

    @FXML
    public void handleCheckSuggestions(ActionEvent actionEvent) {
        String suggestion = suggestionField.getText();
        if (!suggestion.isEmpty()) suggestions.add(suggestion);

        // Stub logic
        suggestionsDashboardLabel.setText("Suggestions: " + String.join(", ", suggestions));
    }
}

