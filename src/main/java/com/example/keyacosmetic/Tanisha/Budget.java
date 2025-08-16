package org.example.final_project_summer;

public class Budget {
    private double totalBudget;
    private double spent;

    public Budget(double totalBudget) {
        this.totalBudget = totalBudget;
        this.spent = 0;
    }
    public double getRemaining() { return totalBudget - spent; }
    public void addExpense(double expense) { spent += expense; }
}
