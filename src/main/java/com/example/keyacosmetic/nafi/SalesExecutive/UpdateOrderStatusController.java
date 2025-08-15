package nafi.SalesExecutive;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class UpdateOrderStatusController
{
    @javafx.fxml.FXML
    private TextField orderIdTextField;
    @javafx.fxml.FXML
    private ComboBox statusComboBox;
    @javafx.fxml.FXML
    private Label OrderDetails;
    @javafx.fxml.FXML
    private Label orderUpdated;

    @FXML
    public void initialize() {
        statusComboBox.getItems().addAll("Pending", "Shipped", "Delivered", "Cancelled");
        orderIdTextField.textProperty().addListener((observable, oldValue, newValue) -> {
            try {
                int orderId = Integer.parseInt(newValue);
                equals(orderId);
                orderUpdated.setVisible(false); // Hide message on new input
            } catch (NumberFormatException e) {
                OrderDetails.setText("Please enter a valid Order ID.");
            }
        });

        public void SaveChangesButtonOnAction(ActionEvent ) {
            try {
                int orderId = Integer.parseInt(orderIdTextField.getText());
                String newStatus = statusComboBox.getSelectionModel().getSelectedItem();

                if (newStatus == null) {
                    OrderDetails.setText("Please select a new status.");
                    return;
                }




   


}