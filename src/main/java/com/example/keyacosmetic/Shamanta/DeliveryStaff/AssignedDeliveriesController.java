package com.example.keyacosmetic.Shamanta.DeliveryStaff;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class AssignedDeliveriesController implements Initializable {

    @FXML
    private TableView<DeliveryRecord> deliveriesTable;

    @FXML
    private TableColumn<DeliveryRecord, String> parcelidTC;

    @FXML
    private TableColumn<DeliveryRecord, String> CustomerNameTC;

    @FXML
    private TableColumn<DeliveryRecord, String> AddressTC;

    @FXML
    private TableColumn<DeliveryRecord, String> ParcelStatusTC;

    @FXML
    private Button refreshBtn;

    // Constructor
    public AssignedDeliveriesController() {
        // Initialization if needed
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Initialize table columns
        parcelidTC.setCellValueFactory(new PropertyValueFactory<>("parcelId"));
        CustomerNameTC.setCellValueFactory(new PropertyValueFactory<>("customerName"));
        AddressTC.setCellValueFactory(new PropertyValueFactory<>("address"));
        ParcelStatusTC.setCellValueFactory(new PropertyValueFactory<>("parcelStatus"));

        // Load initial data
        loadDeliveryData();
    }

    @FXML
    private void RefreshOA() {
        // Placeholder: refresh the delivery data
        loadDeliveryData();
        showAlert(Alert.AlertType.INFORMATION, "Refreshed", "Delivery data refreshed successfully!");
    }

    private void loadDeliveryData() {
        // Placeholder: replace with actual data fetching logic
        ObservableList<DeliveryRecord> data = FXCollections.observableArrayList();
        data.add(new DeliveryRecord("P001", "Alice Smith", "123 Main St", "Pending"));
        data.add(new DeliveryRecord("P002", "Bob Johnson", "456 Oak Ave", "Picked Up"));
        data.add(new DeliveryRecord("P003", "Charlie Lee", "789 Pine Rd", "Delivered"));

        deliveriesTable.setItems(data);
    }

    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    // Inner class representing a delivery record
    public static class DeliveryRecord {
        private final String parcelId;
        private final String customerName;
        private final String address;
        private final String parcelStatus;

        public DeliveryRecord(String parcelId, String customerName, String address, String parcelStatus) {
            this.parcelId = parcelId;
            this.customerName = customerName;
            this.address = address;
            this.parcelStatus = parcelStatus;
        }

        public String getParcelId() { return parcelId; }
        public String getCustomerName() { return customerName; }
        public String getAddress() { return address; }
        public String getParcelStatus() { return parcelStatus; }
    }

    // Getters and Setters
    public TableView<DeliveryRecord> getDeliveriesTable() { return deliveriesTable; }
    public void setDeliveriesTable(TableView<DeliveryRecord> deliveriesTable) { this.deliveriesTable = deliveriesTable; }

    public Button getRefreshBtn() { return refreshBtn; }
    public void setRefreshBtn(Button refreshBtn) { this.refreshBtn = refreshBtn; }
}
