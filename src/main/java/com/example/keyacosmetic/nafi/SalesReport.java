import java.time.LocalDate;

public class SalesReport {
    private String reportId;
    private int unitsSold;
    private double profit;
    private String issues;
    private LocalDate date;

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public int getUnitsSold() {
        return unitsSold;
    }

    public void setUnitsSold(int unitsSold) {
        this.unitsSold = unitsSold;
    }

    public String getIssues() {
        return issues;
    }

    public void setIssues(String issues) {
        this.issues = issues;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public SalesReport(String reportId, int unitsSold, double profit, String issues, LocalDate date) {
        this.reportId = reportId;
        this.unitsSold = unitsSold;
        this.profit = profit;
        this.issues = issues;
        this.date = date;

    }
}
