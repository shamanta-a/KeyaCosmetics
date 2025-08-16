package org.example.final_project_summer;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;

import java.util.HashMap;
import java.util.Map;

public class EnhanceDesignController {

    @FXML
    private Label voteResultsLabel;

    // Store design votes
    private Map<String, Integer> designVotes = new HashMap<>();

    @FXML
    public void initialize() {
        // Optional: initialization logic
    }

    @FXML
    public void handleVoteDesign(ActionEvent actionEvent) {
        // TODO: add vote handling logic
    }

    @FXML
    public void handleUploadMockup(ActionEvent actionEvent) {
        // Simulate uploading a new design
        designVotes.put("Design " + (designVotes.size() + 1), 0);
        updateVoteLabel();
    }

    // Helper method to update the vote results label
    private void updateVoteLabel() {
        StringBuilder results = new StringBuilder("Votes: ");
        for (Map.Entry<String, Integer> entry : designVotes.entrySet()) {
            results.append(entry.getKey())
                    .append(" = ")
                    .append(entry.getValue())
                    .append("; ");
        }
        voteResultsLabel.setText(results.toString());
    }
}
