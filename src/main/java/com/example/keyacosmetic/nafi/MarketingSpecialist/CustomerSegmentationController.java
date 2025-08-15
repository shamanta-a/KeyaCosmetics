package nafi.MarketingSpecialist;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CustomerSegmentationController
{
    @javafx.fxml.FXML
    private TextField LocationTextField;
    @javafx.fxml.FXML
    private TextField ageRangeTextField;
    @javafx.fxml.FXML
    private ComboBox assignToCampaingnsComboBox;
    @javafx.fxml.FXML
    private TextField groupNameTextField;
    @javafx.fxml.FXML
    private TextField behaviorTextField;
    @javafx.fxml.FXML
    private Label status;

    @javafx.fxml.FXML
    public void initialize() {
        assignToCampaingnsComboBox.getItems().addAll("Campaign 1", "Campaign 2", "Campaign 3");
    }

    @javafx.fxml.FXML
    public void createSegmentButtonOnAction(ActionEvent actionEvent) {
        String groupName = groupNameTextField.getText();
        String ageRange = ageRangeTextField.getText();
        String location = LocationTextField.getText();
        String behavior = behaviorTextField.getText();
        String campaign = assignToCampaingnsComboBox.getValue();
        if (groupName.isEmpty() || ageRange.isEmpty() || location.isEmpty() || behavior.isEmpty() || campaign == null) {
            status.setText("⚠ Please fill in all fields.");
            return;

            status.setText("✅ Segment \"" + groupName + "\" created successfully!");
        }
        }
    }

}