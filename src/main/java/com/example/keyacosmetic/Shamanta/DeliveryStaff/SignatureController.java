package com.example.keyacosmetic.Shamanta.DeliveryStaff;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class SignatureController implements Initializable {

    @FXML
    private Canvas signatureCanvas;

    @FXML
    private Button submitSignatureBtn;

    private GraphicsContext gc;

    // Constructor
    public SignatureController() {
        // Initialization if needed
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        gc = signatureCanvas.getGraphicsContext2D();
        clearCanvas();

        // Enable drawing on canvas
        signatureCanvas.addEventHandler(MouseEvent.MOUSE_PRESSED, this::startDraw);
        signatureCanvas.addEventHandler(MouseEvent.MOUSE_DRAGGED, this::draw);

        // Set submit button action
        submitSignatureBtn.setOnAction(event -> submitSignature());
    }

    private void startDraw(MouseEvent e) {
        gc.beginPath();
        gc.moveTo(e.getX(), e.getY());
        gc.stroke();
    }

    private void draw(MouseEvent e) {
        gc.lineTo(e.getX(), e.getY());
        gc.stroke();
    }

    private void submitSignature() {
        // Placeholder: implement saving or processing signature image
        showAlert(Alert.AlertType.INFORMATION, "Signature Submitted", "Digital signature captured successfully!");

        // Clear the canvas after submission if needed
        clearCanvas();
    }

    private void clearCanvas() {
        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, signatureCanvas.getWidth(), signatureCanvas.getHeight());
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(2);
    }

    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    // Getters and Setters
    public Canvas getSignatureCanvas() { return signatureCanvas; }
    public void setSignatureCanvas(Canvas signatureCanvas) { this.signatureCanvas = signatureCanvas; }

    public Button getSubmitSignatureBtn() { return submitSignatureBtn; }
    public void setSubmitSignatureBtn(Button submitSignatureBtn) { this.submitSignatureBtn = submitSignatureBtn; }
}
