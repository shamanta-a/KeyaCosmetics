import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class CollaborationBoardController
{
    @javafx.fxml.FXML
    private TableColumn TaskIdTableColumn;
    @javafx.fxml.FXML
    private TableColumn StatusTableColumn;
    @javafx.fxml.FXML
    private TableView taskTableView;
    @javafx.fxml.FXML
    private ComboBox assignedUserComboBox;
    @javafx.fxml.FXML
    private TextField taskTitleTextField;
    @javafx.fxml.FXML
    private TableColumn AssignedToTableColumn;
    @javafx.fxml.FXML
    private TextArea textDetails;
    @javafx.fxml.FXML
    private Label taskStatus;

    @javafx.fxml.FXML
    public void initialize() {
        TaskIdTableColumn.setCellValueFactory(new PropertyValueFactory<>("taskId"));
        StatusTableColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        AssignedToTableColumn.setCellValueFactory(new PropertyValueFactory<>("assignedTo"));
    }

    @javafx.fxml.FXML
    public void createTaskButtonOnAction(ActionEvent actionEvent) {
        String title = taskTitleTextField.getText();
        String details = textDetails.getText();
        String assignedTo = assignedUserComboBox.getValue();

        if (title.isEmpty() || details.isEmpty() || assignedTo == null) {
            taskStatus.setText("⚠ Please fill in all fields.");
            return;
    }
}