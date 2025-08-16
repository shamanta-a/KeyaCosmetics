package org.example.final_project_summer;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class PricingStrategyController {

    @FXML
    private ComboBox<String> productComboBox; // specify type

    @FXML
    private Label recommendedPriceLabel;

    @FXML
    private TextField priceTierField;

    @FXML
    public void initialize() {
        // Optional: initialization logic
    }

    @FXML
    public void handlePricingRecommendation(ActionEvent actionEvent) {
        String product = productComboBox.getValue();
        String tier = priceTierField.getText();

        if (product == null) product = "Sample Product";
        if (tier.isEmpty()) tier = "Standard";

        // Stub logic
        recommendedPriceLabel.setText("Recommended price for " + product + " at tier " + tier + ": " +
                ((int)(50 + Math.random() * 50)) + " BDT");
    }
}

