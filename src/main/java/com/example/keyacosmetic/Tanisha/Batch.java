package org.example.final_project_summer;

public class Batch {
    private String batchId;
    private double qualityScore;

    public Batch(String batchId, double qualityScore) {
        this.batchId = batchId;
        this.qualityScore = qualityScore;
    }
    public String getBatchId() { return batchId; }
    public double getQualityScore() { return qualityScore; }
}