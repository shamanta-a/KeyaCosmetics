package nafi.MarketingSpecialist;

import com.sun.javafx.binding.DoubleConstant;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class SeasonalOffersController
{
    @javafx.fxml.FXML
    private DatePicker offerStartyDatePicker;
    @javafx.fxml.FXML
    private TextField productsListTextField;
    @javafx.fxml.FXML
    private TextField discountTextField;
    @javafx.fxml.FXML
    private ComboBox offerTemplateComboBox;
    @javafx.fxml.FXML
    private DatePicker offerEndDatePicker;
    private DatePicker offerStartDatePicker;

    @javafx.fxml.FXML
    public void initialize() {
        offerTemplateComboBox.getItems().addAll(
                "Winter Sale",
                "Summer Splash",
                "Festive Offer",
                "New Year Special"
        );
    }

    @javafx.fxml.FXML
    public void TheOfferButtonOnAction(ActionEvent actionEvent) {
        String template = offerTemplateComboBox.getValue();
        String products = productsListTextField.getText().trim();
        String discountStr = discountTextField.getText().trim();
        LocalDate startDate = offerStartDatePicker.getValue();
        LocalDate endDate = offerEndDatePicker.getValue();

        if (template == null || template.isEmpty()) {
            showAlert("Please select an offer template.");
            return;
        }
        if (products.isEmpty()) {
            showAlert("Please enter the products list.");
            return;
        }
        if (discountStr.isEmpty()) {
            showAlert("Please enter a discount percentage.");
            return;
        }
        double discount;
        try {
            discount = Double.parseDouble(discountStr);
            if (discount <= 0 || discount > 100) {
                showAlert("Discount must be between 1% and 100%.");
                return;
            }
        } catch (NumberFormatException e) {
            showAlert("Invalid discount value. Please enter a number.");
            return;
        }
        if (startDate == null || endDate == null) {
            showAlert("Please select both start and end dates.");
            return;
        }
        if (endDate.isBefore(startDate)) {
            showAlert("End date cannot be before start date.");
            return;
        }

        showAlert("Offer launched successfully!\n" +
                "Template: " + template +
                "\nProducts: " + products +
                "\nDiscount: " + discount + "%" +
                "\nFrom: " + startDate +
                "\nTo: " + endDate);
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Seasonal Offer");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
