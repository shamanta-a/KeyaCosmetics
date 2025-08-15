package nafi.MarketingSpecialist;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class PushNotificationController
{
    @javafx.fxml.FXML
    private TextField titleTextField;
    @javafx.fxml.FXML
    private ComboBox audienceSelectorComboBox;
    @javafx.fxml.FXML
    private TextField time;
    @javafx.fxml.FXML
    private DatePicker sheduleDatePicker;
    @javafx.fxml.FXML
    private TextArea audienceSelector;

    @javafx.fxml.FXML
    public void initialize() {
        audienceSelectorComboBox.getItems().addAll(
                "All Customers",
                "Premium Members",
                "Inactive Customers",
                "New Sign-ups"
        );
    }

    @javafx.fxml.FXML
    public void scheduleButtonOnAction(ActionEvent actionEvent) {

        String title = titleTextField.getText().trim();
        String content = audienceSelector.getText().trim();
        String audience = audienceSelectorComboBox.getValue();

        if (title.isEmpty()) {
            showAlert("Error", "Please enter a notification title.", Alert.AlertType.ERROR);
            return;
        }
        if (content.isEmpty()) {
            showAlert("Error", "Please enter the notification content.", Alert.AlertType.ERROR);
            return;
        }
        if (audience == null || audience.isEmpty()) {
            showAlert("Error", "Please select a target audience.", Alert.AlertType.ERROR);
            return;
        }
    }

    private void showAlert(String error, String s, Alert.AlertType alertType) {

    }

    @javafx.fxml.FXML
    public void sendNowButtonOnAction(ActionEvent actionEvent) {
        String title = titleTextField.getText().trim();
        String content = audienceSelector.getText().trim();
        String audience = audienceSelectorComboBox.getValue();
        LocalDate date = sheduleDatePicker.getValue();
        String timeStr = time.getText().trim();
    }
}