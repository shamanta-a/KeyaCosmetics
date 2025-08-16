package nafi.SalesExecutive;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ApplyPromoController
{
    @javafx.fxml.FXML
    private TextField promoCodeTextField;
    @javafx.fxml.FXML
    private Label discountStatus;
    @javafx.fxml.FXML
    private Label finalPrice;
    @javafx.fxml.FXML
    private Label appliedDiscount;

    @javafx.fxml.FXML
    public void initialize() {
        discountStatus.setText("");
        appliedDiscount.setText("No discount applied");
        finalPrice.setText("Total Price: $" + String.format("%.2f", basePrice));

    }

    @javafx.fxml.FXML
    public void ApplyButtonOnAction(ActionEvent actionEvent) {
        String promoCode = promoCodeTextField.getText().trim().toUpperCase();
        double discountPercent = 0;

        switch (promoCode) {
            case "PROMO10":
                discountPercent = 10;
                break;
            case "PROMO20":
                discountPercent = 20;
                break;
            default:
                discountStatus.setText("Invalid promo code!");
                appliedDiscount.setText("No discount applied");
                finalPrice.setText("Total Price: $" + String.format("%.2f", basePrice));
                return;
            double discountAmount = (discountPercent / 100) * basePrice;
            double newPrice = basePrice - discountAmount;

            discountStatus.setText("Promo code applied successfully!");
            appliedDiscount.setText("Discount: " + discountPercent + "% ($" + String.format("%.2f", discountAmount) + ")");
            finalPrice.setText("Total Price: $" + String.format("%.2f", newPrice));
        }
    }

}