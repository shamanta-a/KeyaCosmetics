package nafi.SalesExecutive;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class GenerateInvoicesController
{
    @javafx.fxml.FXML
    private TableColumn CompletedOrdersTableColumn;
    @javafx.fxml.FXML
    private Label pricingDetails;
    @javafx.fxml.FXML
    private TableView CompletedOrdersTableView;

    @javafx.fxml.FXML
    public void initialize() {
        CompletedOrdersTableColumn.setCellValueFactory(new PropertyValueFactory<>("orderId"));

    }

    @javafx.fxml.FXML
    public void GenerateInvoiceButtonOnAction(ActionEvent actionEvent) {
       completedOrder selectedOrder = CompletedOrdersTableView.getSelectionModel().getSelectedItem();
        if (selectedOrder == null) {
            pricingDetails.setText("Please select an order to generate invoice.");
            return;
        }
        pricingDetails.setText("Invoice generated for Order: " + selectedOrder.getOrderId());
    }


}

    @javafx.fxml.FXML
    public void DownloadButtonOnAction(ActionEvent actionEvent) {
    }


    @javafx.fxml.FXML
    public void PrintButtonOnAction(ActionEvent actionEvent) {
        public void PrintButtonOnAction(ActionEvent actionEvent) {
            CompletedOrder selectedOrder = CompletedOrdersTableView.getSelectionModel().getSelectedItem();
            if (selectedOrder == null) {
                pricingDetails.setText("Please select an order to print.");
                return;
            }
    }
}

public void main() {
}