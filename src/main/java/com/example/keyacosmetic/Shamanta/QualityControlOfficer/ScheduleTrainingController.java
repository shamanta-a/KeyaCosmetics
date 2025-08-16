package com.example.keyacosmetic.Shamanta.QualityControlOfficer;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class ScheduleTrainingController implements Initializable {

    @FXML
    private DatePicker trainingDate;

    @FXML
    private TextField topicField;

    @FXML
    private TextField trainerField;

    @FXML
    private Button scheduleBtn;


    public ScheduleTrainingController() {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        trainingDate.setValue(LocalDate.now());
    }

    @FXML
    private void scheduleOA() {
        LocalDate date = trainingDate.getValue();
        String topic = topicField.getText();
        String trainer = trainerField.getText();


        if (date == null) {
            showAlert(Alert.AlertType.WARNING, "Validation Error", "Please select a training date.");
            return;
        }
        if (topic == null || topic.trim().isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Validation Error", "Please enter the training topic.");
            return;
        }
        if (trainer == null || trainer.trim().isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Validation Error", "Please enter the trainer's name.");
            return;
        }


        showAlert(Alert.AlertType.INFORMATION, "Training Scheduled",
                "Training scheduled successfully!\n" +
                        "Date: " + date + "\n" +
                        "Topic: " + topic + "\n" +
                        "Trainer: " + trainer);


        trainingDate.setValue(LocalDate.now());
        topicField.clear();
        trainerField.clear();
    }

    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }


    public DatePicker getTrainingDate() { return trainingDate; }
    public void setTrainingDate(DatePicker trainingDate) { this.trainingDate = trainingDate; }

    public TextField getTopicField() { return topicField; }
    public void setTopicField(TextField topicField) { this.topicField = topicField; }

    public TextField getTrainerField() { return trainerField; }
    public void setTrainerField(TextField trainerField) { this.trainerField = trainerField; }

    public Button getScheduleBtn() { return scheduleBtn; }
    public void setScheduleBtn(Button scheduleBtn) { this.scheduleBtn = scheduleBtn; }
}
