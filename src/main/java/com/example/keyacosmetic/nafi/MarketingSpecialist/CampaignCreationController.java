package nafi.MarketingSpecialist;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class CampaignCreationController
{
    @javafx.fxml.FXML
    private TextField TargetGroupTextField;
    @javafx.fxml.FXML
    private TextField campaignNameTextField;
    @javafx.fxml.FXML
    private TextArea descriptionTextArea;
    @javafx.fxml.FXML
    private DatePicker EndDateDatePicker1;
    @javafx.fxml.FXML
    private DatePicker startDateDatePicker;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void saveButtonOnAction(ActionEvent actionEvent) {
        String targetGroup = TargetGroupTextField.getText().trim();
        String campaignName = campaignNameTextField.getText().trim();
        String description = descriptionTextArea.getText().trim();
        LocalDate startDate = startDateDatePicker.getValue();
        LocalDate endDate = EndDateDatePicker1.getValue();

}