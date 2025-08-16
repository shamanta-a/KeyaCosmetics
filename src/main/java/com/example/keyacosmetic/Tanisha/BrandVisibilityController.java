package org.example.final_project_summer;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;

public class BrandVisibilityController {

    @FXML
    private Label reachLabel;

    @FXML
    public void initialize() {
        // Optional: initialization logic
    }

    @FXML
    public void handleDetectTag(ActionEvent actionEvent) {
        // Set the label when the button is clicked
        reachLabel.setText("Detected influencer tag. Reach: " + ((int)(1000 + Math.random() * 4000)));
    }

    @FXML
    public void handleLandingPageClicks(ActionEvent actionEvent) {
        // TODO: add landing page clicks logic
    }
}
