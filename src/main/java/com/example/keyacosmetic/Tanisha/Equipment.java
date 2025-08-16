package org.example.final_project_summer;

import java.time.LocalDate;

public class Equipment {
    private String name;
    private LocalDate lastMaintenance;

    public Equipment(String name, LocalDate lastMaintenance) {
        this.name = name;
        this.lastMaintenance = lastMaintenance;
    }
    public String getName() { return name; }
    public LocalDate getLastMaintenance() { return lastMaintenance; }
}

