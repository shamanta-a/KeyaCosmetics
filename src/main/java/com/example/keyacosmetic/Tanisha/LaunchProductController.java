package org.example.final_project_summer;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;

import java.util.ArrayList;
import java.util.List;

public class LaunchProductController {

    @FXML
    private TextField productNameField;

    @FXML
    private TextField ingredientsField;

    @FXML
    private TextField priceField;

    @FXML
    private Label confirmationLabel;

    private List<Product> products = new ArrayList<>(); // <-- added

    @FXML
    public void initialize() {
        // Optional: initialization logic
    }

    @FXML
    public void handleCreateProduct(ActionEvent actionEvent) {
        String name = productNameField.getText();
        String ingredients = ingredientsField.getText();
        String price = priceField.getText();

        Product product = new Product("P" + (products.size() + 1), name);
        products.add(product);

        // Stub logic
        confirmationLabel.setText("Product " + product.getName() + " created with ingredients: " + ingredients +
                " and price: " + price);
    }
}

