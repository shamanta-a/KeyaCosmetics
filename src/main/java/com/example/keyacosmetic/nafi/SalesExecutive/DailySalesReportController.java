package nafi.SalesExecutive;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.LocalDate;

public class DailySalesReportController
{
    @javafx.fxml.FXML
    private Label unitssold;
    @javafx.fxml.FXML
    private Label revenue;
    @javafx.fxml.FXML
    private DatePicker EndDatePicker;
    @javafx.fxml.FXML
    private DatePicker startDatePicker;
    @javafx.fxml.FXML
    private Label tofalOrders;

    @javafx.fxml.FXML
    public void initialize() {
        startDatePicker.setValue(LocalDate.now());
        EndDatePicker.setValue(LocalDate.now());
    }

    @javafx.fxml.FXML
    public void ExportExcelButtonOnActionj(ActionEvent actionEvent) {
        void GenerateReportButtonOnAction (ActionEvent actionEvent)LocalDate endDate;
        LocalDate startDate;
        {
            startDate = startDatePicker.getValue();
            endDate = EndDatePicker.getValue();

        }
        if (startDate == null || endDate == null) {

            System.err.println("Please select both a start and an end date.");
            return;
        }
        if (endDate.isBefore(startDate)) {

            System.err.println("End date cannot be before start date.");
            return;
        }
        @javafx.fxml.FXML
        (ActionEvent actionEvent){
            System.out.println("Exporting report to Excel...")
        }


        @javafx.fxml.FXML
        public void ExportPdfButtonOnAction (ActionEvent actionEvent){
            System.out.println("Exporting report to PDF...");
        }

    }