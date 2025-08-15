package nafi.MarketingSpecialist;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.time.LocalDate;

public class SocialMediaSchedulerController
{
    @javafx.fxml.FXML
    private ImageView postImage;
    @javafx.fxml.FXML
    private TextArea postContent;
    @javafx.fxml.FXML
    private DatePicker scheduleDatePicker;
    @javafx.fxml.FXML
    private ComboBox platformselectorsComboBox;
    @javafx.fxml.FXML
    private ImageView postImageView;
    @javafx.fxml.FXML
    private Label status;

    @javafx.fxml.FXML
    public void initialize() {
        platformselectorsComboBox.getItems().addAll("Facebook", "Instagram", "Twitter", "LinkedIn");
    }

    @javafx.fxml.FXML
    public void uploadImageOnAction(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Post Image");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg", "*.gif")
        );

        Stage stage = (Stage) postImage.getScene().getWindow();
        File file = fileChooser.showOpenDialog(stage);
    }

    @javafx.fxml.FXML
    public void QueuePostButtonOnAction(ActionEvent actionEvent) {
        String content = postContent.getText().trim();
        String platform = platformselectorsComboBox.getValue();
        LocalDate date = scheduleDatePicker.getValue();

        if (content.isEmpty()) {
            status.setText("Please enter post content.");
            return;
        }
        if (platform == null) {
            status.setText("Please select a platform.");
            return;
        }
        if (date == null) {
            status.setText("Please select a schedule date.");
            return;
        }
        if (selectedImageFile == null) {
            status.setText("Please upload an image.");
            return;
        }
    }

}