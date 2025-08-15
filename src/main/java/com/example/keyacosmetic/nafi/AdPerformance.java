public class AdPerformance {
    private String platform;
    private String campaignName;
    private double spend;
    private double revenue;
    private double cpc;

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public double getSpend() {
        return spend;
    }

    public void setSpend(double spend) {
        this.spend = spend;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public double getCpc() {
        return cpc;
    }

    public void setCpc(double cpc) {
        this.cpc = cpc;
    }


    public AdPerformance(String platform, String campaignName, double spend, double revenue, double cpc) {
        this.platform = platform;
        this.campaignName = campaignName;
        this.spend = spend;
        this.revenue = revenue;
        this.cpc = cpc;


    }
}
