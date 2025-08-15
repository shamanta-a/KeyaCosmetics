package nafi.MarketingSpecialist;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;


public class CampaignAnalyticsController
{
    @javafx.fxml.FXML
    private Label reach;
    @javafx.fxml.FXML
    private ComboBox campaignSelectorComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        campaignSelectorComboBox.getItems().addAll(
                "Winter Sale",
                "Summer Special",
                "Festive Campaign"
        );
    }


    @javafx.fxml.FXML
    public void ExportButtonOnAction(ActionEvent actionEvent) {
        String selectedCampaign = campaignSelectorComboBox.getValue();

        if (selectedCampaign == null || selectedCampaign.isEmpty()) {
            showAlert("Error", "Please select a campaign to export.");
            return;
    }
}

    private void showAlert(String error, String s) {
        String selectedCampaign;
        showAlert("Exported", "Analytics for \"" + selectedCampaign + "\" exported successfully!");

    }