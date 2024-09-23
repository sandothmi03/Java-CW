package com.example.javafxcw2;

import java.time.LocalDate;

public class MajorRoundData {
    private LocalDate date;
    private String location;
    private String name;
    private int driverPosition ;
    private int driverPoints;

    public MajorRoundData(LocalDate date, String location, String name, int driverPosition, int driverPoints) {
        this.date = date;
        this.location = location;
        this.name = name;
        this.driverPosition = driverPosition;
        this.driverPoints = driverPoints;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDriverPosition() {
        return driverPosition;
    }

    public void setDriverPosition(int driverPosition) {
        this.driverPosition = driverPosition;
    }

    public int getDriverPoints() {
        return driverPoints;
    }

    public void setDriverPoints(int driverPoints) {
        this.driverPoints = driverPoints;
    }
}
