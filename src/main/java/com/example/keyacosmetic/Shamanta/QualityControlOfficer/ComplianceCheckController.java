package com.example.keyacosmetic.Shamanta.QualityControlOfficer;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ComplianceCheckController {

    @FXML
    private TextField dimensionField;

    @FXML
    private TextField weightField;

    @FXML
    private Button submitBtn;

    @FXML
    private Label summaryLabel;


    public ComplianceCheckController() {

    }


    @FXML
    public void initialize() {

        submitBtn.setOnAction(event -> handleSubmit());
    }


    public String getDimension() {
        return dimensionField.getText();
    }

    public String getWeight() {
        return weightField.getText();
    }


    private boolean validateInputs() {
        String dimension = getDimension();
        String weight = getWeight();


        if (dimension.isEmpty() || weight.isEmpty()) {
            summaryLabel.setText("Dimension and weight must not be empty.");
            return false;
        }

        try {
            Double.parseDouble(dimension);
            Double.parseDouble(weight);
        } catch (NumberFormatException e) {
            summaryLabel.setText("Dimension and weight must be valid numbers.");
            return false;
        }

        return true;
    }


    private void handleSubmit() {
        if (validateInputs()) {
            String dimension = getDimension();
            String weight = getWeight();
            summaryLabel.setText("Compliance Check Submitted: Dimension = " + dimension + ", Weight = " + weight);
        }
    }
}

