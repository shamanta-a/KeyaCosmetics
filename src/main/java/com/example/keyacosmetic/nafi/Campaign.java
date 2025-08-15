import java.time.LocalDate;

public class Campaign {
    private String campaignId;
    private String name;
    private String targetGroup;
    private LocalDate startDate;
    private LocalDate endDate;
    private String status;

    public String getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTargetGroup() {
        return targetGroup;
    }

    public void setTargetGroup(String targetGroup) {
        this.targetGroup = targetGroup;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Campaign(String campaignId, String name, LocalDate startDate, String targetGroup, LocalDate endDate, String status) {
        this.campaignId = campaignId;
        this.name = name;
        this.startDate = startDate;
        this.targetGroup = targetGroup;
        this.endDate = endDate;
        this.status = status;

    }

    @Override
    public String toString() {
        return "Campaign{" +
                "campaignId='" + campaignId + '\'' +
                ", name='" + name + '\'' +
                ", targetGroup='" + targetGroup + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", status='" + status + '\'' +
                '}';
    }
}
