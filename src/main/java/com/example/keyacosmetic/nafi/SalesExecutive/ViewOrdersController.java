package nafi.SalesExecutive;

import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class ViewOrdersController
{
    @javafx.fxml.FXML
    private TableColumn customerNameTableColumn;
    @javafx.fxml.FXML
    private TextField OrderIdTextFZield;
    @javafx.fxml.FXML
    private TableView OrderIDTableView;
    @javafx.fxml.FXML
    private TableColumn StatusTableColumn;
    @javafx.fxml.FXML
    private TextField customerNameTextField;
    @javafx.fxml.FXML
    private Label errorMessage;
    @javafx.fxml.FXML
    private TableColumn OrderIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn DateTableColumn;
    @javafx.fxml.FXML
    private ComboBox StatusFilterComboBox;
    @javafx.fxml.FXML
    private Button viewdetailsButtonOnAction;

    @javafx.fxml.FXML
    public void initialize() {
        OrderIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("orderId"));
        customerNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("customerName"));
        StatusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        DateTableColumn.setCellValueFactory(new PropertyValueFactory<>("date"));


        StatusFilterComboBox.getItems().addAll("All", "Pending", "Shipped", "Delivered");
        StatusFilterComboBox.getSelectionModel().selectFirst();


        viewdetailsButtonOnAction.setDisable(true);
        orderTableView.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            viewdetailsButtonOnAction.setDisable(newSelection == null);
        });
    }

    @FXML
    private void viewdetailsButtonOnAction() {
        Order selectedOrder = orderTableView.getSelectionModel().getSelectedItem();
        if (selectedOrder != null) {
            // Logic to show details of the selected order
            errorMessage.setText("Viewing details for Order ID: " + selectedOrder.getOrderId());
        } else {
            errorMessage.setText("Please select an order to view details.");
        }
    }
    }}