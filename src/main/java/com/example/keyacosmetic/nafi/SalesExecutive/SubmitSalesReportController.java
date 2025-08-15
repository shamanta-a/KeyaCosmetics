package nafi.SalesExecutive;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

import static javafx.application.ConditionalFeature.FXML;

public class SubmitSalesReportController
{
    @javafx.fxml.FXML
    private Button invoicesButtonOnAction;
    @javafx.fxml.FXML
    private Button submitStatusbuttonOnAction;
    @javafx.fxml.FXML
    private Label FileNameLabel;
    @javafx.fxml.FXML
    private TextArea isssuesTextArea;
    @javafx.fxml.FXML
    private Label submitstatus;
    @javafx.fxml.FXML
    private TextField unitSoldTextField;
    @javafx.fxml.FXML
    private TextField profitTextField;

    @javafx.fxml.FXML
    public void initialize() {
        void initialize() {
            // Optional: Initial setup code here
            FileNameLabel.setText("No file selected");
            submitstatus.setText("");
        }

        private void handleInvoicesButtonClick() {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Select Invoice File");
            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("PDF Files", "*.pdf"),
                    new FileChooser.ExtensionFilter("Excel Files", "*.xls", "*.xlsx"),
                    new FileChooser.ExtensionFilter("All Files", "*.*")
            );

            Stage stage = (Stage) invoicesButtonOnAction.getScene().getWindow();
            File file = fileChooser.showOpenDialog(stage);

            if (file != null) {
                FileNameLabel.setText(file.getName());
            } else {
                FileNameLabel.setText("No file selected");
            }

            private void handleSubmitStatusButtonClick() {
                String issues = isssuesTextArea.getText().trim();
                String unitSoldStr = unitSoldTextField.getText().trim();
                String profitStr = profitTextField.getText().trim();

                int unitSold = 0;
                double profit = 0.0;

                try {
                    if (!unitSoldStr.isEmpty()) {
                        unitSold = Integer.parseInt(unitSoldStr);
                    }
                    if (!profitStr.isEmpty()) {
                        profit = Double.parseDouble(profitStr);
                    }
                } catch (NumberFormatException e) {
                    submitstatus.setText("Invalid number format!");
                    return;
                }

                submitstatus.setText("Status submitted! Units Sold: " + unitSold + ", Profit: " + profit + "\nIssues: " + issues);
            }
        }
        }
    }}