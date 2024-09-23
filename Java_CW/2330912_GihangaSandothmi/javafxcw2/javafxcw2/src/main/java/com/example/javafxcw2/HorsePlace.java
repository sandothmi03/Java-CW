package com.example.javafxcw2;

import javafx.scene.image.Image;

import java.time.LocalTime;

public class HorsePlace
{
    private Integer place;
    private Integer HorseId;
    private String HorseName;
    private String HorseGroup;
    private Image HorsePicture;
    private LocalTime time;

    public HorsePlace(Integer place, Integer horseId, String horseName, String horseGroup, Image horsePicture, LocalTime time) {
        this.place = place;
        this.HorseId = horseId;
        this.HorseName = horseName;
        this.HorseGroup = horseGroup;
        this.HorsePicture = horsePicture;
        this.time = time;
    }

    public Integer getPlace() {
        return place;
    }

    public void setPlace(Integer place) {
        this.place = place;
    }

    public Integer getHorseId() {
        return HorseId;
    }

    public void setHorseId(Integer horseId) {
        HorseId = horseId;
    }

    public String getHorseName() {
        return HorseName;
    }

    public void setHorseName(String horseName) {
        HorseName = horseName;
    }

    public String getHorseGroup() {
        return HorseGroup;
    }

    public void setHorseGroup(String horseGroup) {
        HorseGroup = horseGroup;
    }

    public Image getHorsePicture() {
        return HorsePicture;
    }

    public void setHorsePicture(Image horsePicture) {
        HorsePicture = horsePicture;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
}
