package org.example.final_project_summer;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class ControlCostsController {

    @FXML
    private TextField materialCostField;

    @FXML
    private Label remainingBudgetLabel;

    @FXML
    private TextField laborCostField;

    private Budget budget = new Budget(10000); // example starting budget

    @FXML
    public void initialize() {
        // Optional: initialization logic
    }

    @FXML
    public void handleCalculateBudget(ActionEvent actionEvent) {
        double labor = laborCostField.getText().isEmpty() ? 0 : Double.parseDouble(laborCostField.getText());
        double material = materialCostField.getText().isEmpty() ? 0 : Double.parseDouble(materialCostField.getText());

        budget.addExpense(labor + material);

        remainingBudgetLabel.setText("Remaining budget: " + budget.getRemaining());
    }
}

