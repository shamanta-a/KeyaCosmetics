package nafi.SalesExecutive;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CustomerPreferencesController
{
    @javafx.fxml.FXML
    private TextField CustomerNameTextField;
    @javafx.fxml.FXML
    private TextField CustomerIdTextField;
    @javafx.fxml.FXML
    private TextArea prefencesTextArea;
    @javafx.fxml.FXML
    private Label StatusMessage;

    @javafx.fxml.FXML
    public void initialize() {
        StatusMessage.setText("");
    }

    @javafx.fxml.FXML
    public void SaveButtonOnAction(ActionEvent actionEvent) {
        void SaveButtonOnAction(ActionEvent actionEvent) {
            String customerId = CustomerIdTextField.getText().trim();
            String customerName = CustomerNameTextField.getText().trim();
            String preferences = prefencesTextArea.getText().trim();

            if (customerId.isEmpty() || customerName.isEmpty() || preferences.isEmpty()) {
                StatusMessage.setText("Please fill all fields before saving.");
                return;
            }

            System.out.println("Saving to CRM: " + customerId + ", " + customerName + ", " + preferences);

            StatusMessage.setText("Customer preferences saved successfully!");
        }
    }
}