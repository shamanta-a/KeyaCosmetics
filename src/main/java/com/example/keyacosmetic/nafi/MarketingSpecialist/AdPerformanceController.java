package nafi.MarketingSpecialist;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class AdPerformanceController
{
    @javafx.fxml.FXML
    private Label revenue;
    @javafx.fxml.FXML
    private Label totalSpend;
    @javafx.fxml.FXML
    private ComboBox platformSelectorComboBox;
    @javafx.fxml.FXML
    private ComboBox campaignSelectorComboBox;
    @javafx.fxml.FXML
    private Label status;

    @javafx.fxml.FXML
    public void initialize() {
        platformSelectorComboBox.getItems().addAll("Facebook", "Instagram", "Google Ads", "LinkedIn");
        campaignSelectorComboBox.getItems().addAll("Winter Sale", "Summer Promo", "Festive Campaign");

        public void markReviewButtonOnAction(ActionEvent actionEvent) {
            String platform = platformSelectorComboBox.getValue();
            String campaign = campaignSelectorComboBox.getValue();

            if (platform == null || platform.isEmpty()) {
                showAlert("Error", "Please select an ad platform.");
                return;
            }

            if (campaign == null || campaign.isEmpty()) {
                showAlert("Error", "Please select a campaign.");
                return;
            }
