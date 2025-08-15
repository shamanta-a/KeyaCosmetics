package com.example.keyacosmetic.Shamanta.QualityControlOfficer;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class DefectAnalysisController implements Initializable {

    @FXML
    private TextField batchRangeField;

    @FXML
    private Button analyzeBtn;

    @FXML
    private TableView<DefectRecord> defectTable;

    // Constructor
    public DefectAnalysisController() {
        // Any initialization if needed
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Initialize table columns
        TableColumn<DefectRecord, String> batchCol = new TableColumn<>("Batch");
        batchCol.setCellValueFactory(new PropertyValueFactory<>("batch"));

        TableColumn<DefectRecord, Integer> defectsCol = new TableColumn<>("Defect Count");
        defectsCol.setCellValueFactory(new PropertyValueFactory<>("defectCount"));

        TableColumn<DefectRecord, Double> defectRateCol = new TableColumn<>("Defect Rate (%)");
        defectRateCol.setCellValueFactory(new PropertyValueFactory<>("defectRate"));

        defectTable.getColumns().addAll(batchCol, defectsCol, defectRateCol);
    }

    @FXML
    private void analyzeOA() {
        String batchRange = batchRangeField.getText();


        if (batchRange == null || batchRange.trim().isEmpty()) {
            showAlert(Alert.AlertType.WARNING, "Validation Error", "Please enter a batch range to analyze.");
            return;
        }


        ObservableList<DefectRecord> data = FXCollections.observableArrayList();


        data.add(new DefectRecord("Batch 001", 5, 2.5));
        data.add(new DefectRecord("Batch 002", 3, 1.5));

        defectTable.setItems(data);

        showAlert(Alert.AlertType.INFORMATION, "Analysis Complete", "Defect analysis completed for batch range: " + batchRange);
    }

    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }


    public TextField getBatchRangeField() { return batchRangeField; }
    public void setBatchRangeField(TextField batchRangeField) { this.batchRangeField = batchRangeField; }

    public Button getAnalyzeBtn() { return analyzeBtn; }
    public void setAnalyzeBtn(Button analyzeBtn) { this.analyzeBtn = analyzeBtn; }

    public TableView<DefectRecord> getDefectTable() { return defectTable; }
    public void setDefectTable(TableView<DefectRecord> defectTable) { this.defectTable = defectTable; }


    public static class DefectRecord {
        private final String batch;
        private final int defectCount;
        private final double defectRate;

        public DefectRecord(String batch, int defectCount, double defectRate) {
            this.batch = batch;
            this.defectCount = defectCount;
            this.defectRate = defectRate;
        }

        public String getBatch() { return batch; }
        public int getDefectCount() { return defectCount; }
        public double getDefectRate() { return defectRate; }
    }
}
