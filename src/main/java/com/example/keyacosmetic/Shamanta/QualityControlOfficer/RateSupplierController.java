package com.example.keyacosmetic.Shamanta.QualityControlOfficer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class RateSupplierController implements Initializable {

    @FXML
    private ComboBox<String> supplierDropdown;

    @FXML
    private Slider ratingSlider;

    @FXML
    private TextArea commentsField;

    @FXML
    private Button submitRatingBtn;

    // Constructor
    public RateSupplierController() {
        // Any initialization logic if needed
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Populate supplier dropdown with example data (replace with real supplier list)
        ObservableList<String> suppliers = FXCollections.observableArrayList(
                "Supplier A", "Supplier B", "Supplier C"
        );
        supplierDropdown.setItems(suppliers);

        // Optional: Set default rating
        ratingSlider.setValue(5);
    }

    @FXML
    private void submitratingOA() {
        String selectedSupplier = supplierDropdown.getValue();
        double rating = ratingSlider.getValue();
        String comments = commentsField.getText();

        // Validation
        if (selectedSupplier == null || selectedSupplier.trim().isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Validation Error", "Please select a supplier.");
            return;
        }

        // Placeholder: Save rating logic
        showAlert(Alert.AlertType.INFORMATION, "Rating Submitted",
                "Supplier: " + selectedSupplier +
                        "\nRating: " + rating +
                        "\nComments: " + (comments.isEmpty() ? "None" : comments));

        // Optionally clear inputs after submission
        supplierDropdown.getSelectionModel().clearSelection();
        ratingSlider.setValue(5);
        commentsField.clear();
    }

    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    // Getters and Setters
    public ComboBox<String> getSupplierDropdown() { return supplierDropdown; }
    public void setSupplierDropdown(ComboBox<String> supplierDropdown) { this.supplierDropdown = supplierDropdown; }

    public Slider getRatingSlider() { return ratingSlider; }
    public void setRatingSlider(Slider ratingSlider) { this.ratingSlider = ratingSlider; }

    public TextArea getCommentsField() { return commentsField; }
    public void setCommentsField(TextArea commentsField) { this.commentsField = commentsField; }

    public Button getSubmitRatingBtn() { return submitRatingBtn; }
    public void setSubmitRatingBtn(Button submitRatingBtn) { this.submitRatingBtn = submitRatingBtn; }
}
